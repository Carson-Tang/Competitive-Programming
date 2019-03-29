#include <iostream>
#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
typedef pair<ll,int>lli;
int c,a[100001]; ll t,m;
priority_queue<lli,vector<lli>,greater<lli>>pq;
unordered_map<ll,int>mp;
int main() {
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>c>>t;
    for(int i = 0; i < c; i++){
        cin>>m;
        mp[m]++;
    }
    for(auto const& a : mp){
        pq.push({a.first,a.second});
    }
    while(t>0){
        lli a = pq.top(); pq.pop();
        if(pq.empty()){
            cout<<a.first+t/a.second<<"\n";
            return 0;
        }
        lli b = pq.top(); pq.pop();
        if(t > (b.first-a.first) * a.second){
            t -= (b.first-a.first) * a.second;
            pq.push({b.first,a.second+b.second});
        } else {
            cout<<a.first+t/a.second<<"\n";
            return 0;
        }
    }
    cout<<pq.top().first<<"\n";
    return 0;
}
