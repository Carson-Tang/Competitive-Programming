#include <bits/stdc++.h>
using namespace std;

int t,n,a[50005],f1,b1,f2,b2;
bool w;
bool check(deque<int>q, int f, int b){
    if(f==q.front()) q.pop_front();
    if(f==q.back()) q.pop_back();
    while(q.size()){
        if(q.front()+1==f){
            q.pop_front();
            f--;
        } else if(q.front()-1==b){
            q.pop_front();
            b++;
        } else if(q.back()+1==f){
            q.pop_back();
            f--;
        } else if(q.back()-1==b){
            q.pop_back();
            b++;
        } else {
            w=0;
            break;
        }
    }
    return !q.size();
}
void solve(){
    w = 0;
    deque<int>q;
    scanf("%d",&n);
    memset(a,0,sizeof a);
    for(int i = 0; i < n; i++){
        scanf("%d",&a[i]);
        q.push_back(a[i]);
    }
    w = check(q,a[0],a[0]) || check(q,a[n-1],a[n-1]);
}
int main(){
    scanf("%d",&t);
    for(int i = 0; i < t; i++){
        solve();
        if(w) printf("Case #%d: yes\n",i+1);
        else printf("Case #%d: no\n",i+1);
    }
    return 0;
}
