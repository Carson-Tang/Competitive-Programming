#include <iostream>
#include <bits/stdc++.h>
using namespace std;
map<string,int>mp;
char g[3][3]; string s;
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    mp["::::o::::"]=1;
    mp["o:::::::o"]=2;
    mp["::o:::o::"]=2;
    mp["o:::o:::o"]=3;
    mp["::o:o:o::"]=3;
    mp["o:o:::o:o"]=4;
    mp["o:o:o:o:o"]=5;
    mp["ooo:::ooo"]=6;
    mp["o:oo:oo:o"]=6;
    for(int i = 0; i < 3; i++){
        for(int j = 0; j < 3; j++){
            cin>>g[i][j];
            s+=g[i][j];
        }
    }
    if(mp[s]) cout<<mp[s]<<"\n";
    else cout<<"unknown\n";
    return 0;
}
