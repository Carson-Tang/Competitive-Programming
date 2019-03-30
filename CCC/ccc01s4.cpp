#include <iostream>
#include <bits/stdc++.h>
using namespace std;
int n,x[16],y[16];
double ans;
void circumcircle(int a, int b, int c){
    double d1 = sqrt((x[a]-x[b])*(x[a]-x[b])+(y[a]-y[b])*(y[a]-y[b]));
    double d2 = sqrt((x[a]-x[c])*(x[a]-x[c])+(y[a]-y[c])*(y[a]-y[c]));
    double d3 = sqrt((x[c]-x[b])*(x[c]-x[b])+(y[c]-y[b])*(y[c]-y[b]));
    double s = (d1+d2+d3)/2;
    double d = 0;
    if(s==0||d1*d1+d2*d2-d3*d3<0||d2*d2+d3*d3-d1*d1<0||d3*d3+d1*d1-d2*d2<0){
        d=max(d,max(d3,max(d1,d2)));
    } else d = (d1*d2*d3)/(2*sqrt(s*(s-d1)*(s-d2)*(s-d3)));
    ans = max(d,ans);
}
int main(){
    scanf("%d",&n);
    for(int i = 0; i < n; i++){
        scanf("%d %d",&x[i],&y[i]);
    }
    for(int i = 0; i < n; i++){
        for(int j = i+1; j < n; j++){
            for(int k = j+1; k < n; k++){
                circumcircle(i,j,k);
            }
        }
    }
    printf("%.2f",ans);
    return 0;
}
