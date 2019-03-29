#include <iostream>
#include <bits/stdc++.h>
using namespace std;
int n,t,a[15],ans,sum;
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n>>t;
    for(int i = 0; i < n; i++) cin>>a[i];
    for(int i = 0; i < (1<<n); i++){
        sum = 0;
        for(int j = 0; j < n; j++){
            if(i&(1<<j)){
                sum+=a[j];
            }
        }
        if(sum==t) ans++;
    }
    cout<<ans<<"\n";
    return 0;
}
