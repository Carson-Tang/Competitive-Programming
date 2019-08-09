#include <bits/stdc++.h>
using namespace std;

int n,a[100005],ans;
unordered_map<int,int>mp;
bool check(int pos){
    mp.clear();
    for(int i = 0; i <= pos; i++){
        mp[round((double)(i*100)/pos)]=1;
    }
    for(int i = 0; i < n; i++){
        if(!mp[a[i]]) return 0;
    } return 1;
}
int main(){
    scanf("%d",&n);
    for(int i = 0; i < n; i++) scanf("%d",&a[i]);
    int v = 0;
    while(1){
        if(check(v)){
            ans = v;
            break;
        }
        v++;
    }
    printf("%d\n",ans);
    return 0;
}
