#include <iostream>
#include <bits/stdc++.h>
#define MAXN 1048577
using namespace std;
struct node {
    int skill, pos, wins;
};
int N, M, R, W, S, idx;
char c;
int A[MAXN];
node tree[3*MAXN];
void build(int node, int s, int e){
    if(s==e){
        tree[node].skill = A[s];
        tree[node].pos = s;
        tree[node].wins = 0;
    } else if (s<e){
        int mid = (s+e)/2;
        build(node*2,s,mid);
        build(node*2+1,mid+1,e);
        if(tree[node*2].skill>tree[node*2+1].skill){
            tree[node].skill = tree[node*2].skill;
            tree[node].pos = tree[node*2].pos;
            tree[node].wins = tree[node*2].wins + 1;
        } else {
            tree[node].skill = tree[node*2+1].skill;
            tree[node].pos = tree[node*2+1].pos;
            tree[node].wins = tree[node*2+1].wins + 1;
        }
    }
}
void update(int node, int s, int e, int ind, int val){
    if(s==e && s==ind){
        tree[node].skill = val;
        tree[node].pos = ind;
        tree[node].wins = 0;
    } else {
        int mid = (s+e)/2;
        if(s<=ind&&ind<=mid){
            update(node*2,s,mid,ind,val);
        } else {
            update(node*2+1,mid+1,e,ind,val);
        }
        if(tree[node*2].skill>tree[node*2+1].skill){
            tree[node].skill = tree[node*2].skill;
            tree[node].pos = tree[node*2].pos;
            tree[node].wins = tree[node*2].wins + 1;
        } else {
            tree[node].skill = tree[node*2+1].skill;
            tree[node].pos = tree[node*2+1].pos;
            tree[node].wins = tree[node*2+1].wins + 1;
        }
    }
}
int query (int node, int s, int e, int idx){
    if(tree[node].pos == idx){
        return tree[node].wins;
    }
    int mid = (s+e)/2;
    if(s<=idx&&idx<=mid){
        return query(node*2,s,mid,idx);
    } else {
        return query(node*2+1,mid+1,e,idx);
    }
}
int main(){
    cin>>N>>M;
    int numofp = pow(2,N);
    for(int i = 0; i < numofp; i++) cin>>A[i];
    build(1,0,numofp-1);
    for(int i = 0; i < M; i++){
        cin>>c;
        if(c=='R'){
            cin>>idx>>S;
            A[idx-1]=S;
            update(1,0,numofp-1,idx-1,S);
        } else if (c=='W'){
            cout << tree[1].pos+1 << "\n";
        } else if (c=='S'){
            cin>>idx;
            cout << query(1,0,numofp-1,idx-1) << "\n";
        }
    }
    return 0;
}
