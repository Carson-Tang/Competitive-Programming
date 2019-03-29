#include <bits/stdc++.h>
#include <iostream>
using namespace std;
string fib[201];
int n,tot;
string add(string a, string b){
    string ret = "";
    if(a.size()<b.size()) swap(a,b);
    while(b.size()<a.size()) b = "0" + b;
    bool flag = 0;
    tot = 0;
    for(int i = a.size()-1; i >= 0; i--){
        tot = 0;
        tot += a[i]-48;
        tot += b[i]-48;
        if(flag) tot++;
        flag = ((tot>9)?1:0);
        tot %= 10;
        ret = to_string(tot) + ret;
    }
    if(flag) ret = "1" + ret;
    return ret;
}
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    fib[1]=fib[2]="1";
    for(int i = 3; i <= 200; i++){
        fib[i] = add(fib[i-1],fib[i-2]);
    }
    while(1){
        cin>>n;
        if(!n) break;
        cout<<fib[n]<<"\n";
    }
    return 0;
}
