#include <bits/stdc++.h>
using namespace std;

int t,n,w,ans; deque<int>dq;

void solve(){
    dq.clear();
    scanf("%d",&n);
    for(int i = 0; i < n; i++){
        scanf("%d",&w);
        if(w>=50) ans++;
        else dq.push_back(w);
    }
    sort(dq.begin(),dq.end());
    while(dq.size()){
        int mx = dq.back(), c = 1;
        dq.pop_back();
        while(dq.size()){
            dq.pop_front();
            c++;
            if(mx * c>=50){
                ans++;
                break;
            }
        }

    }
}
int main(){
    scanf("%d",&t);
    for(int i = 0; i < t; i++){
        ans = 0;
        solve();
        printf("Case #%d: %d\n",i+1,ans);
    }
    return 0;
}
