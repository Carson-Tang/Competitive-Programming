#include <iostream>
#include <bits/stdc++.h>
using namespace std;
int n,arr[1000001],bit[1000001];
void update(int x, int v){
    while(x<=n){
        bit[x] = max(bit[x],v);
        x+=x&-x;
    }
}
int query(int idx){
    int ans = 0;
    while(idx>0){
        ans = max(ans,bit[idx]);
        idx-=idx&-idx;
    } return ans;
}
vector<int>cc;
unordered_map<int,int>mp;
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n;
    for(int i = 1; i <= n; i++){
        cin>>arr[i];
        cc.push_back(arr[i]);
    }
    sort(cc.begin(),cc.end());
    cc.erase(unique(cc.begin(),cc.end()),cc.end());
    int val = 0;
    for(int i : cc) mp[i] = val++;
    for(int i = 1; i <= n; i++){
        val = mp[arr[i]];
        int mx = query(val)+1;
        update(val+1,mx);
    }
    cout<<query(n)<<"\n";
    return 0;
}
