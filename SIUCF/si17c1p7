#include <iostream>
#include <bits/stdc++.h>
using namespace std;
int n,d[100001][2],v,o; double t;
int main() {
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n;
    for(int i = 0; i < n; i++){
        cin>>d[i][0]>>d[i][1];
    }
    o = d[0][0];
    v = d[0][1];
    for(int i = 1; i <= n; i++){
        if(d[i][1]>v||!d[i][0]){
            t+=(double)(o-d[i][0])/v;
            o=d[i][0];
            v=d[i][1];
            if(!d[i][0])break;
        }
    }
    cout<<t<<"\n";
    return 0;
}
