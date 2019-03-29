#include <iostream>
#include <bits/stdc++.h>
using namespace std;
int n; long long ans;
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n;
    while(n!=1){
        for(int i = n-1; i >= 1; i--){
            if(!(n%i)){
                n -= i;
                ans += n/i;
                break;
            }
        }
    }
    cout<<ans<<"\n";
    return 0;
}
