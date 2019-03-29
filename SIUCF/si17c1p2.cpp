#include <iostream>
#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
int n,k,arr[100001]; ll dp[100001];
ll solve(int idx){
    if(idx>=n) return 0;
    if(dp[idx]!=-1) return dp[idx];
    return dp[idx] = max(solve(idx+1),arr[idx]+solve(idx+k+1));
}
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n>>k;
    memset(dp,-1,sizeof dp);
    for(int i = 0; i < n; i++) cin>>arr[i];
    cout<<solve(0)<<"\n";
    return 0;
}
