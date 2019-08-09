#include <bits/stdc++.h>
using namespace std;

int a1,a2,row,col,k,d[30005][1005],x,y,r,b;
int main(){
    scanf("%d %d",&row,&col);
    scanf("%d",&k);
    for(int i = 0; i < k; i++){
        scanf("%d %d %d %d",&y,&x,&r,&b);
        for(int j = y-r; j <= y+r; j++){
            if(j > 0 && j <= col){
                int yc = x + floor(sqrt(r*r - (j-y)*(j-y))); 
                int yc2 = x - floor(sqrt(r*r - (j-y)*(j-y))); 
                yc2 = max(yc2,1);
                yc = min(yc,row);
                d[yc+1][j]-=b;
                d[yc2][j]+=b;
            }
        }
    }
    for(int i = 1; i <= row; i++){
        for(int j = 1; j <= col; j++){
            d[i][j]+=d[i-1][j];
            if(d[i][j]>a1){
                a2=0;
                a1=d[i][j];
            }
            if (d[i][j]==a1) a2++;
        }
    }
    printf("%d\n%d\n",a1,a2);
    return 0;
}
