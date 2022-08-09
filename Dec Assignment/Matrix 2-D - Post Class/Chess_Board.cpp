#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;

int main() {

	 int n;
       
       cin>>n;
        int c1=0,c2=0;
        for(int i=1;i<=(n);i++){
            for(int j=1;j<=n;j++){
                int p; cin>>p;
                int x= (i+j)&1;
                if(p==x) c1+=1;
                if(p!=x) c2+=1;

            }
        }
        if(c1<c2){
          cout<<c1;
        }
        else{
         cout<<c2;
        }

	return 0;
}