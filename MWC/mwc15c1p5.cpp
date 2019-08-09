#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

ll fast_pow(ll b, ll p) {
    ll r = 1;
    while(p > 0) {
        if(p % 2 == 1) r = (r*b) % 10;
        b = (b * b) % 10;
        p = p / 2;
    } return r;
}
string a,b;
ll a1,a2;
int main(){
    cin>>a;
    for(int i = 0; i < a.size(); i++){
        int c = ((a[i]>='A' && a[i]<='Z') ? (a[i]-'A') : (a[i]-'a')) + 1;
        a1 = (a1 + fast_pow(c,i+1))%10;
    }
    if(!a1) a1=10;
    cin>>a;
    for(int i = 0; i < a.size(); i++){
        int c = ((a[i]>='A' && a[i]<='Z') ? (a[i]-'A') : (a[i]-'a')) + 1;
        a2 = (a2 + fast_pow(c,i+1))%10;
    }
    if(!a2) a2=10;
    cout<<(a1+a2)<<"\n";
    return 0;
}
