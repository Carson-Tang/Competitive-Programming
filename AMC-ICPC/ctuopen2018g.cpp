#include <bits/stdc++.h>
#include <iostream>
using namespace std;

int a,b,c,d;
int main(){
    scanf("%d %d",&a,&b);
    scanf("%d %d",&c,&d);
    if((abs(c-a)+abs(d-b))%2==1) printf("white\n");
    else printf("black\n");
    return 0;
}
