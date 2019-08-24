#include <bits/stdc++.h>
using namespace std;

int n,a[1005],ans,v; stack<int>st;
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    while(cin>>n){
        for(int i = 1; i <= n; i++){
            cin>>a[i];
            if(i!=1){
                st.push(a[i]-a[i-1]);
                v = st.top();
            }
        }
        int c = 0;
        while(st.size()){
            if(st.top()==v) c++;
            else break;
            st.pop();
        }
        while(st.size()) st.pop();
        cout<<(n-c)<<"\n";
    }
    return 0;
}
