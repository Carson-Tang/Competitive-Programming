#include <bits/stdc++.h>
using namespace std;

set<int>st; unordered_map<int,int>mp;
int n,r;
int main(){
    scanf("%d",&n);
    for(int i = 0; i < n; i++){
        scanf("%d",&r);
        if(!st.size()){
            st.insert(r);
            mp[r]=2;
        } else {
            auto l = st.lower_bound(r);
            if(l==st.begin()) {
                printf("NO\n");
                return 0;
            }
            auto v = *--st.lower_bound(r);
            mp[v]--;
            if(mp[v]==0){
                st.erase(v);
            }
            st.insert(r);
            mp[r]=2;
        }
    }
    printf("YES\n");
    return 0;
}
