#include <iostream>
#include <bits/stdc++.h>
using namespace std;
#define MAXN 10002
int N,M,x,y,w,h,cnt;
short A[MAXN][MAXN];
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>N>>M;
    for(int i = 0; i < M; i++){
        cin>>x>>y>>w>>h;
        x++; y++;
        A[x][y]++;
        A[x+w][y+h]++;
        A[x][y+h]--;
        A[x+w][y]--;
    }
    for(int i = 1; i <= N; i++){
        for(int j = 1; j <= N; j++){
            A[i-1][j]%=2;
            A[i][j]+=A[i-1][j];
            A[i][j]%=2;
        }
    }
    for(int i = 1; i <= N; i++){
        for(int j = 1; j <= N; j++){
            A[i][j-1]%=2;
            A[i][j]+=A[i][j-1];
            if(A[i][j]==1||A[i][j]==-1){
                cnt++;
            }
        }
    }
    cout<<cnt<<"\n";
    return 0;
}
