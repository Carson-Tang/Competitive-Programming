#include <bits/stdc++.h>
#include <iostream>
#define x first
#define y second
using namespace std;
int n,m,a,b,c,d,fwd[500005],bck[500005]; int ans;
struct edge {
    int dest,cost;
    bool operator<(const edge &other)const{
        return cost>other.cost;
    }
};
vector<edge>adj1[500005],adj2[500005];
priority_queue<edge>pq;
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n>>m;
    ans = INT_MAX;
    for(int i = 1; i <= n; i++){
        fwd[i]=INT_MAX;
        bck[i]=INT_MAX;
    }
    fwd[1]=0;
    bck[n]=0;
    for(int i = 0; i < m; i++){
        cin>>a>>b>>c;
        adj1[a].push_back({b,c});
        adj2[b].push_back({a,c});
    }
    pq.push({1,0});
    while(pq.size()){
        edge u = pq.top(); pq.pop();
        for(edge v : adj1[u.dest]){
            if(fwd[v.dest]>fwd[u.dest]+v.cost){
                fwd[v.dest]=fwd[u.dest]+v.cost;
                pq.push({v.dest,fwd[v.dest]});
            }
        }
    }
    pq.push({n,0});
    while(pq.size()){
        edge u = pq.top(); pq.pop();
        for(edge v : adj2[u.dest]){
            if(bck[v.dest]>bck[u.dest]+v.cost){
                bck[v.dest]=bck[u.dest]+v.cost;
                pq.push({v.dest,bck[v.dest]});
            }
        }
    }
    cin>>d;
    while(d--){
        cin>>a>>b>>c;
        if(fwd[a]==INT_MAX || bck[b]== INT_MAX) continue;
        ans = min(ans,fwd[a]+bck[b]+c);
    }
    ans = min(ans,fwd[n]);
    cout<<((ans==INT_MAX)?-1:ans)<<"\n";
    return 0;
}
