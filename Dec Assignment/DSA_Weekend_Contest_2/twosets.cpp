#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;

int main() {
    long long n;
    cin>>n;
    long long sum = (n*(n+1))/2;
    if(sum%2==0){
        cout<<0<<endl;
    }
    else{
        cout<<1<<endl;
    }

	// Your code here
	return 0;
}