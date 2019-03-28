#include <bits/stdc++.h>
#include <iostream>
using namespace std;
struct Node{
    int priority,sz,key;
    Node* l, *r;
    Node(int v, int pr): priority(pr), key(v), sz(1), l(0), r(0){}
};
int sz(Node * root) {
    if(root) return root->sz;
    return 0;
}
void update(Node* &root) {
    if(root) root->sz = sz(root->l) + sz(root->r) + 1;
}
void split(Node * root, int key, Node* &l,Node * &r ){
    if(!root) l = r = NULL;
    else if(key > root->key){
        split(root->r,key,root->r,r); l = root;
    }else{
        split(root->l,key,l,root->l); r = root;
    }
    update(root);
}
void insert(Node * &root, Node * node){
    if(!root) root = node;
    else if(node->priority > root->priority){
        split(root,node->key,node->l,node->r);
        root = node;
    }else{
        if(root->key <= node->key) insert(root->r,node);
        else insert(root->l,node);
    }
    update(root);
}
void merge(Node* &root, Node* l , Node* r){
    if(!l || !r){
        if(l)root = l;
        else root = r;
    }else{
        if(l->priority > r->priority){
            merge(l->r,l->r,r); root = l;
        }else{
            merge(r->l,l,r->l); root = r;
        }
    }
    update(root);
}
void erase(Node* &root, int key){
    if(!root) return;
    if(root->key == key){
        merge(root,root->l,root->r);
    }else{
        if(key > root->key) erase(root->r,key);
        else erase(root->l, key);
    }
    update(root);
}
int findkth(Node * root, int k){
    if(!root) return -1;
    int lsz = sz(root->l) + 1;
    if(lsz == k) return root->key;
    if(lsz < k) return findkth(root->r,k-lsz);
    return findkth(root->l,k);
}
int indexof(Node * root, int v){
    if(!root) return -1;
    if(root->key == v){
        if(root->l){
            if(root->l->key == v) return indexof(root->l,v);
            return sz(root->l) + 1;
        } return sz(root->l) + 1;
    }
    if(root->key < v) return sz(root->l) + 1 + indexof(root->r,v);
    return indexof(root->l,v);
}
void search(Node * root){
    if(!root) return;
    search(root->l);
    cout<<root->key<<" ";
    search(root->r);
}
int n,m,ans,last,v; char cmd; Node *rt = 0;
unordered_map<int,int>mp;
int main(){
    mt19937 mt_rand(time(0));
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n>>m;
    for(int i = 0; i < n; i++){
        cin>>v;
        insert(rt,new Node(v,mt_rand()));
        mp[v]++;
    }
    while(m--){
        cin>>cmd>>v;
        v^=last;
        if(cmd=='I'){
            insert(rt,new Node(v,mt_rand()));
            mp[v]++;
        } else if (cmd=='R'){
            if(mp[v]){
                erase(rt,v);
                mp[v]--;
            }
        } else if (cmd=='S'){
            ans = findkth(rt,v);
            last = ans;
            cout<<ans<<"\n";
        } else if (cmd=='L'){
            if(mp[v]) ans = indexof(rt,v);
            else ans = -1;
            last = ans;
            cout<<ans<<"\n";
        }
    }
    search(rt);
    return 0;
}
