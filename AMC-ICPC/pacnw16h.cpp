#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
typedef unsigned long long ull;
typedef pair<ll,ll>p;
ll n,a,b,dp[MAXN];
p s[MAXN];
int k;
bool cmp(ll v, p r){ return v<= r.first;}
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n>>k;
    for(int i = 1; i <= k; i++){
        cin>>a>>b;
        s[i] = make_pair(b,a);
    }
    sort(s+1,s+k+1);
    for(int i = 1; i <= k; i++){
        int last = upper_bound(s+1,s+i+1,s[i].second,cmp)-s-1;
        dp[i]=max(dp[i-1],dp[last] + s[i].first - s[i].second+1);
    }
    cout<<n-dp[k]<<"\n";
    return 0;
}
