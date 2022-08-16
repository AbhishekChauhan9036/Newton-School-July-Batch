////bit............
#include <bits/stdc++.h>
using namespace std;
#define int long long int
int countSetBits(int n)
{
	int count = 0;
	while (n) {
		count += n & 1;
		n >>= 1;
	}
	return count;
}


int32_t main()
{
	int n;
	cin>>n;
	cout << countSetBits(n);
	return 0;
}