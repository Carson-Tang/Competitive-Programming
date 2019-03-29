#include <iostream>
#include <bits/stdc++.h>
using namespace std;
#define MAXN 20001
typedef long long ll;
int n,m,a,b,l;
ll d1[MAXN],d2[MAXN];
struct edge{
    ll dest,w;
    bool operator<(const edge &a) const{
        return w>a.w;
    }
};
vector<edge>adj[MAXN];
priority_queue<edge>pq;
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n>>m;
    for(int i = 0; i < m; i++){
        cin>>a>>b>>l;
        adj[a].push_back({b,l});
    }
    pq.push({1,0});
    for(int i = 1; i <= n; i++){
        d1[i]=LONG_MAX;
        d2[i]=LONG_MAX;
    }
    d1[1]=0;
    while(!pq.empty()){
        edge u = pq.top(); pq.pop();
        for(edge v : adj[u.dest]){
            if(d1[v.dest]>v.w+d1[u.dest]){
                d2[v.dest]=d1[v.dest];
                d1[v.dest]=v.w+d1[u.dest];
                pq.push({v.dest,d1[v.dest]});
            }
            if(d2[v.dest]>d1[u.dest]+v.w&&d1[v.dest]<d1[u.dest]+v.w){
                d2[v.dest]=d1[u.dest]+v.w;
                pq.push({v.dest,d2[v.dest]});
            }
            if(d2[u.dest]+v.w>d1[v.dest]&&d2[u.dest]+v.w<d2[v.dest]){
                d2[v.dest]=d2[u.dest]+v.w;
                pq.push({v.dest,d2[v.dest]});
            }
        }
    }
    if(d2[n]==LONG_MAX) cout<<-1<<"\n";
    else cout<<d2[n]<<"\n";
    return 0;
}
