#include <iostream>
#include <bits/stdc++.h>
using namespace std;
int n,m,d,a,b,c,p[100001],cnt,maxcost;
struct edge{
    int x,y,w,orig;
    bool operator<(const edge &d) const{
        if(w!=d.w)return w<d.w;
        return orig>d.orig;
    }
};
vector<edge>pipes;
int Find(int v){
    if(p[v]!=v) p[v]=Find(p[v]);
    return p[v];
}
void Union(int v1, int v2){
    p[Find(v1)]=Find(v2);
}
int main() {
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n>>m>>d;
    for(int i = 1; i < 100001; i++) p[i]=i;
    for(int i = 0; i < m; i++){
        cin>>a>>b>>c;
        if(i<n-1) pipes.push_back({a,b,c,1});
        else pipes.push_back({a,b,c,0});
    }
    sort(pipes.begin(),pipes.end());
    for(int i = 0; i < pipes.size(); i++){
        if(Find(pipes[i].x)!=Find(pipes[i].y)){
            if(!pipes[i].orig) cnt++;
            Union(pipes[i].x,pipes[i].y);
            maxcost = max(maxcost,pipes[i].w);
        }
    }
    for(int i = 1; i < 100001; i++) p[i]=i;
    for(int i = 0; i < pipes.size(); i++){
        if(Find(pipes[i].x)!=Find(pipes[i].y)){
            if(pipes[i].w<maxcost) Union(pipes[i].x,pipes[i].y);
            else if (pipes[i].w==maxcost&&pipes[i].orig){
                Union(pipes[i].x,pipes[i].y);
            } else if(pipes[i].orig&&pipes[i].w<=d){
                cout<<cnt-1<<"\n";
                return 0;
            }
        }
    }
    cout<<cnt<<"\n";
    return 0;
}
