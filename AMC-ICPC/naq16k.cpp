#include <bits/stdc++.h>
using namespace std;

int n,a1,b1,a2,b2,at,bt;
void solve(){
    scanf("%d %d %d %d %d %d",&a1,&b1,&a2,&b2,&at,&bt);
    int x = -1, y = -1;
    for(int i = 1; i*a1 <= at; i++){
        int px = i;
        if(px*b1>bt) continue;
        int w = at - a1 * px;
        if(w%a2 || w <= 0) continue;
        int py = w/a2;
        if(b1*px + b2*py == bt && a1*px + a2*py == at){
            if(x!=-1){
                printf("?\n");
                return;
            }
            x = px;
            y = py;
        }
    }
    if(x==-1) printf("?\n");
    else printf("%d %d\n",x,y);
}
int main(){
    scanf("%d",&n);
    for(int i = 0; i < n; i++) solve();
    return 0;
}
