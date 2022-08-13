#include <bits/stdc++.h>
using namespace std;
int minXOR(int arr[], int n)
{
	sort(arr, arr + n);

	int minXor = INT_MAX;
	int val = 0;

	for (int i = 0; i < n - 1; i++) {
		val = arr[i] ^ arr[i + 1];
		minXor = min(minXor, val);
	}

	return minXor;
}

int main()
{
	int n;
	cin>>n;

	int arr[n];
	for(int i=0;i<n;i++){
		cin>>arr[i];
	}
	cout << minXOR(arr, n) << endl;

	return 0;
}