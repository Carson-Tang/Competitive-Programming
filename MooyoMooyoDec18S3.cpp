#include <iostream>
#include <bits/stdc++.h>
#include <string>
#include <cstdlib>
#include <fstream>
using namespace std;
#define MAXN 100001
#define MOD 1000000007
typedef long long ll;
typedef unsigned long long ull;
typedef pair<int,int>ii;
int n,k,g[101][10];
int d[4][2]={{0,1},{0,-1},{-1,0},{1,0}};
bool vis[101][10],vis2[101][10];
string s;
bool flag = true;
queue<int>q;
void del(int x, int y){
    memset(vis2, false, sizeof vis2);
    int BAD = g[x][y];
    q.push(x); q.push(y);
    while(!q.empty()){
        int xr = q.front(); q.pop();
        int yr = q.front(); q.pop();
        vis2[xr][yr]=1;
        g[xr][yr]=0;
        for(int i = 0; i < 4; i++){
            int xc = xr + d[i][0];
            int yc = yr + d[i][1];
            // expand grid if WA
            if(xc>-1&&yc>-1&&xc<n&&yc<10){
                if(!vis2[xc][yc]&&g[xc][yc]==BAD){
                    vis2[xc][yc]=1;
                    q.push(xc); q.push(yc);
                }
            }
        }
    }
}
bool bfs(int x, int y){
    q.push(x); q.push(y);
    int NUMBER = g[x][y];
    int cnt = 0;
    while(!q.empty()){
        int xr = q.front(); q.pop();
        int yr = q.front(); q.pop();
        vis[xr][yr]=1;
        cnt++;
        for(int i = 0; i < 4; i++){
            int xc = xr + d[i][0];
            int yc = yr + d[i][1];
            if(xc>-1&&yc>-1&&xc<n&&yc<10){
                if(!vis[xc][yc]&&g[xc][yc]==NUMBER){
                    vis[xc][yc]=1;
                    q.push(xc); q.push(yc);
                }
            }
        }
    }
    return cnt>=k;
}
void fixg(){
    bool flag2 = true;
    while(flag2){
        flag2=false;
        for(int i = n-1; i > 0; i--){
            for(int j = 0; j < 10; j++){
                if(g[i][j]==0&&g[i-1][j]!=0){
                    swap(g[i][j],g[i-1][j]);
                    flag2=true;
                }
            }
        }
    }
}
int main(){
    ofstream fout ("mooyomooyo.out");
    ifstream fin ("mooyomooyo.in");
    fin.sync_with_stdio(0);
    fin.tie(0);
    fin>>n>>k;
    for(int i = 0; i < n; i++){
        fin>>s;
        for(int j = 0; j < 10; j++){
            g[i][j]=s.at(j)-48;
        }
    }
    while(flag){
        flag=false;
        memset(vis,false,sizeof vis);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 10; j++){
                if(!vis[i][j]&&g[i][j]!=0){
                    if(bfs(i,j)){
                        del(i,j);
                        flag=true;
                    }
                }
            }
        }
        fixg();
    }
    for(int i = 0; i < n; i++){
        for(int j = 0; j < 10; j++){
            fout<<g[i][j];
        }
        fout<<"\n";
    }
    return 0;
}
