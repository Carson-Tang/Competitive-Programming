#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
int n,mx,a[1000005]; ll ans;
int main(){
    scanf("%d",&n);
    for(int i = 0; i < n; i++){
        scanf("%d",&a[i]);
    }
    mx = a[0];
    for(int i = 1; i < n; i++){
        ans += max(mx,a[i]);
        mx = a[i];
    }
    printf("%lld\n",ans);
    return 0;
}
