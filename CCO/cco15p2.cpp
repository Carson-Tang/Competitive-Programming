#include <iostream>
#include <bits/stdc++.h>
using namespace std;
#define MAXN 100001
typedef long long ll;
int setBit(int n, int idx){ return n|(1<<idx);}
int unsetBit(int n, int idx){ return n&!(1<<idx);}
bool checkBit(int n, int idx){ return n&(1<<idx);}
int n,m,s,d,l,dis[19][(1<<19)],ans;
struct edge{
    int dest,w;
};
vector<edge>adj[19];
queue<edge>q;
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n>>m;
    for(int i = 0; i < m; i++){
        cin>>s>>d>>l;
        adj[s].push_back({d,l});
    }
    q.push({0,1});
    while(q.size()){
        edge cur = q.front(); q.pop();
        int curr = cur.dest, mask = cur.w;
        for(edge next : adj[curr]){
            if(!checkBit(mask,next.dest)){
                int newmask = setBit(mask,next.dest);
                if(dis[next.dest][newmask]<dis[curr][mask]+next.w){
                    dis[next.dest][newmask]=dis[curr][mask]+next.w;
                    q.push({next.dest,newmask});
                }
            }
        }
    }
    for(int i = 0; i < (1<<n); i++){
        ans = max(ans,dis[n-1][i]);
    }
    cout<<ans<<"\n";
    return 0;
}
