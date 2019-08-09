#include <iostream>
#include <bits/stdc++.h>
using namespace std;
int n,m,a[4],ans,src,cost[1<<20],mask,msk; string s;
queue<pair<int,int>>q;
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n>>m;
    for(int i = 0; i < 4; i++) cin>>a[i];
    cin>>s;
    for(int i = 0; i < (1<<20); i++) cost[i]=99999;
    for(int i = 0; i < n; i++){
        if(s[i]=='B') src|=(1<<i);
    }
    cost[src]=0;
    q.push({src,0});
    while(q.size()){
        auto u = q.front(); q.pop();
        int c = u.second;
        for(int i = 0; i < n; i++){
            int msk = u.first ^ (1<<i);
            if(cost[msk]>c+a[0] && c+a[0]<=m){
                cost[msk]=c+a[0];
                q.push({msk,c+a[0]});
            }
        }
        msk = 0;
        for(int i = 0; i < n-1; i++){
            if(u.first&(1<<i)){
                msk|=(1<<(i+1));
            }
        }
        if(u.first&(1<<(n-1))){
            msk|=(1<<0);
        }
        if(cost[msk]>c+a[2] && c+a[2]<=m){
            cost[msk]=c+a[2];
            q.push({msk,c+a[2]});
        }
        msk = 0;
        for(int i = 1; i < n; i++){
            if(u.first&(1<<i)){
                msk|=(1<<(i-1));
            }
        }
        if(u.first&(1<<0)){
            msk|=(1<<(n-1));
        }
        if(cost[msk]>c+a[1] && c+a[1]<=m){
            cost[msk]=c+a[1];
            q.push({msk,c+a[1]});
        }
        mask = (1<<n)-1;
        msk = ~u.first & mask;
        if(cost[msk]>c+a[3] && c+a[3]<=m){
            cost[msk]=c+a[3];
            q.push({msk,c+a[3]});
        }
    }
    for(int i = 0; i < (1<<n); i++){
        if(cost[i]<=m) ans++;
    }
    cout<<ans<<"\n";
    return 0;
}
