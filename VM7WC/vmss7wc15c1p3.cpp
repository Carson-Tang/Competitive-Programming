#include <bits/stdc++.h>
using namespace std;
#define MAXN 7001
#define MOD 1000000007
typedef long long ll;
bool isp[MAXN];
vector<int>p;
int N,K,cnt, dp[MAXN];
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>N>>K;
    memset(isp,true,sizeof(isp));
    for(int i = 2; i*i <MAXN; i++){
        if(isp[i]){
            for(int j = i*2; j < MAXN; j+=i){
                isp[j]=false;
            }
        }
    }
    for(int i = 2; i < MAXN; i++){
        dp[i]=99999;
        if(isp[i]){
            p.push_back(i);
            dp[i]=1;
        }
    }
    dp[0]=0;
    dp[1]=99999;
    for(int i = 0; i < MAXN; i++){
        for(int j : p){
            if(i-j<0) break;
            dp[i] = min(dp[i],dp[i-j]+1);
        }
    }
    for(int i = 0; i <= N; i++){
        if(dp[i]==K) cnt++;
    }
    cout<<cnt;
    return 0;
}
