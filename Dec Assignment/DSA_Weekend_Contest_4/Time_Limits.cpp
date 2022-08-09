#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;
#define Abhishek main
#define int long long 
int32_t Abhishek()
{   
    int n,s;
    int t[200+10];
    cin>>n>>s;
    int maxl=0,ans;
    for(int i=1;i<=n;i++){
        cin>>t[i];
        maxl=max(maxl,t[i]);
    }
    ans=maxl*s/1000;
    if(maxl*s%1000)ans++;
    cout << ans << endl;

    return 0;
}