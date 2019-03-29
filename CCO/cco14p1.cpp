#include <iostream>
#include <bits/stdc++.h>
using namespace std;
#define MAXN 2005
typedef long long ll;
int N,dp[MAXN][MAXN],ans;
char g[MAXN][MAXN];
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>N;
    for(int i = 1; i <= N; i++){
        for(int j = 1; j <= N; j++){
            cin>>g[i][j];
        }
    }
    for(int i = 1; i <= N; i++){
        for(int j = N; j > 0; j--){
            if(g[i][j]=='#'){
                dp[i][j]=1;
                if(g[i-1][j+1]=='#'&&g[i][j+1]=='#'&&g[i][j+2]=='#'){
                    dp[i][j]=min(dp[i-1][j+1],min(dp[i][j+1],dp[i][j+2]))+1;
                }
            }
        }
    }
    for(int i = 1; i <= N; i++){
        for(int j = 1; j <= N; j++){
            ans+=dp[i][j];
        }
    }
    cout<<ans<<"\n";
    return 0;
}
