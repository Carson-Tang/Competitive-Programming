#include <iostream>
#include <bits/stdc++.h>
using namespace std;
#define MAXN 50001
int N,Q,l,r,A[MAXN],mx[16][MAXN],mn[16][MAXN],x;
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>N>>Q;
    for(int i = 1; i <= N; i++){
        cin>>A[i];
        mx[0][i]=A[i];
        mn[0][i]=A[i];
    }
    for(int k = 1; k < 16; k++){
        for(int i = 1; i + (1<<k)-1 <= N; i++){
            mx[k][i] = max(mx[k-1][i],mx[k-1][i+(1<<(k-1))]);
            mn[k][i] = min(mn[k-1][i],mn[k-1][i+(1<<(k-1))]);
        }
    }
    for(int i = 1; i <= Q; i++){
        cin>>l>>r;
        x = (int)log2(r-l+1);
        cout << max(mx[x][l],mx[x][r-(1<<x)+1]) - min(mn[x][l],mn[x][r-(1<<x)+1])<<"\n";
    }
    return 0;
}
