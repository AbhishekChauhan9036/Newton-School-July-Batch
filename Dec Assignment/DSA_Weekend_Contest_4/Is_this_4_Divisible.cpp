#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;
#define Abhishek main
int32_t Abhishek() {

		int n;
		cin>>n;

		int arr[n];

		for(int i=0;i<n;i++){
			cin>>arr[i];
		}

		int p=1;

		for(int i=0;i<n;i++){
			p*=arr[i];
		}

		if(p%4==0){
			cout<<"YES";
		}else{
			cout<<"NO";
		}
	return 0;
}