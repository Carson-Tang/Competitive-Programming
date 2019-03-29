#include <iostream>
#include <bits/stdc++.h>
using namespace std;
int len,cmd,l,r,x,u,v,n,q,block[450][200001],a[200001],ans,stb,edb;
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n>>q;
    len = sqrt(n);
    for(int i = 0; i < n; i++){
        cin>>a[i];
        for(int j = 1; j <= sqrt(a[i]); j++){
            if(!(a[i]%j)){
                block[i/len][j]++;
                if(a[i]/j!=j)block[i/len][a[i]/j]++;
            }
        }
    }
    while(q--){
        cin>>cmd;
        if(cmd==1){
            cin>>l>>r>>x;
            l--;
            ans = 0; stb = (l+len-1)/len; edb = r/len;
            for(int i = stb; i < edb; i++){
                ans += block[i][x];
            }
            for(int i = l; i < stb*len; i++){
                if(!(a[i]%x)) ans++;
            }
            for(int i = edb*len; i < r; i++){
                if(!(a[i]%x)) ans++;
            }
            cout<<ans<<"\n";
        } else {
            cin>>u>>v;
            u--;
            for(int i = 1; i <= sqrt(a[u]); i++){
                if(!(a[u]%i)){
                    block[u/len][i]--;
                    if(a[u]/i!=i)block[u/len][a[u]/i]--;
                }
            }
            a[u]=v;
            for(int i = 1; i <= sqrt(a[u]); i++){
                if(!(a[u]%i)){
                    block[u/len][i]++;
                    if(a[u]/i!=i)block[u/len][a[u]/i]++;
                }
            }
        }
    }
    return 0;
}
