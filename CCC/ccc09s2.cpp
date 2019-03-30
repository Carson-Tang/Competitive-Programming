#include <iostream>
#include <bits/stdc++.h>
#include <string>
using namespace std;
int R,L,l;
string z;
set<string>s;
int dp[10],A[30][8];
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>R>>L;
    for(int i = R-1; i >= 0; i--){
        for(int j = 0; j < L; j++){
            cin>>A[i][j];
        }
    }
    for(int i = 0; i < R; i++){
        z="";
        for(int j = 0; j < L; j++){
            if(!i) dp[j]=A[i][j];
            else dp[j]^=A[i][j];
            z+=to_string(dp[j]);
        }
        s.insert(z);
    }
    cout<<s.size()<<"\n";
    return 0;
}
