#include <bits/stdc++.h>
using namespace std;
#define MAXN 100001
int lines[MAXN];
bool vis[MAXN][81];
int N,C,Rs,Cs,Rf,Cf;
struct edge {
    int u,v,dis;
};
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>N;
    for(int i = 1; i <= N; i++){
       cin>>C;
       lines[i]=C;
    }
    cin>>Rs; cin>>Cs;
    cin>>Rf; cin>>Cf;
    queue<edge>q;
    q.push(edge{Rs,Cs,0});
    while(!q.empty()){
        edge u = q.front(); q.pop();
        int xr = u.u, yr = u.v;
        if(xr==Rf && yr==Cf){
            cout << u.dis << "\n";
            break;
        }
        if(!(yr==lines[N] && xr==N)){
            if(yr<lines[xr]){
                if(!vis[xr][yr+1]){
                    q.push(edge{xr,yr+1,u.dis+1});
                    vis[xr][yr+1]=1;
                }
            } else if(!vis[xr+1][1]){
                q.push(edge{xr+1,1,u.dis+1});
                vis[xr+1][1]=1;
            }
        }
        if(!(xr==1&&yr==1)){
            if(yr>1){
                if(!vis[xr][yr-1]){
                    q.push(edge{xr,yr-1,u.dis+1});
                    vis[xr][yr-1]=1;
                }
            } else if(!vis[xr-1][lines[xr-1]]){
                q.push(edge{xr-1,lines[xr-1],u.dis+1});
                vis[xr-1][lines[xr-1]]=1;
            }
        }
        if(xr!=1){
            if(lines[xr-1]>=yr){
                if(!vis[xr-1][yr]){
                    q.push(edge{xr-1,yr,u.dis+1});
                    vis[xr-1][yr]=1;
                }
            } else if(!vis[xr-1][lines[xr-1]]){
                q.push(edge{xr-1,lines[xr-1],u.dis+1});
                vis[xr-1][lines[xr-1]]=1;
            }
        }
        if(xr!=N){
            if(lines[xr+1]>=yr){
                if(!vis[xr+1][yr]){
                    q.push(edge{xr+1,yr,u.dis+1});
                    vis[xr+1][yr]=1;
                }
            } else if(!vis[xr+1][lines[xr+1]]){
                q.push(edge{xr+1,lines[xr+1],u.dis+1});
                vis[xr+1][lines[xr+1]]=1;
            }
        }
    }
    return 0;
}
