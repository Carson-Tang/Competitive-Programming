#include <ext/pb_ds/assoc_container.hpp>
#include <ext/pb_ds/tree_policy.hpp>
#include <bits/stdc++.h>
#include <iostream>
using namespace std;
using namespace __gnu_pbds;
#define ordered_set tree<pair<int,int>, null_type,less<pair<int,int>>, rb_tree_tag,tree_order_statistics_node_update>
ordered_set o_set[100005]; char cmd;
int n,m,x,y,k,q,arr[100005],p[100005],sz[100005];
int Find(int v){
    if(p[v]!=v){
        p[v]=Find(p[v]);
    } return p[v];
}
void Union(int x, int y){
    int xr = Find(x), yr = Find(y);
    if(xr==yr) return;
    if(sz[xr]<sz[yr]) swap(xr,yr);
    p[yr]=xr;
    sz[xr]+=sz[yr];
    for(auto i : o_set[yr]){
        o_set[xr].insert(i);
    }
}
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n>>m;
    for(int i = 1; i <= n; i++){
        cin>>arr[i];
        o_set[i].insert({arr[i],i});
        p[i]=i;
        sz[i]=1;
    }
    for(int i = 0; i< m; i++){
        cin>>x>>y;
        Union(x,y);
    }
    cin>>q;
    while(q--){
        cin>>cmd;
        if(cmd=='B'){
            cin>>x>>y;
            Union(x,y);
        } else if (cmd=='Q'){
            cin>>x>>k;
            if(sz[p[x]]<k) cout<<-1<<"\n";
            else cout<<o_set[p[x]].find_by_order(k-1)->second<<"\n";
        }
    }
    return 0;
}
