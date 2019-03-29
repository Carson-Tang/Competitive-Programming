#include <iostream>
#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
int n,m,c,tot1,tot2,a[201];
int main() {
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n;
    for(int i = 0; i < n; i++) cin>>a[i];
    for(int i = 0; i < n; i++){
        cin>>c;
        tot1+=c*a[i];
    }
    cin>>m;
    for(int i = 0; i < m; i++) cin>>a[i];
    for(int i = 0; i < m; i++){
        cin>>c;
        tot2+=c*a[i];
    }
    cout<<tot1<<" "<<tot2<<"\n";
    return 0;
}
