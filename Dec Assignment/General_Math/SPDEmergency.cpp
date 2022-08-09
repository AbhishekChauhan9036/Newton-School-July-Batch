#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;

int main() {

	// Your code here
	int a[5];
	for(int i=0;i<5;i++){
		cin>>a[i];
	}
	sort(a,a+5);

	if(a[4]>=a[0]+a[1]+a[2]+a[3]){
		cout<<"SPD Emergency";
	}else{
		cout<<"Stable";
	}
	return 0;
}