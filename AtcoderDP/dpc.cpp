#include <iostream>
#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
int n,a[MAXN],b[MAXN],c[MAXN]; ll dp[3][MAXN];
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n;
    for(int i = 0; i < n; i++){
        cin>>a[i]>>b[i]>>c[i];
    }
    dp[0][0]=a[0];
    dp[1][0]=b[0];
    dp[2][0]=c[0];
    for(int i = 1; i < n; i++){
        dp[0][i] = max(dp[1][i-1]+a[i],dp[2][i-1]+a[i]);
        dp[1][i] = max(dp[0][i-1]+b[i],dp[2][i-1]+b[i]);
        dp[2][i] = max(dp[0][i-1]+c[i],dp[1][i-1]+c[i]);
    }
    cout<<max(dp[0][n-1],max(dp[1][n-1],dp[2][n-1]))<<"\n";
    return 0;
}
