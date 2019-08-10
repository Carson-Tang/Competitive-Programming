#include <bits/stdc++.h>
using namespace std;
int tc,n,m,d,arr[1005],a,ans,t;
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    tc = 10;
    while(tc--){
        cin>>n>>m>>d;
        ans = 0;
        t = n;
        memset(arr,0,sizeof arr);
        for(int i = 0; i < m; i++){
            cin>>a;
            arr[a]++;
        }
        for(int i = 1; i <= d; i++){
            if(!n){
                ans++;
                n = t;
            }
            n--;
            t += arr[i];
            n += arr[i];
        }
        cout<<ans<<"\n";
    }
    return 0;
}
