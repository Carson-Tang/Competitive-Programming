#include <iostream>
#include <bits/stdc++.h>
using namespace std;
unsigned int N,Q,x,y,val,A[MAXN],tree[3*MAXN];
char c;
void build(int node, int s, int e){
    if(s==e){
        tree[node]=A[s];
    } else {
        int mid = (s+e)/2;
        build(node*2,s,mid);
        build(node*2+1,mid+1,e);
        tree[node] = tree[node*2] & tree[node*2+1];
    }
}
void update(int node, int s, int e, int idx, ll val){
    if(s==e){
        tree[node]=val;
    } else if(s<e){
        int mid = (s+e)/2;
        if(idx<=mid){
            update(node*2,s,mid,idx,val);
        } else {
            update(node*2+1, mid+1, e, idx, val);
        }
        tree[node] = tree[node*2] & tree[node*2+1];
    }
}
void query(int node, int s, int e, int l, int r){
    if(l<=s&&e<=r){
        val &= tree[node];
        return;
    }
    int mid = (s+e)/2;
    if(l<=mid) query(node*2,s,mid,l,r);
    if(r>mid) query(node*2+1,mid+1,e,l,r);
}
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>N>>Q;
    for(int i = 0; i < N; i++) cin>>A[i];
    build(1,0,N-1);
    for(int i = 0; i < Q; i++){
        cin>>c;
        if(c=='U'){
            cin>>x>>val;
            A[x-1]=val;
            update(1,0,N-1,x-1,val);
        } else {
            cin>>x>>y>>val;
            query(1,0,N-1,x-1,y-1);
            cout << val << "\n";
        }
    }
    return 0;
}
