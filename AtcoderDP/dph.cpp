#include <iostream>
#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
ll dp[1005][1005];
int h,w; char c;
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>h>>w;
    dp[1][1]=1;
    for(int i = 1; i <= h; i++){
        for(int j = 1; j <= w; j++){
            cin>>c;
            if(c=='.'){
                dp[i][j] = (dp[i][j]+dp[i-1][j])%MOD;
                dp[i][j] = (dp[i][j]+dp[i][j-1])%MOD;
            }
        }
    }
    cout<<dp[h][w]%MOD<<"\n";
    return 0;
}
