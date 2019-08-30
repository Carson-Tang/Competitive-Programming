#include <bits/stdc++.h>
using namespace std;

int h,v,y[1505],x[1505],ans; unordered_map<int,int>f;
int main(){
    scanf("%d %d",&h,&v);
    for(int i = 0; i < h; i++){
        scanf("%d",&y[i]);
        for(int j = 0; j < i; j++){
            f[y[i]-y[j]]++;
        }
    }
    for(int i = 0; i < v; i++){
        scanf("%d",&x[i]);
        for(int j = 0; j < i; j++){
            ans += f[x[i]-x[j]];
        }
    }
    printf("%d\n",ans);
    return 0;
}
