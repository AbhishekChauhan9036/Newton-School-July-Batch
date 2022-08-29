#include<bits/stdc++.h>
using namespace std;
#define int long long int
#define Abhishek main

double getMedian(int  ar1[], int ar2[], int n, int m)
{
	int i = 0;
	int j = 0; 
	int  count;
	double m1 = -1, m2 = -1;

	for (count = 0; count <= (m + n)/2; count++)
	{

		m2=m1;
		if(i != n && j != m)
		{
			m1 = (ar1[i] > ar2[j]) ? ar2[j++] : ar1[i++];
		}
		else if(i < n)
		{
			m1 = ar1[i++];
		}

		else
		{
			m1 = ar2[j++];
		}
	}
	if((m + n) % 2 == 1){
		return m1;
	}
	else{
		return (m1+m2)/2;
	}
}
int32_t Abhishek()
{
	int n1,n2;
	cin>>n1>>n2;
	int  ar1[n1];
	int ar2[n2];

	for(int i=0;i<n1;i++){
		cin>>ar1[i];
	}

	for(int i=0;i<n2;i++){
		cin>>ar2[i];
	}
	printf("%0.2f",getMedian(ar1, ar2, n1, n2));
}