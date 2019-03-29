#include <iostream>
#include <bits/stdc++.h>
using namespace std;
int n,arr[201],dp[201][201];
int solve(int l, int r){
    if(l==r) return 0;
    if(dp[l][r]) return dp[l][r];
    for(int i = l+1; i < r; i++){
        dp[l][r] = max(dp[l][r],arr[l]+arr[r]+arr[i]+solve(l,i)+solve(i,r));
    }
    return dp[l][r];
}
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    while(1){
        cin>>n;
        if(!n) break;
        for(int i = 1; i <= n; i++){
            cin>>arr[i];
        }
        memset(dp,0,sizeof dp);
        cout<<solve(1,n)<<"\n";
    }
    return 0;
}
