#include <bits/stdc++.h>
using namespace std;

int n,m,a1[1000005],b1[1000005],v;
vector<int>lis;
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n;
    for(int i = 1; i <= n; i++){
        cin>>v;
        a1[v]=i;
    }
    cin>>m;
    for(int i = 1; i <= m; i++){
        cin>>v;
        b1[i]=a1[v];
    }
    for(int i = 1; i <= m; i++){
        v = b1[i];
        if(!v) continue;
        if(lis.empty()||v>lis.back()) lis.push_back(v);
        else *(lower_bound(lis.begin(), lis.end(), v)) = v;
    }
    cout<<lis.size()<<"\n";
    return 0;
}
