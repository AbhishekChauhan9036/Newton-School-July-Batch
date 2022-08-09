#include<bits/stdc++.h>
#pragma GCC optimize "03"
using namespace std;
#define Abhishek main
#define int long long int
#define ld long double
#define pi pair<int, int>
#define pb push_back
#define fi first
#define se second
#define IOS ios::sync_with_stdio(false); cin.tie(0); cout.tie(0)
#ifndef LOCAL
#define endl '\n'
#endif
 
const int N = 2e5 + 5;
const int mod = 1e9 + 7;
const int inf = 1e9 + 9;

int power(int a, int b){
	int ans = 1;
	b %= (mod-1);
	while(b){
		if(b&1)
			ans = (ans*a) % mod;
		b >>= 1;
		a = (a*a) % mod;
	}
	return ans;
}

int f(int n, int p){
	int ans = 1;
	int cur = 1;
	while(cur <= n/p){
		cur = cur*p;
		int z = power(p, n/cur);
		ans = (ans*z) % mod;
	}
	return ans;
}

signed Abhishek() {
	IOS;
	int x, n, ans = 1;
	cin >> x >> n;
	for(int i = 2; i*i <= x; i++){
		if(x%i != 0)	continue;
		ans = (ans*f(n, i)) % mod;
		while(x%i == 0)
			x /= i;
	}	
	if(x > 1)
		ans = (ans*f(n, x)) % mod;
	cout << ans;
	return 0;
}