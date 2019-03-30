#include <iostream>
#include <bits/stdc++.h>
using namespace std;
typedef pair<int,int>ii;
int setBit(int n, int idx){ return n|(1<<idx);}
int unsetBit(int n, int idx){ return n&~(1<<idx);}
bool checkBit(int n, int idx){ return n&(1<<idx);}
int k,mask,light;
queue<ii>q;
unordered_map<int,int>mp;
bool check(int msk){
    for(int i = 0; i < k; i++) if(checkBit(msk,i)) return 0;
    return 1;
}
int update(int msk){
    for(int i = 0; i <= k-4; i++){
        if(checkBit(msk,i)&&checkBit(msk,i+1)&&checkBit(msk,i+2)&&checkBit(msk,i+3)){
            for(int j = i; j < i+4; j++){
                msk = unsetBit(msk,j);
            }
            int j = i+4;
            while(j<k){
                if(checkBit(msk,j)) msk = unsetBit(msk,j);
                else break;
                j++;
                i++;
            }
            i+=3;
        }
    }
    return msk;
}
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>k;
    for(int i = 0; i < k; i++){
        cin>>light;
        if(light) mask = setBit(mask,i);
    }
    q.push({mask,0});
    while(q.size()){
        int curr = q.front().first, dis = q.front().second; q.pop();
        mp[curr]=1;
        if(check(curr)){
            cout<<dis<<"\n";
            return 0;
        }
        for(int i = 0; i < k; i++){
            if(!checkBit(curr,i)){
                int mask = setBit(curr,i);
                int newmask = update(mask);
                if(check(newmask)){
                    cout<<dis+1<<"\n";
                    return 0;
                }
                if(!mp[newmask]){
                    q.push({newmask,dis+1});
                    mp[newmask]=1;
                }
            }
        }
    }
    return 0;
}
