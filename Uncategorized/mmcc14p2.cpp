#include <iostream>
#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
int n,m,q,toprow,botrow; string ss[2005];
ll base,mod,hsh[2005][5005],p[5005];
struct RageNode{
  int idx=0,premx=0;
} rage[10005];
RageNode combine(RageNode a, RageNode b){
  RageNode ret;
  if(!a.idx||!b.idx) return a.idx ? a : b;
  int lo = 1, hi = min(a.premx,b.premx), ans = 0;
  while(lo<=hi){
    int mid = (lo+hi)/2;
    if(hsh[a.idx][mid]==hsh[b.idx][mid]){
      ans = mid;
      lo = mid+1;
    } else hi = mid-1;
  }
  ret.idx = a.idx;
  ret.premx = ans;
  return ret;
}
void build(int node, int s, int e){
  if(s==e){
    rage[node].idx = s;
    rage[node].premx = m;
  } else {
    int mid = (s+e)/2;
    build(node*2,s,mid);
    build(node*2+1,mid+1,e);
    rage[node] = combine(rage[node*2],rage[node*2+1]);
  }
}
RageNode query(int node, int s, int e, int l, int r){
  if(l>e||s>e||s>r){
    RageNode outofbounds;
    return outofbounds;
 }
  if(l<=s&&e<=r) return rage[node];
  int mid = (s+e)/2;
  return combine(query(node*2,s,mid,l,r),query(node*2+1,mid+1,e,l,r));
}
void update(int node, int s, int e, int row){
  if(s==e){
    rage[node].idx = row;
    rage[node].premx = m;
  } else {
    int mid = (s+e)/2;
    if(s<=row&&row<=mid) update(node*2,s,mid,row);
    else update(node*2+1,mid+1,e,row);
    rage[node] = combine(rage[node*2],rage[node*2+1]);
  }
}
int main(){
  cin.sync_with_stdio(0);
  cin.tie(0);
  cin>>n>>m;
  base = 131; mod = 1000000007;
  p[0]=1;
  for(int i = 1; i <= m; i++){
    p[i] = (p[i-1]*base)%mod;
  }
  for(int i = 1; i <= n; i++){
    cin>>ss[i];
    for(int j = 1; j <= m; j++){
      hsh[i][j] = (hsh[i][j-1] + p[j]*ss[i][j-1]) % mod;
    }
  }
  build(1,1,n);
  cin>>q;
  while(q--){
    cin>>toprow>>botrow;
    cout<<query(1,1,n,toprow,botrow).premx * (botrow-toprow+1)<<"\n";
    swap(hsh[toprow],hsh[botrow]);
    update(1,1,n,toprow);
    update(1,1,n,botrow);  
  }
  return 0;
}
