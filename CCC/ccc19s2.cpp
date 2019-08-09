#include <bits/stdc++.h>
using namespace std;

int t,n;
bool isPrime(int n){
    if(n==2) return 1;
    if(!(n%2)) return 0;
    for(int i = 3; i <= sqrt(n); i++){
        if(!(n%i)) return 0;
    } return 1;
}
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>t;
    while(t--){
        cin>>n;
        for(int i = 2; i <= n; i++){
            if(isPrime(i)){
                if(isPrime(n*2-i)){
                    cout<<i<<" "<<n*2-i<<"\n";
                    break;
                }
            }
        }
    }
    return 0;
}
