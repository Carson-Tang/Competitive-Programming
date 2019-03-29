#include <iostream>
#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
int n,arr[3005]; ll dp[3005][3005];
ll solve(int l, int r){
    if(l==r) return dp[l][r] = arr[l];
    if(dp[l][r]) return dp[l][r];
    return dp[l][r] = max(arr[l]-solve(l+1,r),arr[r]-solve(l,r-1));
}
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n;
    for(int i = 0; i < n; i++) cin>>arr[i];
    cout<<solve(0,n-1)<<"\n";
    return 0;
}
