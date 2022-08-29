#include<bits/stdc++.h>
using namespace std;
#define Abhishek main

int Birthday_Paradox(double p){
	return ceil(sqrt(2*365*log(1/(1-p))));
}
int32_t Abhishek(){
	

	double d;
	cin>>d;

	cout<<Birthday_Paradox(d)<<endl;;
}