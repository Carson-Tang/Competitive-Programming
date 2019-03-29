#include <iostream>
#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
int n,m,x,y,in[100001]; vector<int>adj[100001];
ll ans,dp[100001]; queue<int>q;
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n>>m;
    for(int i = 0; i < m; i++){
        cin>>x>>y;
        adj[x].push_back(y);
        in[y]++;
    }
    for(int i = 1; i <= n; i++){
        if(!in[i]) q.push(i);
    }
    while(q.size()){
        int u = q.front(); q.pop();
        for(int v : adj[u]){
            if(--in[v]==0){
                q.push(v);
            }
            dp[v]= max(dp[v],dp[u]+1);
            ans = max(ans,dp[v]);
        }
    }
    cout<<ans<<"\n";
    return 0;
}
