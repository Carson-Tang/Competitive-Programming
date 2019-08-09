#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int t,a,b; ll dp1[2005][2005],dp2[2005][2005],MOD;
ll solve1(int p1, int p2){
    if(p2==0) return dp1[p1][p2]=1;
    if(p2>=p1) return dp1[p1][p2]=0;
    if(dp1[p1][p2]) return dp1[p1][p2];
    return dp1[p1][p2] = (solve1(p1-1,p2) + solve1(p1,p2-1))%MOD;
}
ll solve2(int p1, int p2){
    if(p1==0) return dp2[p1][p2]=1;
    if(p1>p2) return dp2[p1][p2]=0;
    if(dp2[p1][p2]) return dp2[p1][p2];
    return dp2[p1][p2] = (solve2(p1-1,p2) + solve2(p1,p2-1))%MOD;
}
int main(){
    scanf("%d",&t);
    MOD = 1e9+7;
    for(int i = 1; i <= t; i++){
        scanf("%d-%d",&a,&b);
        printf("Case #%d: %lld %lld\n",i,solve1(a,b),solve2(b,b));
    }
    return 0;
}
