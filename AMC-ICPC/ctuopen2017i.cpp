#include <bits/stdc++.h>
using namespace std;

int n,a[200005];
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    while(cin>>n){
        for(int i = 1; i <= n; i++) cin>>a[i];
        int ans = 0;
        for(int i = 1; i <= n; i++){
            while(a[i]!=i){
                ans++;
                swap(a[a[i]],a[i]);
            }
        }
        cout<<ans<<"\n";
    }
    return 0;
}
