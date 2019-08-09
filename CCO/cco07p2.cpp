#include <bits/stdc++.h>
using namespace std;
int N, smol, ind, l, r;
int A[6],B[6],C[6];
string cw,ccw;
set<string>snowflakes;
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>N;
    for(int i = 0; i < N; i++){
        smol=-1; cw=""; ccw=""; l=0; r=0;
        for(int j = 0; j < 6; j++){
            cin>>A[j];
            if(A[j]>smol){
                smol=A[j];
                ind=j;
            }
        }
        for(int j = ind; j < 6; j++,r++){
            cw+=to_string(A[j]);
            B[r]=A[j];
        }
        for(int j = 0; j < ind; j++,r++){
            cw+=to_string(A[j]);
            B[r]=A[j];
        }
        for(int j = ind; j >= 0; j--,l++){
            ccw+=to_string(A[j]);
            C[l]=A[j];
        }
        for(int j = 5; j > ind; j--,l++){
            ccw+=to_string(A[j]);
            C[l]=A[j];
        }
        if(cw==ccw){
            snowflakes.insert(cw);
            continue;
        }
        for(int i = 0; i < 6; i++){
            if (B[i]>C[i]){
                snowflakes.insert(cw);
                break;
            } else if (C[i]>B[i]){
                snowflakes.insert(ccw);
                break;
            }
        }
    }
    if(snowflakes.size()==N){
        cout<<"No two snowflakes are alike.\n";
    } else {
        cout<<"Twin snowflakes found.\n";
    }
    return 0;
}
