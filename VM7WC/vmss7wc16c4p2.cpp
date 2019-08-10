#include <bits/stdc++.h>
using namespace std;

int n,l,m; char c;
vector<char>lt[27];
set<string>ans;
void solve(int idx, int rem, string s){
    if(idx>=n||!rem) return;
    for(char cc : lt[idx]){
        ans.insert(s + cc);
        solve(idx+1,rem-1,s+cc);
    }
    if(idx)solve(idx+1,rem,s);
}
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n>>l;
    for(int i = 0 ; i < n; i++){
        cin>>m;
        for(int j = 0; j < m; j++){
            cin>>c;
            lt[i].push_back(c);
        }
    }
    solve(0,l,"");
    for(string s : ans){
        cout<<s<<"\n";
    }

    return 0;
}
