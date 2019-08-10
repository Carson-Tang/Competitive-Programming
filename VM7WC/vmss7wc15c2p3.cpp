#include <bits/stdc++.h>
using namespace std;

int n; long long h[1000000],ans; stack<pair<int,int>>st;
int main(){
    scanf("%d", &n);
    for(int i = 0; i < n; i++) scanf("%lld",&h[i]);
    for(int i = 0; i < n; i++){
        pair<int,int>b = {i,1};
        while(!st.empty() && h[st.top().first] <= h[i]){
            ans += st.top().second;
            if(h[st.top().first]==h[i]) b.second += st.top().second;
            st.pop();
        }
        if(st.size()) ans++;
        st.push(b);
    }
    printf("%lld\n",ans);
    return 0;
}
