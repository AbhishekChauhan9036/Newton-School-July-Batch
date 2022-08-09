#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;

int main() {

	// Your code here
	int m,y,r,g;
    cin>>m>>y>>r>>g;
	if(y+r>m || y*g>m) cout<<"1"<<endl;
	else cout<<"0"<<endl;
	return 0;
}