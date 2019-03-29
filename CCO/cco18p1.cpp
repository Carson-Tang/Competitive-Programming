#include <iostream>
#include <bits/stdc++.h>
using namespace std;
int n,a[1005],b[1005],dp[1005][1005]; string s,s1[1005],s2[1005];
int solve(int idx1, int idx2){
    if(idx1>=n||idx2>=n) return 0;
    if(dp[idx1][idx2]) return dp[idx1][idx2];
    dp[idx1][idx2] = max(solve(idx1,idx2+1),solve(idx1+1,idx2));
    if(s1[idx1]==s2[idx2]||a[idx1]==b[idx2]) return dp[idx1][idx2];
    if((s1[idx1]=="W"&&a[idx1]>b[idx2])||(s1[idx1]=="L"&&a[idx1]<b[idx2])){
        return dp[idx1][idx2] = max(dp[idx1][idx2],a[idx1]+b[idx2]+solve(idx1+1,idx2+1));
    }
    return dp[idx1][idx2];
}
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n;
    cin>>s;
    for(int i = 0; i < n; i++) s1[i]=s[i];
    for(int i = 0; i < n; i++) cin>>a[i];
    cin>>s;
    for(int i = 0; i < n; i++) s2[i]=s[i];
    for(int i = 0; i < n; i++) cin>>b[i];
    cout<<solve(0,0)<<"\n";
    return 0;
}
