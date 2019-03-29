#include <iostream>
#include <bits/stdc++.h>
using namespace std;
#define MAXN 5001
typedef long long ll;
int n,m,a,b,w,d1[MAXN],d2[MAXN];
struct edge{
    int dest,w;
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
        cin>>a>>b>>w;
        adj[a].push_back({b,w});
        adj[b].push_back({a,w});
    }
    for(int i = 1; i <= n; i++) d1[i]=d2[i]=INT_MAX;
    pq.push({1,0});
    d1[1]=0;
    while(!pq.empty()){
        edge u = pq.top(); pq.pop();
        for(edge v : adj[u.dest]){
            if(d1[v.dest]>v.w+d1[u.dest]){
                d1[v.dest]=v.w+d1[u.dest];
                pq.push({v.dest,d1[v.dest]});
            } else if(d2[v.dest]>d1[u.dest]+v.w&&d1[v.dest]<d1[u.dest]+v.w){
                d2[v.dest]=d1[u.dest]+v.w;
                pq.push({v.dest,d2[v.dest]});
            }
            if(d2[u.dest]+v.w>d1[v.dest]&&d2[u.dest]+v.w<d2[v.dest]){
                d2[v.dest]=d2[u.dest]+v.w;
                pq.push({v.dest,d2[v.dest]});
            }
        }
    }
    cout<<d2[n]<<"\n";
    return 0;
}
