#include <iostream>
#include <bits/stdc++.h>
using namespace std;
int n,m,par[27]; string a,b,ans;
map<char,int>mp; map<int,char>mp2; bool vis[27];
vector<int>adj[27];
queue<int>q;
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n>>m;
    int id = 1;
    for(int i = 0; i < n; i++){
        cin>>a>>b;
        if(!mp[a[0]]){
            mp2[id] = a[0];
            mp[a[0]] = id++;
        }
        if(!mp[b[0]]){
            mp2[id] = b[0];
            mp[b[0]] = id++;
        }
        adj[mp[a[0]]].push_back(mp[b[0]]);
        adj[mp[b[0]]].push_back(mp[a[0]]);
    }
    for(int i = 0; i < m; i++){
        cin>>a>>b;
        ans = "";
        while(q.size()) q.pop();
        q.push(mp[a[0]]);
        memset(vis,0,sizeof vis);
        memset(par,0,sizeof par);
        while(q.size()){
            int u = q.front(); q.pop();
            vis[u]=1;
            for(int v : adj[u]){
                if(!vis[v]){
                    vis[v]=1;
                    q.push(v);
                    par[v]=u;
                }
            }
        }
        int d = mp[b[0]];
        while(par[d]){
            ans = mp2[d] + ans;
            d = par[d];
        }
        cout<<a[0]+ans<<"\n";
    }
    return 0;
}
