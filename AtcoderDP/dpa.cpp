#include <iostream>
#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
int n,arr[100001]; ll dp[100001];
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n;
    for(int i = 1; i <= n; i++) cin>>arr[i];
    memset(dp,0x3f3f3f3f,sizeof dp);
    dp[1]=0;
    for(int i = 1; i <= n; i++){
        dp[i+1] = min(dp[i]+abs(arr[i]-arr[i+1]),dp[i+1]);
        dp[i+2] = min(dp[i]+abs(arr[i]-arr[i+2]),dp[i+2]);
    }
    cout<<dp[n]<<"\n";
    return 0;
}
