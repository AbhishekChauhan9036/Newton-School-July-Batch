#include<bits/stdc++.h>
using namespace std;
long long gcd(long long a, long long b)
{
  
    if (a == 0)
       return b;
    if (b == 0)
       return a;
  
    if (a == b)
        return a;
  
  
    if (a > b)
        return gcd(a-b, b);
    return gcd(a, b-a);
}
int main()
{
	long long a,b;
	cin>>a>>b;
	long long k=gcd(a,b);
	cout<<k;
	return 0;
}