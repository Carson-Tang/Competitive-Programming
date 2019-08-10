#include <bits/stdc++.h>
#include <iostream>
using namespace std;
typedef long long ll;

map<string,ll>mp;
pair<ll,string> a[1005];
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    int f,n; string s; ll e;
    cin>>f;
    for(int i = 0; i < f; i++){
        cin>>s>>e;
        mp[s]=e;
    }
    cin>>n;
    for(int i = 0; i < n; i++){
        cin>>a[i].second>>a[i].first;
    }
    sort(a,a+n);
    ll energy = 0;
    int pos = 0, idx = 0, ans = 0;
    for(int i = 0; i < n; i++){
        if(pos==a[i].first){
            energy+=mp[a[i].second];
            ans++;
        } else {
            energy -= a[i].first-pos;
            if(energy<0) break;
            pos = a[i].first;
            ans++;
            energy += mp[a[i].second];
        }
    }
    cout<<ans<<"\n";
    return 0;
}
