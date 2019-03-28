#include <iostream>
#include <bits/stdc++.h>
#include <string>
#include <fstream>
using namespace std;
#define MAXN 100001
#define MOD 1000000007
typedef long long ll;
typedef unsigned long long ull;
typedef pair<int,int>ii;
int a,b;
string s1,s2;
int main(){
    ofstream fout ("ride.out");
    ifstream fin ("ride.in");
    a=1; b=1;
    fin>>s1>>s2;
    for(int i = 0; i < s1.length(); i++) a*=(s1.at(i)-64);
    for(int i = 0; i < s2.length(); i++) b*=(s2.at(i)-64);
    if(a%47==b%47) fout<<"GO\n";
    else fout<<"STAY\n";
    return 0;
}
