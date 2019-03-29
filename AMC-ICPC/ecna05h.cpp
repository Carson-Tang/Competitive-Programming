#include <iostream>
#include <bits/stdc++.h>
using namespace std;
int g,n,a[1001],sum,dp[1001][1001];
int solve(int l, int r){
    if(l==r-1) return dp[l][r]=max(a[l],a[r]);
    if(l>r) return 0;
    if(dp[l][r]!=-1) return dp[l][r];
    int v1,v2;
    if(a[l+1]>=a[r]) v1 = a[l] + solve(l+2,r);
    else v1 = a[l] + solve(l+1,r-1);
    if(a[l]>=a[r-1]) v2 = a[r] + solve(l+1,r-1);
    else v2 = a[r] + solve(l,r-2);
    return dp[l][r] = max(v1,v2);
}
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    while(1){
        cin>>n;
        if(!n) break;
        memset(a,0,sizeof a);
        memset(dp,-1,sizeof dp);
        sum = 0;
        g++;
        for(int i = 0; i < n; i++){
            cin>>a[i];
            sum += a[i];
        }
        cout<<"In game "<<g<<", the greedy strategy might lose by as many as "<<2*solve(0,n-1)-sum<<" points.\n";
    }
    return 0;
}
