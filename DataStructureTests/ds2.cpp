#include <iostream>
#include <bits/stdc++.h>
using namespace std;
typedef pair<int,int>ii;
int n,m,u,v,parent[100005]; vector<pair<ii,int>>edges;
int Find(int p){
    if(p!=parent[p]){
        parent[p]=Find(parent[p]);
    } return parent[p];
}
void Union(int a, int b){
    parent[Find(a)] = Find(b);
}
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n>>m;
    for(int i = 0; i < m; i++){
        cin>>u>>v;
        edges.push_back({{u,v},i+1});
    }
    vector<int>ans;
    for(int i = 0; i < 100005; i++) parent[i]=i;
    for(pair<ii,int> pp : edges){
        int a = pp.first.first;
        int b = pp.first.second;
        if(Find(a)!=Find(b)){
            Union(a,b);
            ans.push_back(pp.second);
        }
    }
    if(ans.size()!=(n-1)) cout<<"Disconnected Graph\n";
    else for(int a : ans) cout<<a<<"\n";
    return 0;
}
