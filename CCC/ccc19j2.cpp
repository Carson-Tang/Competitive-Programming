#include <bits/stdc++.h>
using namespace std;
int l,n; char x;
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>l;
    while(l--){
        cin>>n>>x;
        while(n--){
            cout<<x;
        }
        cout<<"\n";
    }
    return 0;
}
