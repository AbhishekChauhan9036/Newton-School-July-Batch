#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;
#define Abhishek main
int32_t Abhishek() {

	int x1,y1,x2,y2;
	cin>>x1>>y1>>x2>>y2;

	if(x1==x2&&y1>y2)
		{
			cout<<"South";
		}else if(x1==x2&&y1<y2)
		{
			cout<<"North";
		}else if(x1>x2&&y1==y2)
		{
			cout<<"West";
		}else if(x1<x2&&y1==y2)
		{
			cout<<"East";
		}else if(x1<x2&&y1>y2)
		{
			cout<<"South East";
		}else if(x1>x2&&y1>y2)
		{
			cout<<"South West";
		}else if(x1>x2&&y1<y2)
		{
			cout<<"North West";
		}else if(x1<x2&&y1<y2)
		{
			cout<<"North East";
		}

	return 0;
}