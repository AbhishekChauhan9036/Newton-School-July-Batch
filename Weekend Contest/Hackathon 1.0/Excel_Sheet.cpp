#include<bits/stdc++.h>
using namespace std;
#define int long long int
#define Abhishek main

int Column_Number(string s){
		int result = 0;
		int n = s.size();
		char arr[n];
		strcpy(arr, s.c_str());

		for(int i=0; i<n; i++){
			result = (result*26 + arr[i] - 'A' + 1)%1000000007;
		}
		return result;
}
int32_t Abhishek(){
	string s1;
	cin>>s1;

	cout<<Column_Number(s1);
	return 0;
}