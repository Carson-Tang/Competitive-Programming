#include <bits/stdc++.h>
using namespace std;

int n,len,st,mx;
char s[25001];
int main(){
    scanf("%d",&n);
    scanf("%s",s);
    for(int i = 0; i < n; i++){
        len = 1;
        for(int ls = i-1, rs = i+1; ls >= 0, rs < n; ls--, rs++){
            if(s[ls]==s[rs]) len+=2;
            else break;
        }
        if(len>mx){
            mx = len;
            st = i-len/2;
        }
        if(i){
            if(s[i]==s[i-1]){
                len = 2;
                for(int ls = i-2, rs = i+1; ls>=0, rs < n; ls--, rs++){
                    if(s[ls]==s[rs]) len+=2;
                    else break;
                }
            }
            if(len>mx){
                mx = len;
                st = i-(len-2)/2-1;
            }
        }
    }
    for(int i = st; i < st+mx; i++){
        printf("%c",s[i]);
    }
    printf("\n%d\n",mx);
    return 0;
}
