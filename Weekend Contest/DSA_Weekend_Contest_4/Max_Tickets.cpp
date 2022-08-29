#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;
#define int long long
#define Abhishek main
int32_t Abhishek() {

	    int  n ;
        cin>>n;
        int ans=0; 
        if(n>=500){
            ans+=(n/500)*1000;
            n=n-(500*(n/500));
        }
        
        if(n>=5){
            ans+=n/5*5;
        }
        cout<<ans;
	return 0;
}