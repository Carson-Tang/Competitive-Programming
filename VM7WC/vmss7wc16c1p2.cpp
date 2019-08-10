#include <bits/stdc++.h>
using namespace std;

int n,a,ans,c[65];
int main(){
    scanf("%d",&n);
    for(int i = 0; i < n; i++){
        scanf("%d",&a);
        c[a]++;
    }
    for(int i = 64; i >= 0; i--){
        if(c[i]==i){
            ans=i;
            break;
        }
    }
    if(!ans && c[0])printf("Paradox!\n");
    else printf("%d\n",ans);
    return 0;
}
