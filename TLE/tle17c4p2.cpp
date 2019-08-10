#include <iostream>
#include <bits/stdc++.h>
using namespace std;

string s,w; bool v[10]; int t[6],dest,best,p[6];
bool valid(){
    bool ret = 1;
    for(int i = 0; i < 6; i++){
        if(!v[p[i]]) ret=0;
    } return ret;
}
int solve(int a[]){
    int ret = 0;
    int h= a[0]*10 + a[1];
    ret += h*3600;
    h = a[2]*10 + a[3];
    ret += h*60;
    h = a[4]*10 + a[5];
    ret += h;
    return ret;
}
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    best = 99999999999;
    cin>>s>>w;
    for(int i = 0; i < w.size(); i++) v[(w[i]-48)]=1;
    t[0]=s[0]-48;
    t[1]=s[1]-48;
    t[2]=s[3]-48;
    t[3]=s[4]-48;
    t[4]=s[6]-48;
    t[5]=s[7]-48;
    int target = solve(t);
    for(int i = 0; i < 6; i++) t[i]=0;
    for(int t1 = 0; t1 < 10; t1++){
        for(int t2 = 0; t2 < 10; t2++){
            for(int t3 = 0; t3 < 10; t3++){
                for(int t4 = 0; t4 < 10; t4++){
                    for(int t5 = 0; t5 < 10; t5++){
                        for(int t6 = 0; t6 < 10; t6++){
                            p[0]=t1;
                            p[1]=t2;
                            p[2]=t3;
                            p[3]=t4;
                            p[4]=t5;
                            p[5]=t6;
                            if(valid()){
                                int pos = abs(target-solve(p));
                                if(best>pos){
                                    best=pos;
                                    for(int i = 0; i < 6; i++){
                                        t[i]=p[i];
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    cout<<t[0]<<t[1]<<":"<<t[2]<<t[3]<<":"<<t[4]<<t[5]<<"\n";
    return 0;
}
