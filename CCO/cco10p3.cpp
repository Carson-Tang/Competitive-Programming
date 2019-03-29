#include <bits/stdc++.h>
#include <iostream>
using namespace std;
#include <ext/pb_ds/assoc_container.hpp>
#include <ext/pb_ds/tree_policy.hpp>
using namespace __gnu_pbds;
#define ordered_set tree<pair<int,int>, null_type,less<pair<int,int>>, rb_tree_tag,tree_order_statistics_node_update>
int n,arr[1000005],c; char cmd; int x,r,k;
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n;
    ordered_set o_set;
    while(n--){
        cin>>cmd;
        if(cmd=='N'){
            cin>>x>>r;
            arr[x]=r;
            o_set.insert({r,x});
            c++;
        } else if (cmd=='M'){
            cin>>x>>r;
            o_set.erase(o_set.find({arr[x],x}));
            arr[x]=r;
            o_set.insert({r,x});
        } else if (cmd=='Q'){
            cin>>k;
            cout<<o_set.find_by_order(c-k)->second<<"\n";
        }
    }
    return 0;
}
