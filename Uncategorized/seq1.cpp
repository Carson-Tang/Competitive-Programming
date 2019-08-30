#include <bits/stdc++.h>
using namespace std;
typedef unsigned long long ull;

ull MOD, ans, n;
ull powmod(ull base, ull expo){
    base %= MOD;
    ull res = 1;
    while(expo>0){
        if(expo&1) res = res*base%MOD;
        base = base*base%MOD;
        expo>>=1;
    }
    return res;
}
int main(){
    MOD = 1e9+7;
    scanf("%lu",&n);
    ans = ((powmod(2,n+3) - 5)+MOD) % MOD;
    printf("%lu\n",ans);
    return 0;
}
