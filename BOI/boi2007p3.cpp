#include <bits/stdc++.h>
#include <iostream>
using namespace std;
int n,m,c,arr[1020010]; bool flag;
int ragelo[3060030],ragehi[3060030];
void build(int node, int l, int r){
    if(l==r){
        ragelo[node] = arr[l];
        ragehi[node] = arr[l];
    } else {
        int mid = (l+r)/2;
        build(node*2,l,mid);
        build(node*2+1,mid+1,r);
        ragelo[node] = min(ragelo[node*2],ragelo[node*2+1]);
        ragehi[node] = max(ragehi[node*2],ragehi[node*2+1]);
    }
}
int querylo(int node, int s, int e, int l, int r){
    if(s>e||l>e||s>r) return INT_MAX;
    if(s>=l&&e<=r) return ragelo[node];
    int mid = (s+e)/2;
    return min(querylo(node*2,s,mid,l,r),querylo(node*2+1,mid+1,e,l,r));
}
int queryhi(int node, int s, int e, int l, int r){
    if(s>e||l>e||s>r) return -1;
    if(s>=l&&e<=r) return ragehi[node];
    int mid = (s+e)/2;
    return max(queryhi(node*2,s,mid,l,r),queryhi(node*2+1,mid+1,e,l,r));
}
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n>>m>>c;
    flag = 0;
    for(int i = 1; i <= n; i++){
        cin>>arr[i];
    }
    build(1,1,n+m+1);
    for(int i = 1; i <= n; i++){
        if(i+m-1>n) break;
        if(queryhi(1,1,n+m+1,i,i+m-1) - querylo(1,1,n+m+1,i,i+m-1) <= c){
            cout<<i<<"\n";
            flag=1;
        }
    }
    if(!flag) cout<<"NONE"<<"\n";
    return 0;
}
