#include <iostream>
#include <fstream>
#include <string>
#include <bits/stdc++.h>
#define MOD 1000000007
using namespace std;
typedef long long ll;
typedef unsigned long long ull;
typedef pair<int,int>ii;
int N,s,t,b,ans,ar[1001];
int main(){
    ofstream fout ("blist.out");
    ifstream fin ("blist.in");
    fin>>N;
    for(int i = 1; i <= N; i++){
        fin>>s>>t>>b;
        for(int j = s; j <= t; j++){
            ar[j]+=b;
        }
    }
    for(int i = 0; i < 1001; i++){
        ans = max(ans,ar[i]);
    }
    fout<<ans;
    return 0;
}
