#include <bits/stdc++.h>
using namespace std;

int T,N,B,c[1005],v[1005],t[1005],dp[3005][1<<5],ans;
int main(){
    scanf("%d",&T);
    scanf("%d",&N);
    for(int i = 0; i < N; i++){
        scanf("%d %d %d",&c[i],&v[i],&t[i]);
        t[i]--;
    }
    scanf("%d",&B);
    for(int i = 0; i < N; i++){
        for(int j = 0; j < (1<<T); j++){
            if(!(j&(1<<t[i]))){
                for(int k = 0; k <= B; k++){
                    if(k+c[i]>B) break;
                    dp[k+c[i]][j|(1<<t[i])] = max(dp[k+c[i]][j|(1<<t[i])],dp[k][j] + v[i]);
                }
            }
        }
    }
    int fs = (1<<T)-1;
    for(int i = 0; i <= B; i++){
        ans = max(ans,dp[i][fs]);
    }
    if(!ans) ans=-1;
    printf("%d\n",ans);
    return 0;
}
