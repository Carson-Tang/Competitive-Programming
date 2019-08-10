#include <bits/stdc++.h>
using namespace std;

int n,k,p[100005],f[100005],c,ans;
bool check(int fcap){
    int last = 0, sc = 0, fl = fcap;
    for(int i = 0; i < n; i++){
        int d = p[i]-last;
        if(d>fcap) return 0;
        if(fl>=d){
            fl -= d;
        } else {
            sc++;
            fl = fcap-d;
        }
        if(f[i]||i==n-1){
            sc++;
            fl = fcap;
        }
        last = p[i];
    }
    return sc <= k;
}
int main(){
    scanf("%d %d",&n,&k);
    for(int i = 0; i < n; i++){
        scanf("%d %d",&p[i],&f[i]);
        if(f[i]) c++;
    }
    if(c>k){
        printf("DEA Bust!\n");
        return 0;
    }
    int lo = 0, hi = 1000000000;
    while(lo<=hi){
        int mid = (lo+hi)/2;
        if(check(mid)){
            ans = mid;
            hi = mid-1;
        } else {
            lo = mid+1;
        }
    }
    printf("%d\n",ans);
    return 0;
}
