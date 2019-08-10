#include <bits/stdc++.h>
using namespace std;

int n,q,l,r,a,f[11],ff[11],psa[500005][11];
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n>>q;
    for(int i = 1; i <= n; i++){
        cin>>a;
        f[a]++;
        psa[i][a]++;
        for(int j = 1; j <= 10; j++) psa[i][j] += psa[i-1][j];
    }
    while(q--){
        cin>>l>>r;
        for(int i = 1; i <= 10; i++){
            ff[i] = f[i] - psa[r][i] + psa[l-1][i];
        }
        for(int i = 10; i >= 1; i--){
            if(ff[i]){
                cout<<i<<" "<<ff[i]<<"\n";
                break;
            }
        }
    }
    return 0;
}
