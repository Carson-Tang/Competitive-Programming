#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
int del,ins,rep; string s,t; ll ans;
int solve(){
    vector<int>a(s.length()+1);
    a[0]=0;
    for(int i = 1; i <= s.length(); i++) a[i]=a[i-1]+del;
    for(int j = 1; j <= t.length(); j++){
        int pv = a[0], pvs;
        a[0]+=ins;
        for(int i = 1; i <= s.length(); i++){
            pvs = a[i];
            if(s[i-1]==t[j-1]){
                a[i]=pv;
            } else {
                a[i] = min(a[i-1]+del,min(a[i]+ins,pv+rep));
            }
            pv = pvs;
        }

    } return a[s.length()];
}
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>del>>ins>>rep>>s>>t;
    cout<<solve()<<"\n";
    return 0;
}
