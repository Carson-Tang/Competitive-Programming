#include <iostream>
#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
int n,w,c[101],v[101]; ll dp[2][100001];
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n>>w;
    for(int i = 1; i <= n; i++){
        cin>>c[i]>>v[i];
    }
    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= w; j++){
            if(c[i]<=j){
                dp[(i)%2][j] = max(dp[(i-1)%2][j],dp[(i-1)%2][j-c[i]]+v[i]);
            } else {
                dp[(i)%2][j] = dp[(i-1)%2][j];
            }
        }
    }
    cout<<dp[n%2][w]<<"\n";
    return 0;
}
