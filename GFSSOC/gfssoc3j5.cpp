#include <bits/stdc++.h>
using namespace std;
typedef pair<int,int>ii;
int n,ans,sum,pos; ii p[8];
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n;
    ans=INT_MAX;
    for(int i = 1; i <= n; i++){
        cin>>p[i].first>>p[i].second;
        sum+=p[i].second;
    }
    sort(p+1,p+1+n);
    do{
        int flr = 101;
        int currsum = sum;
        pos = 0;
        for(int i = 1; i <= n; i++){
            pos += currsum*(1+(abs(flr-p[i].first)));
            flr = p[i].first;
            currsum-=p[i].second;
        }
        ans = min(ans,pos);
    } while(next_permutation(p+1,p+n+1));
    cout<<ans<<"\n";
    return 0;
}
