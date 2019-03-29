#include <iostream>
#include <bits/stdc++.h>
using namespace std;
int bit[8194][8194];
int n,q,arr[8194],cmd,i,j,a,b,h;
void upd(int x, int y, int v){
    for(int k = x; k < 8194; k+=k&-k){
        for(int l = y; l < 8194; l+=l&-l){
            bit[k][l]+=v;
        }
    }
}
int query(int x, int y){
    int ans = 0;
    for(int k = x; k > 0; k-=k&-k){
        for(int l = y; l > 0; l-=l&-l){
            ans += bit[k][l];
        }
    } return ans;
}
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n;
    for(int i = 1; i <= n; i++){
        cin>>arr[i];
        arr[i]++;
        upd(i,arr[i],1);
    }
    cin>>q;
    while(q--){
        cin>>cmd;
        if(cmd==1){
            cin>>i>>j>>a>>b;
            i++; j++; a++; b++;
            int x1 = i, y1 = a, x2 = j,y2 = b;
            cout<<query(x2,y2)-query(x1-1,y2)-query(x2,y1-1)+query(x1-1,y1-1)<<"\n";
        } else {
            cin>>i>>h;
            i++; h++;
            upd(i,arr[i],-1);
            arr[i]=h;
            upd(i,arr[i],1);
        }
    }
    return 0;
}
