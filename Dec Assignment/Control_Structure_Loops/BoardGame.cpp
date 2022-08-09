#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;

int main() {

	// Your code here
    int a,b;
    cin>>a>>b;
    if(a>b){
        cout<<"NO";
    }else if(a*6>=b){
        cout<<"YES";
    }else{
        cout<<"NO";
    }
	return 0;
}