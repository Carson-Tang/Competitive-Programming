#include <bits/stdc++.h>
using namespace std;

int n,a; deque<int>dq;
int main(){
    scanf("%d",&n);
    for(int i = 0; i < n; i++){
        scanf("%d",&a);
        dq.push_back(a);
    }
    sort(dq.begin(),dq.end());
    while(dq.size()){
        printf("%d ",dq.front());
        dq.pop_front();
        if(dq.size()){
            printf("%d ",dq.back());
            dq.pop_back();
        }
    }
    return 0;
}
