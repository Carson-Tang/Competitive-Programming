#include <bits/stdc++.h>
#include <iostream>
using namespace std;
int n,m,a[3005],b[105],dp[3005][105][105][2];
int solve(int pos, int l, int r, int t){
    if(dp[pos][l][r][t]!=-1) return dp[pos][l][r][t];
    if(pos<=n){
        if(!t)dp[pos][l][r][t] = max(dp[pos][l][r][t],a[pos]+solve(pos+1,l,r,1));
        dp[pos][l][r][t] = max(dp[pos][l][r][t],solve(pos+1,l,r,0));
    } else if (l>r) return 0;
    if(l<=r&&l<=m){
        if(!t)dp[pos][l][r][t] = max(dp[pos][l][r][t],b[l]+solve(pos,l+1,r,1));
        dp[pos][l][r][t] = max(dp[pos][l][r][t],solve(pos,l+1,r,0));
    }
    if(l<=r&&r>=1){
        if(!t)dp[pos][l][r][t] = max(dp[pos][l][r][t],b[r]+solve(pos,l,r-1,1));
        dp[pos][l][r][t] = max(dp[pos][l][r][t],solve(pos,l,r-1,0));
    }
    return dp[pos][l][r][t];
}
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    memset(dp,-1,sizeof dp);
    cin>>n;
    for(int i = 1; i <= n; i++){
        cin>>a[i];
    }
    cin>>m;
    for(int i = 1; i <= m; i++){
        cin>>b[i];
    }
    sort(b+1,b+1+m);
    cout<<solve(1,1,m,0)<<"\n";
    return 0;
}
