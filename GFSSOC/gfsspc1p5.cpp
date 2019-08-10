#include <bits/stdc++.h>
using namespace std;

int n,t,l,ans; vector<int>m,p;
int main(){
    scanf("%d",&n);
    scanf("%d",&t);
    for(int i = 0; i < n; i++){
        scanf("%d",&l);
        if(l>0) p.push_back(l);
        else m.push_back(-l);
    }
    p.push_back(0);
    m.push_back(0);
    sort(m.begin(),m.end());
    sort(p.begin(),p.end());
    ans = INT_MAX;
    for(int i = 0; i < p.size(); i++){
        for(int j = 0; j < m.size(); j++){
            if(i+j==t){
                ans = min(ans,p[i] + 2*m[j]);
                ans = min(ans,2*p[i] + m[j]);
            }
        }
    }

    printf("%d\n",ans);
    return 0;
}
