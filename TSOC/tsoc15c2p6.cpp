#include <iostream>
#include <bits/stdc++.h>
using namespace std;
#define MAXN 30001
int N,Q,R,a,b,c,v,ans1,ans2;
int A[MAXN], tree[3*MAXN], lazy[3*MAXN];
void build(int node, int s, int e){
    if(s==e){
        tree[node]=A[s];
    } else if(s<e){
        int mid = (s+e)/2;
        build(2*node,s,mid);
        build(2*node+1,mid+1,e);
        tree[node]=min(tree[node*2],tree[node*2+1]);
    }
}
void update(int node, int s, int e, int l, int r, int val){
    if(lazy[node]!=0){
        if(tree[node]>0){
            tree[node]+=lazy[node];
        }
        if(s!=e){
            lazy[node*2]+=lazy[node];
            lazy[node*2+1]+=lazy[node];
        }
        lazy[node]=0;
    }
    if(s>e||s>r||e<l){
        return;
    }
    if(s>=l&&e<=r){
        if(tree[node]>0){
            tree[node]+=val;
        }
        if(s!=e){
            lazy[node*2]+=val;
            lazy[node*2+1]+=val;
        }
        return;
    }
    int mid = (s+e)/2;
    update(node*2,s,mid,l,r,val);
    update(node*2+1,mid+1,e,l,r,val);
    tree[node]=min(tree[node*2],tree[node*2+1]);
}
int query(int node, int s, int e, int l, int r){
    if(lazy[node]!=0){
        if(tree[node]>0){
            tree[node]+=lazy[node];
        }
        if(s!=e){
            lazy[node*2]+=lazy[node];
            lazy[node*2+1]+=lazy[node];
        }
        lazy[node]=0;
    }
    if(s>e||s>r||e<l){
        return INT_MAX;
    }
    if(s>=l&&e<=r){
        return tree[node];
    }
    int mid = (s+e)/2;
    return min(query(node*2,s,mid,l,r),query(node*2+1,mid+1,e,l,r));
}
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>N; cin>>Q;
    for(int i = 0; i < N; i++){
        cin>>R;
        A[i]=R;
    }
    build(1,0,N-1);

    for(int i = 0; i < Q; i++){
        cin>>a; cin>>b; cin>>c;
        update(1,0,N-1,a-1,b-1,c*-1);
        ans1 = query(1,0,N-1,a-1,b-1);
        ans2 = query(1,0,N-1,0,N-1);
        if(ans1<0){ans1=0;}
        if(ans2<0){ans2=0;}

        cout << ans1 << " " << ans2 << "\n";
    }
    return 0;
}
