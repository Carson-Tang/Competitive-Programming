#include <bits/stdc++.h>
using namespace std;

pair<int,int>a[200005];
int find_subset(int l, int u, int w[], int n, int result[]){
    for(int i = 0; i < n; i++) a[i]={w[i],i};
    long long sum = 0;
    sort(a,a+n);
    deque<int>dq;
    int idx = 0;
    while(idx < n){
        dq.push_back(idx);
        sum += a[idx].first;
        if(l <= sum && sum <= u){
            for(int i = 0; i < dq.size(); i++){
                result[i]=a[dq[i]].second;
            }
            return dq.size();
        }
        while(dq.size() && sum > u){
            sum -= a[dq.front()].first;
            dq.pop_front();
        }
        if(l <= sum && sum <= u){
            for(int i = 0; i < dq.size(); i++){
                result[i]=a[dq[i]].second;
            }
            return dq.size();
        }
        idx++;
    }
    return 0;
}

int main(){
    return 0;
}
