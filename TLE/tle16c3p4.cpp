#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int n,m; long long tot;
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n>>m;
    if(n==1||m==1) cout<<"First\n";
    else{
        tot = n+m;
        cout<<((tot%2)?"First\n":"Second\n");
    }
    return 0;
}
