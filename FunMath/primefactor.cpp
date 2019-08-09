#include <bits/stdc++.h>
using namespace std;
#define MAXN 10000001
int primefact[MAXN];
int N,M;
vector<int>v;
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    for(int i = 1; i < MAXN; i++){
        primefact[i]=i;
        if(i%2==0) primefact[i]=2;
    }
    for(int i = 3; i*i < MAXN; i++){
        if(primefact[i]==i){
            for(int j = i*i; j < MAXN; j+=i){
                if(primefact[j]==j){
                    primefact[j]=i;
                }
            }
        }
    }
    cin>>N;
    for(int i = 0; i < N; i++){
        cin>>M;
        while(M!=1){
            v.push_back(primefact[M]);
            M /= primefact[M];
        }
        for(int factor : v){
            cout<<factor<<" ";
        }
        v.clear();
        cout<<"\n";
    }
    return 0;
}
