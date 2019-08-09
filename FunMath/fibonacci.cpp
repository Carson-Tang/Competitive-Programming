#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
typedef unsigned long long ull;
unordered_map<ull,ull>meme;
ull n;
ull fib(ull v){
    if(meme[v]) return meme[v];
    if(v==0) return 0;
    if(v==1||v==2){
        meme[v]=1;
        return meme[v];
    }
    ull temp;
    if(v%2==0){
        temp=v/2;
        meme[v]= ((2*fib(temp-1)%MOD + fib(temp)%MOD)*fib(temp)%MOD)%MOD;
    } else {
        temp=(v+1)/2;
        meme[v] = (fib(temp)%MOD*fib(temp)%MOD+fib(temp-1)%MOD*fib(temp-1)%MOD)%MOD;
    }
    return meme[v];
}
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n;
    cout<<fib(n)%MOD;
    return 0;
}
