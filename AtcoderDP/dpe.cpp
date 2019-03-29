#include <iostream>
#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
int n,w,W[101],V[101],sum; ll dp[100001];
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n>>w;
    for(int i = 0; i < n; i++){
        cin>>W[i]>>V[i];
    }
    memset(dp,0x3f,sizeof dp);
    dp[0]=0;
    for(int i = 0; i < n; i++){
        sum += V[i];
        for(int j = sum; j >= V[i]; j--){
            dp[j] = min(dp[j],dp[j-V[i]]+W[i]);
        }
    }
    int ans = 0;
    for(int i = sum; i >= 0; i--){
        if(dp[i]<=w){
            ans = i;
            break;
        }
    }
    cout<<ans<<"\n";
    return 0;
}
