#include <iostream>
#include <bits/stdc++.h>
#include <string>
using namespace std;
string s,t; int dp[3001][3001];
string solve(){
    for(int i = 1; i <= s.length(); i++){
        for(int j = 1; j <= t.length(); j++){
            if(s[i-1]==t[j-1]) dp[i][j] = dp[i-1][j-1]+1;
            else dp[i][j] = max(dp[i-1][j],dp[i][j-1]);
        }
    }
    string ret = "";
    int l = s.length(), r = t.length();
    while(l&&r){
        if(s[l-1]==t[r-1]){
            ret=s[l-1]+ret;
            l--; r--;
        } else if (dp[l-1][r]>dp[l][r-1]){
            l--;
        } else r--;
    }

    return ret;
}
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>s>>t;
    cout<<solve()<<"\n";
    return 0;
}
