#include <bits/stdc++.h>
using namespace std;
int tc,n,arr[51];
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>tc;
    while(tc--){
        cin>>n;
        for(int i = 0; i < n; i++){
            cin>>arr[i];
        }
        bool flag = 1;
        int ans = 0;
        while(flag){
            flag=0;
            for(int i = 1; i < n; i++){
                if(arr[i]<arr[i-1]){
                    ans++;
                    swap(arr[i],arr[i-1]);
                    flag=1;
                }
            }

        }
        cout<<"Optimal train swapping takes "<<ans<<" swaps.\n";
    }
    return 0;
}
