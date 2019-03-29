#include <iostream>
#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
int n,q,l,r,a[100001]; char cmd;
struct node{
    ll mxv=-INFINITE,lv=-INFINITE,rv=-INFINITE,sum=-INFINITE;
};
node rage[300001];
node combine(node left, node right){
    node ret;
    ret.sum = left.sum + right.sum;
    ret.lv = max(left.lv, left.sum + right.lv);
    ret.rv = max(right.rv, right.sum + left.rv);
    ret.mxv = max(left.mxv,max(right.mxv,left.rv+right.lv));
    return ret;
}
void build(int idx, int s, int e){
    if(s==e){
        rage[idx].mxv=a[s];
        rage[idx].lv=a[s];
        rage[idx].rv=a[s];
        rage[idx].sum=a[s];
    } else {
        int mid = (s+e)/2;
        build(idx*2,s,mid);
        build(idx*2+1,mid+1,e);
        rage[idx] = combine(rage[idx*2],rage[idx*2+1]);
    }
}
void upd(int idx, int s, int e, int change){
    if(s==e){
        rage[idx].mxv=a[s];
        rage[idx].lv=a[s];
        rage[idx].rv=a[s];
        rage[idx].sum=a[s];
    } else {
        int mid = (s+e)/2;
        if(s<=change&&change<=mid) upd(idx*2,s,mid,change);
        else upd(idx*2+1,mid+1,e,change);
        rage[idx] = combine(rage[idx*2],rage[idx*2+1]);
    }
}
node query(int idx, int s, int e, int l, int r){
    if(l>e||s>e||s>r){
        node bad;
        return bad;
    }
    if(s>=l&&e<=r) return rage[idx];
    int mid = (s+e)/2;
    node left = query(idx*2,s,mid,l,r);
    node right = query(idx*2+1,mid+1,e,l,r);
    return combine(left,right);
}
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n>>q;
    for(int i = 0; i < n; i++) cin>>a[i];
    build(1,0,n-1);
    for(int i = 0; i < q; i++){
        cin>>cmd>>l>>r;
        if(cmd=='S'){
            a[l-1]=r;
            upd(1,0,n-1,l-1);
        } else if (cmd=='Q'){
            cout<<query(1,0,n-1,l-1,r-1).mxv<<"\n";
        }
    }
    return 0;
}
