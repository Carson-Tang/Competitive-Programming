#include <bits/stdc++.h>
using namespace std;

int n,k,a[105],dp[100005];
int main(){
    scanf("%d %d",&n,&k);
    for(int i = 0; i < n; i++) scanf("%d",&a[i]);
    for(int i = 0; i <= k; i++){
        for(int j = 0; j < n; j++){
            if(i-a[j]>=0) dp[i] |= !dp[i-a[j]];
        }
    }
    if(!dp[k]) printf("Second\n");
    else printf("First\n");
    return 0;
}
