#include <iostream>
#include <bits/stdc++.h>
using namespace std;
struct P {
    double x,y;
};
int cnt,N,n,xR,yR,xJ,yJ,xr,yr;
bool intersect(P A, P B, P C, P D){
    double s = ((-1*(B.y-A.y))*(A.x-C.x) + (B.x-A.x)*(A.y-C.y)) / ((-1*(D.x-C.x))*(B.y-A.y)+(B.x-A.x)*(D.y-C.y));
    double t = ((D.x-C.x)*(A.y-C.y)-(D.y-C.y)*(A.x-C.x)) / ((-1*(D.x-C.x))*(B.y-A.y)+(B.x-A.x)*(D.y-C.y));
    if(s>=0&&s<=1&&t>=0&&t<=1){
        return true;
    }
    return false;
}
vector<P> p;
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>xR>>yR>>xJ>>yJ;
    P A = {xR,yR}; P B = {xJ,yJ};
    cin>>N;
    for(int i = 0; i < N; i++){
        cin>>n;
        p.clear();
        for(int j = 0; j < n; j++){
            cin>>xr>>yr;
            p.push_back(P{xr,yr});
        }
        for(int j = 0; j < n-1; j++){
            P C = p[j]; P D = p[j+1];
            if(intersect(A,B,C,D)){
                cnt++;
                break;
            }
            if(j==0){
                C = p[0]; D = p[n-1];
                if(intersect(A,B,C,D)){
                    cnt++;
                    break;
                }
            }
        }
    }
    cout<<cnt<<"\n";
    return 0;
}
