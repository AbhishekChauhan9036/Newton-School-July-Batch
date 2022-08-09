#include <iostream>
using namespace std;

int findSingle(int ar[], int ar_size)
	{

		int res = ar[0];
		for (int i = 1; i < ar_size; i++)
			res = res ^ ar[i];

		return res;
	}

int main()
	{
        int n;
        cin>>n;
        int arr[n];

        for(int i=0;i<n;i++){
            cin>>arr[i];
        }
		cout <<findSingle(arr, n);
		return 0;
	}