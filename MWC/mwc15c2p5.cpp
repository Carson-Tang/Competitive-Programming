#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
typedef pair<int,int>ii;
int n,k,j,xi,xf,I,T; ll arr[4][100005];
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n>>k>>j;
    for(int i = 0; i < j; i++){
        cin>>xi>>xf>>I>>T;
        arr[T][xi]+=I;
        arr[T][xf+1]-=I;
    }
    int cnt = 0;
    for(int i = 1; i <= 3; i++){
        cnt = 0;
        for(int j = 1; j <= n; j++){
            arr[i][j]+=arr[i][j-1];
            if(arr[i][j]<k) cnt++;
        }
        cout<<cnt<<"\n";
    }
    return 0;
}
