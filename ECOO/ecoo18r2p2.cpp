#include <bits/stdc++.h>
using namespace std;
int n,tc;
struct task{
    int x; double y;
    bool operator<(const task &a)const{
        return a.y<y;
    }
};
task hw[1000001];
double ans;
int parent[1000001];
void init(){
    for(int i = 0; i < 1000001; i++) parent[i]=i;
}
int Find(int x){
    if(parent[x]!=x){
        parent[x]=Find(parent[x]);
    } return parent[x];
}
void Union(int a, int b){
    parent[Find(a)]=Find(b);
}
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    tc = 10;
    while(tc--){
        cin>>n;
        init();
        ans = 0.0;
        for(int i = 0; i < n; i++){
            cin>>hw[i].x>>hw[i].y;
        }
        sort(hw,hw+n);
        for(int i = 0; i < n; i++){
            if(Find(hw[i].x)!=0){
                ans += hw[i].y;
                Union(Find(hw[i].x),Find(hw[i].x)-1);
            }
        }
        cout<<setprecision(4)<<fixed<<ans<<"\n";
    }
    return 0;
}
