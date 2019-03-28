#include <iostream>
#include <bits/stdc++.h>
using namespace std;
#define MAXN 100001
struct node {
    int minimum, gcd, cnt;
};
node tree[3*MAXN];
int A[MAXN];
int N,M,x,v,l,r;
char c;
void build(int node, int s, int e){
    if(s==e){
        tree[node].gcd = A[s];
        tree[node].minimum = A[s];
        tree[node].cnt = 1;
    } else if(s<e){
        int mid = (s+e)/2;
        build(node*2,s,mid);
        build(node*2+1,mid+1,e);
        tree[node].gcd = __gcd(tree[node*2].gcd,tree[node*2+1].gcd);
        tree[node].minimum = min(tree[node*2].minimum,tree[node*2+1].minimum);
        if(tree[node].gcd==tree[node*2].gcd){
            tree[node].cnt += tree[node*2].cnt;
        }
        if(tree[node].gcd==tree[node*2+1].gcd){
            tree[node].cnt += tree[node*2+1].cnt;
        }
    }
}
void update(int node, int s, int e, int ind, int val){
    if(s==e){
        tree[node].minimum = val;
        tree[node].gcd = val;
        tree[node].cnt = 1;
    } else {
        int mid = (s+e)/2;
        if(s<=ind&&ind<=mid){
            update(node*2,s,mid,ind,val);
        } else {
            update(node*2+1,mid+1,e,ind,val);
        }
        tree[node].gcd = __gcd(tree[node*2].gcd,tree[node*2+1].gcd);
        tree[node].minimum = min(tree[node*2].minimum,tree[node*2+1].minimum);
        tree[node].cnt = 0;
        if(tree[node].gcd==tree[node*2].gcd){
            tree[node].cnt += tree[node*2].cnt;
        }
        if(tree[node].gcd==tree[node*2+1].gcd){
            tree[node].cnt += tree[node*2+1].cnt;
        }
    }
}
int queryGCD(int node, int s, int e, int l, int r){
    if(r<s||e<l||s>e) return 0;
    if(l<=s&&e<=r) return tree[node].gcd;
    int mid = (s+e)/2;
    return gcd(queryGCD(node*2,s,mid,l,r),queryGCD(node*2+1,mid+1,e,l,r));
}
int queryMin(int node, int s, int e, int l, int r){
    if(r<s||e<l||s>e) return INT_MAX;
    if(l<=s&&e<=r) return tree[node].minimum;
    int mid = (s+e)/2;
    return min(queryMin(node*2,s,mid,l,r),queryMin(node*2+1,mid+1,e,l,r));
}
int queryEqGCD(int node, int s, int e, int l, int r, int val){
    if(r<s||e<l||s>e) return 0;
    if(tree[node].gcd>val) return 0;
    if(l<=s&&e<=r && tree[node].gcd==val) return tree[node].cnt;
    int mid = (s+e)/2;
    return queryEqGCD(node*2,s,mid,l,r,val)+queryEqGCD(node*2+1,mid+1,e,l,r,val);
}
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>N>>M;
    for(int i = 0; i < N; i++) cin>>A[i];
    for(int i = 0; i < 3*N; i++) tree[i].minimum = INT_MAX;
    build(1,0,N-1);
    for(int i = 0; i < M; i++){
        cin>>c;
        if(c=='C'){
            cin>>x>>v;
            update(1,0,N-1,x-1,v);
            A[x-1]=v;
        } else if (c=='M'){
            cin>>l>>r;
            cout << queryMin(1,0,N-1,l-1,r-1) << "\n";
        } else if (c=='G'){
            cin>>l>>r;
            cout << queryGCD(1,0,N-1,l-1,r-1) << "\n";
        } else {
            cin>>l>>r;
            v = queryGCD(1,0,N-1,l-1,r-1);
            cout << queryEqGCD(1,0,N-1,l-1,r-1,v) << "\n";
        }
    }
    return 0;
}
