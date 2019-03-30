#include <bits/stdc++.h>
#include <iostream>
using namespace std;
int dest,d,n,dp[5281];
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    for(int i = 1; i <= 5280; i++) dp[i]=99999;
    cin>>dest;
    cin>>n;
    for(int i = 0; i < n; i++){
        cin>>d;
        for(int j = 0; j <= dest; j++){
            if(j-d>=0){
                dp[j] = min(dp[j],dp[j-d]+1);
            }
        }
    }
    if(dp[dest]!=99999) cout<<"Roberta wins in "<<dp[dest]<<" strokes.\n";
    else cout<<"Roberta acknowledges defeat.\n";
    return 0;
}
