#include <bits/stdc++.h>
using namespace std;
int n;
ll sum, a[50],mx;
int main() {
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n;
    for(int i = 0; i < n; i++){ cin>>a[i]; sum+=a[i]; mx = max(mx,a[i]);}
    cout<<min(sum-mx,sum/2)<<"\n";
}
