#include <bits/stdc++.h>
using namespace std;
long long r,t,tc,freq[27],nxt[27],ans; string a,s,to[27]; char c,first,last;
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    tc=10;
    while(tc--){
        cin>>r>>t>>a;
        for(int i = 0; i < r; i++){
            cin>>c>>s;
            to[c-'A']=s;
        }
        first=a[0],last=a[a.size()-1];
        for(int i = 0; i < 27; i++) freq[i]=0;
        for(int i = 0; i < a.size(); i++) freq[a[i]-'A']++;
        while(t--){
            for(int i = 0; i < 27; i++) nxt[i]=0;
            for(int i = 0; i < 27; i++){
                string s = to[i];
                for(int j = 0; j < s.size(); j++){
                    nxt[s[j]-'A'] += freq[i];
                }
            }
            first = to[first-'A'][0];
            last = to[last-'A'][to[last-'A'].size()-1];
            for(int i = 0; i < 27; i++) freq[i]=nxt[i];
        }
        ans=0;
        for(int i = 0; i < 27; i++) ans += freq[i];
        cout<<first<<last<<" "<<ans<<"\n";
    }
    return 0;
}
