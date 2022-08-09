#include<bits/stdc++.h>
using namespace std;
#define Abhishek main
#define ll long long
#define VV vector
#define pb push_back
#define bitc  __builtin_popcountl
#define m_p make_pair
#define inf 200000000000000
#define MAXN 1000001
#define eps 0.000000000001
#define fastio ios_base::sync_with_stdio(false);cin.tie(NULL);
string char_to_str(char c){string tem(1,c);return tem;}
mt19937 rng(chrono::steady_clock::now().time_since_epoch().count());
template<class T>//usage rand<long long>()
T rand() {
    return uniform_int_distribution<T>()(rng);
}

#define S second
#define F first
#define int long long  
 

int v1[100001]={};
int v2[100001]={};
signed Abhishek()
{
	fastio;
	#ifdef Abhishek_Chauhan
		freopen("inputf.in","r",stdin);
		freopen("outputf.in","w",stdout);
	#endif
	int n;
	string s;
	cin>>s;
	n=s.length();
	vector<int> d1(n);
	for (int i = 0, l = 0, r = -1; i < n; i++) {
	    int k = (i > r) ? 1 : min(d1[l + r - i], r - i + 1);
	    while (0 <= i - k && i + k < n && s[i - k] == s[i + k]) {
	        k++;
	    }
	    d1[i] = k--;
	    if (i + k > r) {
	        l = i - k;
	        r = i + k;
	    }
	}
	int c=0;
	for(int i=0;i<n;++i)
	{
		int x=2*d1[i]-1;
		int j=i+d1[i]-1;
		while(v1[j]<x&&j>=i)
		{
			v1[j]=x;
			x-=2;
			++c;
			--j;
		}
	}
	for(int i=1;i<n;++i)
	{
		v1[i]=max(v1[i],v1[i-1]);
	}
	for(int i=n-1;i>=0;--i)
	{
		int x=2*d1[i]-1;
		int j=i-d1[i]+1;

		while(v2[j]<x&&j<=i)
		{
			v2[j]=x;
			x-=2;
			++j;
			++c;
		}
	}
	for(int i=n-2;i>=0;--i)
	{
		v2[i]=max(v2[i],v2[i+1]);
	}
	int ans=0;
	for(int i=1;i<n;++i)
	{
		ans=max(ans,v1[i-1]*v2[i]);
	}
	cout<<ans;
}