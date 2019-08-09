#include <bits/stdc++.h>
using namespace std;
int h,k,lo,hi,ans,loc;
vector<int>house,hydrant;
bool check(int len){
    hydrant.clear();
    int placed = 1, last = 0;
    for(int i = 0; i < h; i++){
        if(!i){
            last = house[i];
            hydrant.push_back(last);
        } else {
            if(!(last+1000000-house[i]<=len*2 || abs(last-house[i]) <= len*2 || hydrant[0]+1000000-house[i] <= len*2)){
                last = house[i];
                hydrant.push_back(last);
                placed++;
            }
        }
    }
    return placed<=k;
}
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>h;
    for(int i = 0; i < h; i++){
        cin>>loc;
        house.push_back(loc);
    }
    sort(house.begin(),house.end());
    cin>>k;
    lo = 0, hi = 1000000;
    while(lo<=hi){
        int mid = (lo+hi)/2;
        if(check(mid)){
            hi = mid-1;
            ans = mid;
        } else {
            lo = mid+1;
        }
    }
    cout<<ans<<"\n";
    return 0;
}
