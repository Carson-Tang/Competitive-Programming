#include <bits/stdc++.h>
#include <iostream>
using namespace std;
int n; double p[3005],dp[3005][3005],ans;
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n;
    dp[0][0]=1;
    for(int i = 1; i <= n; i++){
        cin>>p[i];
        for(int j = 0; j <= i; j++){
            if(j) dp[i][j] = p[i]*dp[i-1][j-1] + (1-p[i])*dp[i-1][j];
            else dp[i][j] = (1-p[i])*dp[i-1][j];
        }
    }
    for(int i = n/2+1; i <= n; i++){
        ans += dp[n][i];
    }
    cout<<setprecision(10)<<ans<<"\n";
    return 0;
}
