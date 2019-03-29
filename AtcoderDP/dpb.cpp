#include <iostream>
#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
int n,k,arr[100001]; ll dp[100001];
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n>>k;
    for(int i = 1; i <= n; i++) cin>>arr[i];
    memset(dp,0x3f3f3f3f, sizeof dp);
    dp[1]=0;
    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= k; j++){
            dp[i+j] = min(dp[i+j],dp[i]+abs(arr[i]-arr[i+j]));
        }
    }
    cout<<dp[n]<<"\n";
    return 0;
}
