#include <iostream>
#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
int n,h[200005],a[200005]; ll bit[200005],ans;
void update(int idx, ll val){
    while(idx<=n){
        bit[idx] = max(bit[idx],val);
        idx += idx&-idx;
    }
}
ll query(int idx){
    ll ret = 0;
    while(idx>0){
        ret = max(bit[idx],ret);
        idx -= idx&-idx;
    } return ret;
}
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n;
    for(int i = 0; i < n; i++) cin>>h[i];
    for(int i = 0; i < n; i++) cin>>a[i];
    for(int i = 0; i < n; i++){
        ll pos = query(h[i]-1)+a[i];
        update(h[i],pos);
        ans = max(ans,pos);
    }
    cout<<ans<<"\n";
    return 0;
}
