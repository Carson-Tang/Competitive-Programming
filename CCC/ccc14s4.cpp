#include <iostream>
#include <bits/stdc++.h>
using namespace std;
#define MAXN 2002
long long N,T;
vector<long long>x,y;
long long xl,yt,xr,yb,ti;
struct glass {
    long long topleftx,toplefty,botrightx,botrighty,tint;
};
vector<glass>tints;
long long A[MAXN][MAXN];
unordered_map<long long,int>xc, yc;
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>N;
    cin>>T;
    for(int i = 0; i < N; i++){
        cin>>xl>>yt>>xr>>yb>>ti;
        x.push_back(xl);
        x.push_back(xr);
        y.push_back(yt);
        y.push_back(yb);
        tints.push_back(glass{xl,yt,xr,yb,ti});
    }
    sort(x.begin(),x.end());
    sort(y.begin(),y.end());
    x.erase(unique(x.begin(),x.end()),x.end());
    y.erase(unique(y.begin(),y.end()),y.end());
    int val = 0;
    for(int a : x) xc[a] = val++;
    val=0;
    for(int b : y) yc[b] = val++;
    for(glass c : tints){
        A[xc[c.topleftx]][yc[c.toplefty]]+=c.tint;
        A[xc[c.botrightx]][yc[c.botrighty]]+=c.tint;
        A[xc[c.topleftx]][yc[c.botrighty]]-=c.tint;
        A[xc[c.botrightx]][yc[c.toplefty]]-=c.tint;
    }
    for(int i = 0; i < x.size(); i++){
        for(int j = 1; j < y.size(); j++){
            A[i][j] += A[i][j-1];
        }
    }
    for(int i = 1; i < x.size(); i++){
        for(int j = 0; j < y.size(); j++){
            A[i][j] += A[i-1][j];
        }
    }
    long long area = 0;
    for(int i = 0; i < x.size(); i++){
        for(int j = 0; j < y.size(); j++){
            if(A[i][j]>=T){
                area+=(x[i+1]-x[i])*(y[j+1]-y[j]);
            }
        }
    }
    cout<<area;
    return 0;
}
