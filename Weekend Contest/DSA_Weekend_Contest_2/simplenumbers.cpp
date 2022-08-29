#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;

int main() {
    long long l,r,k,count=0;
    cin>>l>>r>>k;
    long long x = l/k;
    long long y = r/k;
    
    if(l%k==0){
        count+=1;
    }
    cout<<(y-x)+count<<endl;

	// Your code here
	return 0;
}