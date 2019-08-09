#include <bits/stdc++.h>
using namespace std;

int n,r,c,dp[1005],rage[1005 * 4]; char d;
void build(int node, int s, int e){
    if(s==e){
        rage[node] = dp[s];
    } else {
        int mid = (s+e)/2;
        build(node*2,s,mid);
        build(node*2+1,mid+1,e);
        rage[node] = min(rage[node*2],rage[node*2+1]);
    }
}
int query(int node, int s, int e, int l, int r){
    if(s>e||s>r||l>e) return INT_MAX;
    if(s>=l&&e<=r) return rage[node];
    int mid = (s+e)/2;
    return min(query(node*2,s,mid,l,r),query(node*2+1,mid+1,e,l,r));
}
void solve(){
    memset(dp,0,sizeof dp);
    int ans = 0;
    cin>>r>>c;
    for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
            cin>>d;
            if(d=='F'){
                dp[j]+=1;
            } else dp[j]=0;
        }
        build(1,0,c-1);
        for(int l = 0; l < c; l++){
            for(int r = l; r < c; r++){
                int v = query(1,0,c-1,l,r);
                if(!v) break;
                ans = max(ans,3*(r-l+1)*v);
            }
        }
    }
    printf("%d\n",ans);
}
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n;
    for(int i = 0; i < n; i++){
        solve();
    }
    return 0;
}
