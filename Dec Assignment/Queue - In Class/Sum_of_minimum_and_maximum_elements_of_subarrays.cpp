#include<bits/stdc++.h>
using namespace std;
#define int long long

int SumOfKsubArray(int arr[] , int n , int k)
{
	int sum = 0; 


	deque< int > S(k), G(k);


	int i = 0;
	for (i = 0; i < k; i++)
	{

		while ( (!S.empty()) && arr[S.back()] >= arr[i])
			S.pop_back(); 


		while ( (!G.empty()) && arr[G.back()] <= arr[i])
			G.pop_back(); 

		G.push_back(i);
		S.push_back(i);
	}

	for ( ; i < n; i++ )
	{

		sum += arr[S.front()] + arr[G.front()];

		while ( !S.empty() && S.front() <= i - k)
			S.pop_front();
		while ( !G.empty() && G.front() <= i - k)
			G.pop_front();

		while ( (!S.empty()) && arr[S.back()] >= arr[i])
			S.pop_back(); // Remove from rear


		while ( (!G.empty()) && arr[G.back()] <= arr[i])
			G.pop_back(); 

	
		G.push_back(i);
		S.push_back(i);
	}


	sum += arr[S.front()] + arr[G.front()];

	return sum;
}


int32_t  main()
{
	int n,k;
	cin>>n>>k;

	int arr[n];
	for(int i=0;i<n;i++){
		cin>>arr[i];
	}
	cout << SumOfKsubArray(arr, n, k) ;
	return 0;
}