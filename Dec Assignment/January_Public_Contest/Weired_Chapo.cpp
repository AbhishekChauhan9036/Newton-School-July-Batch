/**
 *    author:  Abhishek Chauhan
 *    created: Tue Mar 29 23:31:06 IST 2022
**/


#include<bits/stdc++.h>
using namespace std;
#define ll long long
#define Chauhan_Abhishek main
ll gcd(ll a, ll b) { return b ? gcd(b, a%b) : a; }


int32_t Chauhan_Abhishek()
{
	ll n;
	ll rick,morty;
	cin>>n>>rick>>morty;

	ll gc;

	for(int i=0;i<n;i++) {
		ll s;cin>>s;
		gc=(i==0)? s: gcd(gc,s);
	}
	
	ll val = abs(morty-rick);
	
	if(val%gc==0) {
		cout<<"Yes\n";
	} else {
		cout<<"No\n";
	}
	return 0;
}