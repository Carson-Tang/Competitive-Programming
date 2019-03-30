#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int t,g,a,b,sa,sb,played[7],ans;
bool check(vector<int>s){
    int mx = 0, win = 0;
    for(int i = 1; i <= 4; i++){
        if(s[i]>mx) mx=s[i];
    }
    for(int i = 1; i <= 4; i++){
        if(s[i]==mx){
            if(win){
                return 0;
            }
            win=i;
        }
    }
    return win==t;
}
void recur(int idx, vector<int>s){
    if(idx==7){
        if(check(s)) ans++;
        return;
    }
    if(played[idx]){
        recur(idx+1,s);
    } else {
        if(idx==1||idx==2||idx==3){
            s[1]++;
            s[idx+1]++;
            recur(idx+1,s);
            s[1]+=2;
            s[idx+1]--;
            recur(idx+1,s);
            s[1]-=3;
            s[idx+1]+=3;
            recur(idx+1,s);
        } else if (idx==4||idx==5){
            s[2]++;
            s[idx-1]++;
            recur(idx+1,s);
            s[2]+=2;
            s[idx-1]--;
            recur(idx+1,s);
            s[2]-=3;
            s[idx-1]+=3;
            recur(idx+1,s);
        } else if(idx==6){
            s[3]++;
            s[4]++;
            recur(idx+1,s);
            s[3]+=2;
            s[4]--;
            recur(idx+1,s);
            s[3]-=3;
            s[4]+=3;
            recur(idx+1,s);
        }
    }
}
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>t>>g;
    vector<int>score(5);
    fill(score.begin(),score.end(),0);
    for(int i = 0; i < g; i++){
        cin>>a>>b>>sa>>sb;
        if(sa>sb) score[a]+=3;
        else if (sb>sa) score[b]+=3;
        else {
            score[a]++;
            score[b]++;
        }
        if(a==1) played[b-1]=1;
        else if (a==2) played[b+1]=1;
        else played[6]=1;
    }
    recur(1,score);
    cout<<ans<<"\n";
    return 0;
}
