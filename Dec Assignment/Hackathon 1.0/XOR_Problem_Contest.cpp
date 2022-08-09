#include <bits/stdc++.h>
#define Abhishek main
#define int long long
using namespace std;
int32_t Abhishek(){
     int a,T;
     cin>>T;
     while(T--){
        int ans=1;
        cin>>a;
         int di=0;
         while(a){
             if(a&1){
                 a/=2;
                 di++;
             }
             else {
                 a/=2;
             }
         }
         ans=pow(2,di);
         cout<<ans<<endl;
     }
 }