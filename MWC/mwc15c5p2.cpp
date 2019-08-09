#include <bits/stdc++.h>
using namespace std;

int n,k,t,a,p1,p2; bool tt; map<int,int>mp;
int main(){
    scanf("%d %d %d",&n,&k,&t);
    tt = t == 1;
    for(int i = 0; i < n; i++){
        scanf("%d",&a);
        if(mp[k-a]){
            mp[k-a]--;
            if(tt) p1++;
            else p2++;
            tt = !tt;
        } else mp[a]++;
    }
    if(tt) printf("aurpine %d\n",p2);
    else printf("kushanzaveri %d\n",p1);
    return 0;
}
