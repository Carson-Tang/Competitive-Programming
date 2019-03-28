#include <iostream>
#include <bits/stdc++.h>
#include <string>
#include <cstdlib>
#include <fstream>
using namespace std;
#define MAXN 100001
#define MOD 1000000007
typedef long long ll;
typedef unsigned long long ull;
typedef pair<int,int>ii;
ll n,a,t,ans;
struct cow {
    ll a,t,idx;
    bool operator<(const cow &cc)const{
        return cc.idx<idx;
    }
};
struct cow2 {
    ll a,t,idx;
    bool operator<(const cow2 &cc)const{
        if(cc.a==a) return cc.idx<idx;
        return cc.a<a;
    }
};
priority_queue<cow2>tt;
priority_queue<cow>nxt;
int main(){
    ofstream fout ("convention2.out");
    ifstream fin ("convention2.in");
    fin>>n;
    for(int i = 0; i < n; i++){
        fin>>a>>t;
        tt.push({a,t,i+1});
    }
    ll curtime = 0;
    cow2 temp = tt.top(); tt.pop();
    nxt.push({temp.a,temp.t});
    curtime = temp.a;
    while(!nxt.empty()){
        cow cur = nxt.top(); nxt.pop();
        ans = max(ans,(ll)curtime-cur.a);
        curtime += cur.t;
        while(!tt.empty()){
            if(tt.top().a<=curtime){
                nxt.push({tt.top().a,tt.top().t,tt.top().idx});
                tt.pop();
            } else break;
        }
        if(nxt.empty()&&!tt.empty()){
            curtime = tt.top().a;
            nxt.push({tt.top().a,tt.top().t,tt.top().idx});
            tt.pop();
        }
    }
    fout<<ans;
    return 0;
}
