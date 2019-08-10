#include <bits/stdc++.h>
using namespace std;
int n,m,a,b,low[MAXN],p[MAXN],disc[MAXN];
vector<int>adj[MAXN],ap;
bool vis[MAXN];
void dfs(int u){
    static int t= 0;
    int c = 0;
    vis[u]=1;
    disc[u]=low[u]=++t;
    for(int v : adj[u]){
        if(!vis[v]){
            c++;
            p[v]=u;
            dfs(v);
            low[u]=min(low[u],low[v]);
            if(p[u]==0&&c>1) ap.push_back(u);
            if(p[u]!=0&&low[v]>=disc[u]) ap.push_back(u);
        } else if (v!=p[u]){
            low[u]=min(low[u],disc[v]);
        }
    }
}
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n>>m;
    for(int i = 0; i < m; i++){
        cin>>a>>b;
        adj[a].push_back(b);
        adj[b].push_back(a);
    }
    memset(p,0,sizeof p);
    memset(disc,0,sizeof disc);
    memset(low,0,sizeof low);
    memset(vis,false,sizeof vis);
    for(int i = 1; i <= n; i++){
        if(!vis[i]) dfs(i);
    }
    sort(ap.begin(),ap.end());
    ap.erase(unique(ap.begin(),ap.end()),ap.end());
    cout<<ap.size()<<"\n";
    for(int i : ap){
        cout<<i<<"\n";
    }
    return 0;
}
