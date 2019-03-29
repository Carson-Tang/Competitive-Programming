#include <bits/stdc++.h>
#include <iostream>
using namespace std;
typedef long long ll;
int n,k,arr[200010]; ll ans;
struct node{
    ll mxv=-INFINITE,lv=-INFINITE,rv=-INFINITE,sum=-INFINITE;
};
node rage[600020];
node combine(node left, node right){
    node ret;
    ret.sum = left.sum + right.sum;
    ret.lv = max(left.lv, left.sum + right.lv);
    ret.rv = max(right.rv, right.sum + left.rv);
    ret.mxv = max(left.mxv,max(right.mxv,left.rv+right.lv));
    return ret;
}
void build(int idx, int s, int e){
    if(s==e){
        rage[idx].mxv=arr[s];
        rage[idx].lv=arr[s];
        rage[idx].rv=arr[s];
        rage[idx].sum=arr[s];
    } else {
        int mid = (s+e)/2;
        build(idx*2,s,mid);
        build(idx*2+1,mid+1,e);
        rage[idx] = combine(rage[idx*2],rage[idx*2+1]);
    }
}
node query(int idx, int s, int e, int l, int r){
    if(l>e||s>e||s>r){
        node bad;
        return bad;
    }
    if(s>=l&&e<=r) return rage[idx];
    int mid = (s+e)/2;
    node left = query(idx*2,s,mid,l,r);
    node right = query(idx*2+1,mid+1,e,l,r);
    return combine(left,right);
}
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n>>k;
    for(int i = 0; i < n; i++){
        cin>>arr[i];
    }
    for(int i = n, j = 0; j < k; j++, i++){
        arr[i] = arr[j];
    }
    build(1,0,n+k-1);
    for(int i = 0; i < n; i++){
        ans = max(ans,query(1,0,n+k-1,i,i+k-1).mxv);
    }
    cout<<ans<<"\n";
    return 0;
}
