#include <iostream>
#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
int n,r,c,pr,pc,kr,kc,d[8][2]={{1,2},{1,-2},{-1,2},{-1,-2},{2,1},{-2,-1},{-2,1},{2,-1}},dis[101][101];
bool vis[101][101];
queue<int>q;
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n;
    while(n--){
        cin>>r>>c>>pr>>pc>>kr>>kc;
        memset(vis,0,sizeof vis);
        memset(dis,0,sizeof dis);
        q.push(kr); q.push(kc);
        while(q.size()){
            int x = q.front(); q.pop();
            int y = q.front(); q.pop();
            vis[x][y]=1;
            for(int i = 0; i < 8; i++){
                int xr = x + d[i][0];
                int yr = y + d[i][1];
                if(xr>0&&yr>0&&xr<=r&&yr<=c){
                    if(!vis[xr][yr]){
                        vis[xr][yr]=1;
                        q.push(xr); q.push(yr);
                        dis[xr][yr] = dis[x][y]+1;
                    }
                }
            }
        }
        int px = pr, py = pc, moves = 0, ans = 9999;
        while(px!=r){
            px+=1;
            if(px==r) break;
            moves++;
            if(vis[px][py]&&dis[px][py]<=moves){
                if(dis[px][py]%2==moves%2){
                    ans = moves;
                    break;
                }
            }
        }
        if(ans!=9999){
            cout<<"Win in "<<ans<<" knight move(s).\n";
            continue;
        }
        px = pr, py = pc, moves = 0, ans = 9999;
        while(px!=r){
            px+=1;
            moves++;
            if(vis[px][py]&&dis[px][py]<=moves){
                if(dis[px][py]%2!=moves%2){
                    ans = moves-1;
                    break;
                }
            }
        }
        if(ans!=9999){
            cout<<"Stalemate in "<<ans<<" knight move(s).\n";
            continue;
        }
        cout<<"Loss in "<<(r-pr-1)<<" knight move(s).\n";
    }
    return 0;
}
