#include <iostream>
#include <bits/stdc++.h>
using namespace std;
int n,c; vector<int>v;
bool p[10005];
void prime(){
    memset(p,true,sizeof p);
    for(int i = 2; i*i < 10005; i++){
        if(p[i]){
            for(int j = i*2; j < 10005; j+=i){
                p[j]=0;
            }
        }
    }
    for(int i = 2; i < 10005; i++){
        if(p[i]) v.push_back(i);
    }
}
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n;
    prime();
    bool flag = 0;
    for(int i = 0; i < n; i++){
        cin>>c;
        flag = 0;
        for(int j = c-1; j >= 2; j--){
            if(p[j]){
                cout<<j<<"\n";
                flag=1;
                break;
            }
        }
        if(!flag) cout<<"no can do\n";
    }
    return 0;
}
