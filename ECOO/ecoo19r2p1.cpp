#include <bits/stdc++.h>
using namespace std;
unordered_map<string,int>mp;
void solve(){
    mp.clear();
    int n;
    cin>>n;
    string s = "", ss = "";
    bool p = 0, a = 0;
    for(int i = 0; i < n; i++){
        cin>>s;
        p = 0; a = 0;
        ss="";
        for(int j = 0; j < s.size(); j++){
            if(s[j]=='@'){
                a=1;
            } else if(s[j]=='+'){
                p=1;
            }
            if(s[j]=='.'&&!a) continue;
            if(!p||a) ss+=tolower(s[j]);
        }
        mp[ss]++;
    }
    cout<<mp.size()<<"\n";
}
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    for(int i = 0; i < 10; i++) solve();
    return 0;
}
