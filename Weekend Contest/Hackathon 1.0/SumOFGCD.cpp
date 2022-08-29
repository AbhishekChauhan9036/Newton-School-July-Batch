#include<bits/stdc++.h>
using namespace std;
#define int long long int
#define Abhishek main
int getCount(int d, int n){
    		int no = n / d;
    		int result = no;

    		for(int p = 2; p * p <= no; ++p){
 				if (no % p == 0){
            		while (no % p == 0)
                		no /= p;
            			result -= result / p;
        		}
    		}

    			if (no > 1)
        		result -= result / no;
    			return result;
}
 
int sumOfGCDofPairs(int n){
    		int res = 0;
 
    		for(int i = 1; i * i <= n; i++){
        		if (n % i == 0){ 
            	int d1 = i;
            	int d2 = n / i;
            	res += d1 * getCount(d1, n);
            	if (d1 != d2)
                res += d2 * getCount(d2, n);
        	}
    	}
    	return res;
}


int32_t Abhishek(){
	int t;
	cin>>t;
	while(t--){
		int n;
		cin>>n;

		cout<<sumOfGCDofPairs(n)<<endl;
	}
}