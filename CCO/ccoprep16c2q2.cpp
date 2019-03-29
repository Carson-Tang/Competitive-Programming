#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int n,a,b[33],ans;
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n;
    for(int i = 0; i < n; i++){
        cin>>a;
        int pos = 0;
        for(int j = 0; j < 33; j++){
            if((a&(1<<j))){
                pos = max(pos,b[j]);
            }
        }
        for(int j = 0; j < 33; j++){
            if((a&(1<<j))){
                b[j] = max(b[j],pos+1);
            }
        }
    }
    for(int i = 0; i < 33; i++) ans = max(ans,b[i]);
    cout<<ans<<"\n";
    return 0;
}
