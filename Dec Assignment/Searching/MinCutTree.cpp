#include <bits/stdc++.h>
using namespace std;

int woodCollected(int height[], int n, int m)
{
    int sum = 0;
    for (int i = n - 1; i >= 0; i--) {
        if (height[i] - m <= 0)
            break;
        sum += (height[i] - m);
    }

    return sum;
}


int collectKWood(int height[], int n,  int k)
{

    sort(height, height + n);


    int low = 0, high = height[n - 1];


    while (low <= high) {
        int mid = low + ((high - low) / 2);

        int collected = woodCollected(height, n, mid);

        if (collected == k)
            return mid;


        if (collected > k)
            low = mid + 1;

        else
            high = mid - 1;
    }

    return low;
}


int main()
{

	int n;
    int k;
	cin>>n>>k;

	int arr[n];

	for(int i=0;i<n;i++){
		cin>>arr[i];
	}

    cout << collectKWood(arr, n, k);

    return 0;
}