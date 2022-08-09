#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;

int main() {

	char a,b;
	cin>>a>>b;
	if(a=='R' || b=='R'){
		cout<<'R';

	}else if(a=='J'){
		cout<<b;
	}else if(b=='J'){
		cout<<a;
	}else{
		cout<<'D';
	}

	return 0;
}