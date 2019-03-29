#include <bits/stdc++.h>
#include <iosream>
using namespace std;
priority_queue<int>pq;
int n,k[101],c[101],mxk,mxc,sum,ans;
bitset<1000001>bs;
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n;
    for(int i = 0; i < n; i++){
        cin>>k[i]>>c[i];
        mxk = max(mxk,k[i]);
        mxc = max(mxc,c[i]);
    }
    if(mxk>100||mxc>100){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < k[i]; j++){
                pq.push(c[i]);
            }
        }
        while(pq.size()>1){
            int a = pq.top(); pq.pop();
            int aa = pq.top(); pq.pop();
            pq.push(a-aa);
        }
        cout<<pq.top()<<"\n";
    } else {
        bs[0]=1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < k[i]; j++){
                bs |= (bs<<c[i]);
                sum += c[i];
            }
        }
        for(int i = sum/2; i >= 0; i--){
            if(bs[i]){
                ans = sum - 2*i;
                break;
            }
        }
        cout<<ans<<"\n";
    }
    return 0;
}
