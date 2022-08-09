#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;


void fun(int n){	
  int i, m=0, flag=0;    
  m=n;  
  for(i = 2; i <= sqrt(m); i++)  
  {  
      if(n % i == 0)  
      {  
		  cout<<"No"<<endl; 
          flag=1;  
          break;  
      }  
  }  
  if (flag==0)  
      cout <<"Yes"<<endl;  
}
int main() {

	int n;
	cin>>n;
	for(int i=1;i<=n;i++){
		int p;
		cin>>p;
		fun(p);
	}
	return 0;
}