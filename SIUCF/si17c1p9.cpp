#include <bits/stdc++.h>
#include <iostream>
using namespace std;
int r,c,xr,yr,c1,c2,ans,d[8][2]={{1,0},{-1,0},{0,1},{0,-1},{1,1},{1,-1},{-1,-1},{-1,1}};
char g[105][105];
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>r>>c;
    for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
            cin>>g[i][j];
        }
    }
    for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
            c1=0;
            c2=0;
            if(g[i][j]!='S'){
                for (int k = 0; k < 8; k++) {
                    xr = i + d[k][0];
                    yr = j + d[k][1];
                    if (xr > -1 && yr > -1 && xr < r && yr < c) {
                        c1++;
                        if (g[xr][yr] == 'S') {
                            c2++;
                        }
                    }
                }
                if(c1>2*c2) ans++;
            }
        }
    }
    cout<<ans<<"\n";
    return 0;
}
