#include <iostream>
#include <bits/stdc++.h>
using namespace std;
int cnt,n,k,r,v,ans;
bool c[100001];
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n>>k>>r;
    for(int i = 0; i < k; i++){
        cin>>v;
        c[v]=1;
    }
    for(int i = 0; i < r; i++) if(c[i]) cnt++;
    int lb = 0, rb = r-1;
    while(rb<n){
        int idx = rb;
        while(cnt<2){
            if(!c[idx]) {
                c[idx]=1;
                idx--;
                cnt++;
                ans++;
            }
        }
        cnt-=c[lb++];
        cnt+=c[++rb];
    }
    cout<<ans<<"\n";
    return 0;
}
