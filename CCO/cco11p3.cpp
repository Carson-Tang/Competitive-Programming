#include <bits/stdc++.h>
using namespace std;

int n,m,k,a,b; bool f,v[2005]; vector<int>g[2005];
int main(){
    scanf("%d %d",&n,&m);
    scanf("%d",&k);
    for(int i = 0; i < k; i++){
        scanf("%d %d",&a,&b);
        g[a].push_back(b);
    }
    for(int i = 1; i <= n && !f; i++){
        if(!g[i].size()) continue;
        memset(v,0,sizeof v);
        for(int j : g[i]) v[j]=1;
        for(int j = i+1; j <= n && !f; j++){
            int cnt = 0;
            for(int k : g[j]){
                if(v[k]) cnt++;
            }
            if(cnt>1) f=1;
        }
    }
    if(!f) printf("YES\n");
    else printf("NO\n");
    return 0;
}
