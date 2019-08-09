#include <bits/stdc++.h>

using namespace std;

int n,a,b,c,d,m[5][4]={{2,1,0,2},{1,1,1,1},{0,0,2,1},{0,3,0,0},{1,0,0,1}};
bool dp[31][31][31][31];
bool solve(int a, int b, int c, int d){
    if(a<0||b<0||c<0||d<0) return 0;
    else return !dp[a][b][c][d];
}
int main(){
    scanf("%d",&n);
    for(int i = 0; i < 31; i++){
        for(int j = 0; j < 31; j++){
            for(int k = 0; k < 31; k++){
                for(int l = 0; l < 31; l++){
                    for(int o = 0; o < 5; o++){
                        if(solve(i-m[o][0],j-m[o][1],k-m[o][2],l-m[o][3])){
                            dp[i][j][k][l]=1;
                        }
                    }
                }
            }
        }
    }
    for(int i = 0; i < n; i++){
        scanf("%d %d %d %d",&a,&b,&c,&d);
        if(dp[a][b][c][d]) printf("Patrick\n");
        else printf("Roland\n");
    }
    return 0;
}
