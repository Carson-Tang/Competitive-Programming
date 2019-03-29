#include <bits/stdc++.h>
#include <iostream>
using namespace std;
int n,v,d[2001],dp[10001],ans[100001],p;
struct qq{
    int idx,c,l;
    bool operator<(const qq &a)const{
        return a.l>l;
    }
};
qq q[100001];
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n>>v;
    for(int i = 1; i < 10001; i++) dp[i]=999999;
    for(int i = 1; i <= n; i++) cin>>d[i];
    for(int i = 0; i < v; i++){
        cin>>q[i].c>>q[i].l;
        q[i].idx=i;
    }
    sort(q,q+v);
    for(int i = 0; i < v; i++){
        while(p<=q[i].l){
            for(int i = 1; i < 10001; i++){
                if(i-d[p]>=0) dp[i] = min(dp[i],dp[i-d[p]]+1);
            }
            p++;
        }
        if(dp[q[i].c]==999999) ans[q[i].idx]=-1;
        else ans[q[i].idx] = dp[q[i].c];
    }
    for(int i = 0; i < v; i++){
        cout<<ans[i]<<"\n";
    }
    return 0;
}
