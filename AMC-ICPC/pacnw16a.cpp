#include <iostream>
#include <bits/stdc++.h>
using namespace std;
string s,t; int dp[51][51];
int solve(){
    for(int i = 1; i <= s.length(); i++){
        for(int j = 1; j <= t.length(); j++){
            if(s[i-1]==t[j-1]){
                dp[i][j] = dp[i-1][j-1] + 1;
            } else {
                dp[i][j] = max(dp[i-1][j],dp[i][j-1]);
            }
        }
    } return 26-dp[s.length()][t.length()];
}
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>s;
    t = "abcdefghijklmnopqrstuvwxyz";
    cout<<solve()<<"\n";
    return 0;
}
