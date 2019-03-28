#include <iostream>
#include <fstream>
#include <string>
#include <bits/stdc++.h>
#define MOD 1000000007
using namespace std;
typedef long long ll;
typedef unsigned long long ull;
typedef pair<int,int>ii;
int in1[10],in2[10];
set<int>s;
void recur(int day, int qty, int last, int a1[], int a2[]){
    if(day==5){
        s.insert(qty);
        return;
    }
    if(day%2==0){
        recur(day+1,qty+last,last,a1,a2);
        for(int i = 0; i < 10; i++){
            int temp = a2[i];
            if(temp==-1) continue;
            a2[i]=-1;
            recur(day+1,qty+temp,temp,a1,a2);
            a2[i]=temp;
        }
    } else {
        if(day!=1)recur(day+1,qty-last,last,a1,a2);
        for(int i = 0; i < 10; i++){
            int temp = a1[i];
            if(temp==-1) continue;
            a1[i]=-1;
            recur(day+1,qty-temp,temp,a1,a2);
            a1[i]=temp;
        }
    }
}
int main(){
    ofstream fout ("backforth.out");
    ifstream fin ("backforth.in");
    for(int i = 0; i < 10; i++) fin>>in1[i];
    for(int i = 0; i < 10; i++) fin>>in2[i];
    recur(1,0,0,in1,in2);
    fout<<s.size();
    return 0;
}
