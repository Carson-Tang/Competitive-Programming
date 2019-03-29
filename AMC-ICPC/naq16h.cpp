#include <iostream>
#include <bits/stdc++.h>
using namespace std;
int h,b,dp[2][100001],h1,b1,sum;
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    memset(dp,999999,sizeof dp);
    dp[0][0]=dp[1][0]=0;
    cin>>h;
    for(int i = 0; i < h; i++){
        cin>>h1;
        sum+=h1;
        for(int j = sum; j >= 0; j--){
            if(j-h1>=0){
                if(dp[0][j-h1]!=999999) dp[0][j] = min(dp[0][j],dp[0][j-h1]+1);
            } else break;
        }
    }
    sum = 0;
    cin>>b;
    for(int i = 0; i < b; i++){
        cin>>b1;
        sum+=b1;
        for(int j = sum; j >= 0; j--){
            if(j-b1>=0){
                if(dp[1][j-b1]!=999999) dp[1][j] = min(dp[1][j],dp[1][j-b1]+1);
            } else break;
        }
    }
    int ans = 999999;
    for(int i = 1; i < 100001; i++){
        if(dp[0][i]&&dp[1][i]){
            ans = min(ans,dp[0][i]+dp[1][i]);
        }
    }
    if(ans==999999) cout<<"impossible\n";
    else cout<<ans<<"\n";
    return 0;
}
