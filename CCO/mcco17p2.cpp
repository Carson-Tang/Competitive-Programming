#include <iostream>
#include <bits/stdc++.h>
using namespace std;
#define MAXN 200001
typedef long long ll;
int n,k,q,cmd,p,v,l,r;
ll ree[3*MAXN],lazy[3*MAXN];
void update(int node, int s, int e, int l, int r, int val){
    if(lazy[node]){
        ree[node]+=lazy[node];
        if(s!=e){
            lazy[node*2]+=lazy[node];
            lazy[node*2+1]+=lazy[node];
        }
        lazy[node]=0;
    }
    if(s>e||l>e||s>r) return;
    if(s>=l&&e<=r){
        ree[node]+=val;
        if(s!=e){
            lazy[node*2]+=val;
            lazy[node*2+1]+=val;
        }
        return;
    }
    int mid = (s+e)/2;
    update(node*2,s,mid,l,r,val);
    update(node*2+1,mid+1,e,l,r,val);
    ree[node] = max(ree[node*2],ree[node*2+1]);
}
ll query(int node, int s, int e, int l, int r){
    if(lazy[node]){
        ree[node]+=lazy[node];
        if(s!=e){
            lazy[node*2]+=lazy[node];
            lazy[node*2+1]+=lazy[node];
        }
        lazy[node]=0;
    }
    if(s>e||s>r||l>e) return 0;
    if(s>=l&&e<=r) return ree[node];
    int mid = (s+e)/2;
    return max(query(node*2,s,mid,l,r),query(node*2+1,mid+1,e,l,r));
}
int main() {
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n>>k>>q;
    for(int i = 0; i < n; i++){
        cin>>cmd;
        if(cmd==0){
            cin>>p>>v;
           if(!k)continue;
            update(1,0,n-1,max(0,p-k+1),min(p,n-1),v);
        } else {
            cin>>l>>r;
            if(!k||l>=n||l>r) cout<<0<<"\n";
            else cout<<query(1,0,n-1,l,min(r,n-1))<<"\n";
        }
    }
    return 0;
}
