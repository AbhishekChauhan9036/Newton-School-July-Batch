#include <bits/stdc++.h>
using namespace std;
int countOnes(bool arr[], int low, int high)
{
if (high >= low)
{

	int mid = low + (high - low)/2;


	if ( (mid == high || arr[mid+1] == 0) && (arr[mid] == 1))
	return mid+1;

	if (arr[mid] == 1)
	return countOnes(arr, (mid + 1), high);

	return countOnes(arr, low, (mid -1));
}
return 0;
}

int main()
{
		int t;
		cin>>t;

		for(int i=0;i<t;i++){
			int n;
			cin>>n;

			bool arr[n];
			for(int j=0;j<n;j++){
				cin>>arr[j];
			}
			cout<< countOnes(arr, 0, n-1)<<endl;
		}
return 0;
}