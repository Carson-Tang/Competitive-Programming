#include <bits/stdc++.h>
using namespace std;
typedef pair<int,int>ii;
int ans,n,m,t,dis[21][21],dp[6][6],sx,sy,d[4][2]={{1,0},{-1,0},{0,1},{0,-1}},check[5]={1,2,3,4,5}; char g[21][21];
bool vis[21][21];
map<ii,int>mp;
map<int,ii>mp2;
queue<int>q;
void bfs(int x, int y){
    memset(dis,0,sizeof dis);
    memset(vis,0,sizeof vis);
    q.push(x); q.push(y);
    while(q.size()){
        int xc = q.front(); q.pop();
        int yc = q.front(); q.pop();
        vis[xc][yc]=1;
        for(int i = 0; i < 4; i++){
            int xr = xc + d[i][0];
            int yr = yc + d[i][1];
            if(xr>-1&&yr>-1&&xr<n&&yr<m){
                if(!vis[xr][yr]&&g[xr][yr]!='X'){
                    vis[xr][yr]=1;
                    dis[xr][yr] = dis[xc][yc]+1;
                    q.push(xr); q.push(yr);
                }
            }
        }
    }
    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            if(g[i][j]=='H'){
                dp[mp[{x,y}]][mp[{i,j}]]=dis[i][j];
            }
        }
    }
}
void perm(int sz){
    if(sz==1){
        int tmp = 0, pv=0;
        for(int i = 0; i < t; i++){
            tmp += dp[mp[mp2[pv]]][mp[mp2[check[i]]]];
            pv=check[i];
        }
        ans = min(ans,tmp);
    } else {
        for(int i = 0; i < sz; i++){
            perm(sz-1);
            if(sz%2) swap(check[0],check[sz-1]);
            else swap(check[i],check[sz-1]);
        }
    }
}
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n>>m>>t;
    ans = INT_MAX;
    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            cin>>g[i][j];
            if(g[i][j]=='H'){
                mp[make_pair(i,j)]=mp.size()+1;
                mp2[mp2.size()+1]=make_pair(i,j);
            } else if(g[i][j]=='G'){
                sx=i; sy=j;
            }
        }
    }
    mp[make_pair(sx,sy)]=0;
    mp2[0]=make_pair(sx,sy);
    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            if(g[i][j]=='H'||g[i][j]=='G'){
                bfs(i,j);
            }
        }
    }
    perm(t);
    cout<<ans<<"\n";
    return 0;
}
