#include <bits/stdc++.h>
#include <iostream>
using namespace std;

bool f[3][3];
int a[3][3];
string c;
void fill(){
  for(int i = 0; i < 3; i++){
    if(!f[i][0]&&f[i][1]&&f[i][2]){
      f[i][0] = 1;
      a[i][0] = a[i][1] * 2 - a[i][2];
    }
    if(f[i][0]&&!f[i][1]&&f[i][2]){
      f[i][1] = 1;
      a[i][1] = (a[i][0]+a[i][2]) / 2;
    }
    if(f[i][0]&&f[i][1]&&!f[i][2]){
      f[i][2] = 1;
      a[i][2] = a[i][1] * 2 - a[i][0];
    }
    if(!f[0][i]&&f[1][i]&&f[2][i]){
      f[0][i] = 1;
      a[0][i] = a[1][i] * 2 - a[2][i];
    }
    if(f[0][i]&&!f[1][i]&&f[2][i]){
      f[1][i] = 1;
      a[1][i] = (a[0][i]+a[2][i]) / 2;
    }
    if(f[0][i]&&f[1][i]&&!f[2][i]){
      f[2][i] = 1;
      a[2][i] = a[1][i] * 2 - a[0][i];
    }
  }
}
void fill3(){
  for(int i = 0; i < 2; i++)fill();
}
void fillr(int r){
  int cnt = 0;
  for(int i = 0; i < 3; i++){
    if(!f[r][i]) cnt++;
  }
  if(cnt>1){
    int val = 0;
    for(int i = 0; i < 3; i++) val+=a[r][i];
    for(int i = 0; i < 3; i++){
      a[r][i] = val;
      f[r][i] = 1;
    }
  }
}
int main(){
  cin.sync_with_stdio(0);
  cin.tie(0);
  for(int i = 0; i < 3; i++){
    for(int j = 0; j < 3; j++){
      cin>>c;
      if(c!="X"){
        f[i][j] = 1;
        a[i][j] = stoi(c);
      }
    }
  }
  fill3();
  fillr(1);
  fill3();
  fillr(0);
  fill3();
  fillr(2);
  for(int i = 0; i < 3; i++){
    for(int j = 0; j < 3; j++){
      cout<<a[i][j]<<" ";
    } cout<<"\n";
  }
  return 0;
}
