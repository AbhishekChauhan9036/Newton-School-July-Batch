#include <bits/stdc++.h>
using namespace std;
bool isPrime(int n)
{
	if (n <= 1)
		return false;


	for (int i = 2; i < n; i++)
		if (n % i == 0)
			return false;

	return true;
}
int ppp=0;
void printPrime(int n)
{
	for (int i = 2; i <= n; i++) {
		if (isPrime(i))
			ppp++;
	}
    cout<<ppp<<endl;
    ppp=0;
}

int main()
{
    int t;
    cin>>t;

    while(t--){
    int n;cin>>n;
	printPrime(n);
    }
}