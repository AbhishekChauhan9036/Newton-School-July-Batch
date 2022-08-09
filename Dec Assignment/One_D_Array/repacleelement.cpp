#include<iostream>
using namespace std;
void modify(int arr[], int n)
{
	if (n <= 1)
	return;
	int prev = arr[0];
	arr[0] = arr[0] * arr[1];
	for (int i=1; i<n-1; i++)
	{	
		int curr = arr[i];
		arr[i] = prev * arr[i+1];
		prev = curr;
	}
	arr[n-1] = prev * arr[n-1];
}
int main()
{
	int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
	modify(arr, n);
	for (int i=0; i<n; i++)
	cout << arr[i] << " ";
	return 0;
}