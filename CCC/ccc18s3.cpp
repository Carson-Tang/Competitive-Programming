#include <iostream>
#include <bits/stdc++.h>
using namespace std;
#define MAXN 101
typedef pair<int,int> ii;
char grid[MAXN][MAXN];
bool flag,no[MAXN][MAXN];
int R,C,sx,sy,xc,yc,xr,yr,dis[MAXN][MAXN],d[4][2] = {{0,1},{0,-1},{1,0},{-1,0}};
queue<ii>cam,q;
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>R>>C;
    for(int i = 0; i < R; i++){
        for(int j = 0; j < C; j++){
            cin>>grid[i][j];
            if(grid[i][j]=='S'){
                sx=i; sy=j;
            } else if (grid[i][j]=='C'){
                no[i][j]=true;
                cam.push(make_pair(i,j));
            } else if (grid[i][j]=='W'){
                no[i][j]=true;
            }
            dis[i][j]=INT_MAX;
        }
    }
    while(!cam.empty()){
        ii c = cam.front(); cam.pop();
        xc = c.first;
        yc = c.second;
        while(xc>-1&&yc>-1&&xc<R&&yc<C){
            if(grid[xc][yc]=='W'){
                break;
            }
            if(grid[xc][yc]=='.'||grid[xc][yc]=='S'){
                no[xc][yc]=true;
            }
            xc++;
        }
        xc = c.first;
        yc = c.second;
        while(xc>-1&&yc>-1&&xc<R&&yc<C){
            if(grid[xc][yc]=='W'){
                break;
            }
            if(grid[xc][yc]=='.'||grid[xc][yc]=='S'){
                no[xc][yc]=true;
            }
            xc--;
        }
        xc = c.first;
        yc = c.second;
        while(xc>-1&&yc>-1&&xc<R&&yc<C){
            if(grid[xc][yc]=='W'){
                break;
            }
            if(grid[xc][yc]=='.'||grid[xc][yc]=='S'){
                no[xc][yc]=true;
            }
            yc++;
        }
        xc = c.first;
        yc = c.second;
        while(xc>-1&&yc>-1&&xc<R&&yc<C){
            if(grid[xc][yc]=='W'){
                break;
            }
            if(grid[xc][yc]=='.'||grid[xc][yc]=='S'){
                no[xc][yc]=true;
            }
            yc--;
        }
    }
    q.push(make_pair(sx,sy));
    dis[sx][sy]=0;
    while(!q.empty()){
        ii curr = q.front(); q.pop();
        xc = curr.first;
        yc = curr.second;
        if(grid[xc][yc]=='D'){
            xr = xc + 1;
            yr = yc;
            if(xr>-1&&yr>-1&&xr<R&&yr<C){
                if(!no[xr][yr]&&dis[xr][yr]>dis[xc][yc]){
                    dis[xr][yr]=dis[xc][yc];
                    q.push(make_pair(xr,yr));
                }
            }
            continue;
        } else if (grid[xc][yc]=='U'){
            xr = xc - 1;
            yr = yc;
            if(xr>-1&&yr>-1&&xr<R&&yr<C){
                if(!no[xr][yr]&&dis[xr][yr]>dis[xc][yc]){
                    dis[xr][yr]=dis[xc][yc];
                    q.push(make_pair(xr,yr));
                }
            }
            continue;
        } else if (grid[xc][yc]=='L'){
            yr = yc - 1;
            xr = xc;
            if(xr>-1&&yr>-1&&xr<R&&yr<C){
                if(!no[xr][yr]&&dis[xr][yr]>dis[xc][yc]){
                    dis[xr][yr]=dis[xc][yc];
                    q.push(make_pair(xr,yr));
                }
            }
            continue;
        } else if (grid[xc][yc]=='R'){
            yr = yc + 1;
            xr = xc;
            if(xr>-1&&yr>-1&&xr<R&&yr<C){
                if(!no[xr][yr]&&dis[xr][yr]>dis[xc][yc]){
                    dis[xr][yr]=dis[xc][yc];
                    q.push(make_pair(xr,yr));
                }
            }
            continue;
        }
        for(int i = 0; i < 4; i++){
            xr = xc + d[i][0];
            yr = yc + d[i][1];
            if(xr>-1&&yr>-1&&xr<R&&yr<C){
                if(!no[xr][yr]&& dis[xr][yr]>dis[xc][yc]+1){
                    dis[xr][yr]=dis[xc][yc]+1;
                    q.push(make_pair(xr,yr));
                }
            }
        }
    }
    if(no[sx][sy]){
        flag=true;
    }
    for(int i = 0; i < R; i++){
        for(int j = 0; j < C; j++){
            if(grid[i][j]=='.'&&!(i==sx&&j==sy)){
                if(dis[i][j]==INT_MAX||flag){
                    cout<<-1<<"\n";
                } else {
                    cout<<dis[i][j]<<"\n";
                }
            }
        }
    }
    return 0;
}
