#include <iostream>
#include <bits/stdc++.h>
using namespace std;
#define MAXN 2001
char grid[MAXN][MAXN];
int N,M;
string s;
void dfs(int i, int j){
    if(grid[i][j]=='N'){
        for(int k = i-1; k >= 0; k--){
            if(grid[k][j]!='.'){
                dfs(k,j);
            }
        }
    } else if (grid[i][j]=='S'){
        for(int k = i+1; k < N; k++){
            if(grid[k][j]!='.'){
                dfs(k,j);
            }
        }
    } else if (grid[i][j]=='E'){
        for(int k = j+1; k < M; k++){
            if(grid[i][k]!='.'){
                dfs(i,k);
            }
        }
    } else if (grid[i][j]=='W'){
        for(int k = j-1; k >= 0; k--){
            if(grid[i][k]!='.'){
                dfs(i,k);
            }
        }
    }
    grid[i][j]='.';
    cout<<"("<<i<<","<<j<<")\n";
}
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>N>>M;
    for(int i = 0; i < N; i++){
        cin>>s;
        for(int j = 0; j < M; j++){
            grid[i][j]=s.at(j);
        }
    }
    for(int i = 0; i < N; i++){
        for(int j = 0; j < M; j++){
            if(grid[i][j]!='.'){
                dfs(i,j);
            }
        }
    }
    return 0;
}
