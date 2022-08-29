#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;

int main() {

	long long x,y,n;
	cin>>x>>y>>n;
	bool f=true;

	for(int i=1;i<=n;i++){
		long long sum1=n-i*y;
		long long sum2=n+i*y;

	if(sum1%x==0 || sum2%x==0){
		cout<<"YES";
		f=false;
		break;
	}
	}
	if(f==true){
		cout<<"NO";
	}
	return 0;
}