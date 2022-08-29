#include<bits/stdc++.h>
#define ll long long int
 using namespace std;
 int main(){
    ll n,t;
    cin>>n>>t;
    ll a[n] ;
    cin>>a[0];
    ll sum = a[0];
    for (ll i = 1; i < n; i++)
    {
        cin>>a[i];
        ll k = min(a[i] - a[i-1],t);
        sum = sum + k;
    }

    cout<<sum + t<<endl;
    
 return 0;
}