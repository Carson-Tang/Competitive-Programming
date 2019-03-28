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
ll n,m,c,ans,a[100001],sum;
bool check(int mx){
    ll cars = 1,mn=-1,cnt=0;
    for(int i = 0; i < n; i++){
        if(mn==-1) mn=a[i];
        cnt++;
        if(a[i]-mn>mx||cnt==c+1){
            mn=a[i];
            cars++;
            cnt=1;
        }
    }
    return cars<=m;
}
int main(){
    ofstream fout ("convention.out");
    ifstream fin ("convention.in");
    fin>>n>>m>>c;
    for(int i = 0; i < n; i++){
        fin>>a[i];
        sum+=a[i];
    }
    sort(a,a+n);
    ll lo = 0, hi = a[n-1]-a[0];
    while(lo<=hi){
        int mid = (lo+hi)/2;
        if(check(mid)){
            hi = mid-1;
            ans=mid;
        } else {
            lo = mid+1;
        }
    }
    fout<<ans;
    return 0;
}
