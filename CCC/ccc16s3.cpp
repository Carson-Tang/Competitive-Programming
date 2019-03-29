#include<bits/stdc++.h>
using namespace std;
#define MAXN 100000
int L,N,M,A,B,R;
int dis[MAXN],p[MAXN];
bool rest[MAXN],dia[MAXN],vis[MAXN];
vector<int>adj[MAXN];
void diameter(){
    int start = -1;
    for(int i = 0; i < N; i++){
        if(rest[i]){
            start=i;
            break;
        }
    }
    stack<int> s;
    s.push(start);
    while(!s.empty()){
        int curr = s.top(); s.pop();
        vis[curr]=true;
        for(int neigh : adj[curr]){
            if(!vis[neigh]){
                dis[neigh] = dis[curr]+1;
                vis[neigh]=true;
                s.push(neigh);
            }
        }
    }
    int maxdis = -1;
    for(int i = 0; i < N; i++){
        if(rest[i]&&dis[i]>maxdis){
            maxdis=dis[i];
            start=i;
        }
    }
    s.push(start);
    dia[start]=true;
    memset(dis,0,sizeof(dis));
    memset(vis,false,sizeof(vis));
    memset(p,-1,sizeof(p));
    while(!s.empty()){
        int curr = s.top(); s.pop();
        vis[curr]=true;
        for(int neigh : adj[curr]){
            if(!vis[neigh]){
                vis[neigh]=true;
                dis[neigh]=dis[curr]+1;
                p[neigh]=curr;
                s.push(neigh);
            }
        }
    }
    int furthestrest = -1;
    maxdis = -1;
    for(int i = 0; i < N; i++){
        if(dis[i]>maxdis&&rest[i]){
            maxdis=dis[i];
            furthestrest = i;
        }
    }
    while(p[furthestrest]!=-1){
        L++;
        dia[furthestrest]=true;
        furthestrest=p[furthestrest];
    }
    dia[furthestrest]=true;
}
int resttodia(int start){
    dia[start]=true;
    memset(vis,false,sizeof(vis));
    memset(dis,0,sizeof(dis));
    memset(p,-1,sizeof(p));
    stack<int> s;
    s.push(start);
    while(!s.empty()){
        int curr = s.top(); s.pop();
        vis[curr]=true;
        for(int neigh : adj[curr]){
            if(!vis[neigh]){
                vis[neigh]=true;
                dis[neigh]=dis[curr]+1;
                s.push(neigh);
                p[neigh]=curr;
                if(dia[neigh]){
                    int v = neigh;
                    while(p[v]!=-1){
                        dia[v]=true;
                        v=p[v];
                        if(dia[v]) break;
                    }
                    dia[v]=true;
                    return dis[neigh]*2;
                }
            }
        }
    }
    return 0;
}
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>N; cin>>M;
    for(int i = 0; i < M; i++){
        cin>>R;
        rest[R]=true;
    }
    for(int i = 0; i < N-1; i++){
        cin>>A; cin>>B;
        adj[A].push_back(B);
        adj[B].push_back(A);
    }
    diameter();
    for(int i = 0; i < N; i++){
        if(rest[i]&&!dia[i]){
            L+=resttodia(i);
        }
    }
    cout << L <<"\n";
    return 0;
}
