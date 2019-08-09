#include <bits/stdc++.h>
using namespace std;
int n; string ans,in;
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n;
    while(n--){
        ans = "";
        cin>>in;
        int cnt = 1; char last = in[0];
        for(int i = 1; i < in.length(); i++){
            if(in[i]!=last){
                ans += to_string(cnt)+" "+last+" ";
                cnt=1;
                last = in[i];
            } else cnt++;
        }
        ans += to_string(cnt)+" "+last+" ";
        cout<<ans<<"\n";
    }
    return 0;
}
