#include <iostream>
#include <fstream>
#include <string>
#include <bits/stdc++.h>
#define MOD 1000000007
using namespace std;
typedef long long ll;
typedef unsigned long long ull;
typedef pair<int,int>ii;
int c1,m1,c2,m2,c3,m3;
int main() {
    ofstream fout ("mixmilk.out");
    ifstream fin ("mixmilk.in");
    fin>>c1>>m1;
    fin>>c2>>m2;
    fin>>c3>>m3;
    for(int i = 1; i <= 100; i++){
        if(i%3==1){
            if(m1+m2<=c2){
                m2+=m1;
                m1=0;
            } else {
                m2+=m1;
                m1=m2-c2;
                m2=c2;
            }
        } else if (i%3==2){
            if(m2+m3<=c3){
                m3+=m2;
                m2=0;
            } else {
                m3+=m2;
                m2=m3-c3;
                m3=c3;
            }
        } else if (i%3==0){
            if(m3+m1<=c1){
                m2+=m3;
                m3=0;
            } else {
                m1+=m3;
                m3=m1-c1;
                m1=c1;
            }
        }
    }
    fout<<m1<<"\n";
    fout<<m2<<"\n";
    fout<<m3<<"\n";
    return 0;
}
