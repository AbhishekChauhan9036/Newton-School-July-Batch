#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;

int main() {

	// Your code here
	int n;
	cin>>n;
	int arr[n];
	for(int i=0;i<n;i++)cin>>arr[i];
	sort(arr,arr+n);
	int ans=0;
	for(int i=n-1;i>=1;i--){
     if(arr[i]!=arr[i-1]){ans=arr[i-1];break;}
	}
	cout<<ans<<endl;
	return 0;
}