#include <iostream>
#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
int n,a[401]; ll psa[401],dp[401][401];
ll solve(int lb, int rb){
    if(lb<=0||rb>n||lb==rb) return 0;
    if(dp[lb][rb]) return dp[lb][rb];
    dp[lb][rb]=LONG_MAX;
    for(int i = lb; i < rb; i++){
        dp[lb][rb] = min(dp[lb][rb],solve(lb,i)+solve(i+1,rb));
    }
    dp[lb][rb] += psa[rb] - psa[lb-1];
    return dp[lb][rb];
}
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n;
    for(int i = 1; i <= n; i++){
        cin>>a[i];
        psa[i]=psa[i-1]+a[i];
    }
    cout<<solve(1,n)<<"\n";
    return 0;
}
