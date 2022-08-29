/**
 *    author:  Abhishek Chauhan
 *    created:  Sat Mar 26 14:09:53 IST 2022

**/


#include <bits/stdc++.h>
using namespace std;

	int reduceArrSize(int arr[],int n)
	{
		unordered_map<int,int> hm;

	
		for (int i = 0; i < n; i++) {
			hm[arr[i]]++;
		}

		vector<int> freq;

		for(auto it = hm.begin(); it != hm.end(); it++)
		{
			freq.push_back(it->second);
		}

	
		sort(freq.begin(), freq.end());

		int size = n;
		int idx = freq.size() - 1;
		int count = 0;

		while (size > n/ 2) {
			size -= freq[idx--];
			count++;
		}
		return count;
	}
	int main()
	{
		int n;
		cin>>n;

		int arr[n];
		for(int i=0;i<n;i++){
			cin>>arr[i];
		}
		int count = reduceArrSize(arr, n);
		cout<<(count);
		return 0;
	}