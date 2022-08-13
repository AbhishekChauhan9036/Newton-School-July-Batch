#include <bits/stdc++.h>
using namespace std;
int isprime(int num){
   if (num <= 1)
      return 0;
   for (int i = 2; i <= sqrt(num); i++){
      if (num % i == 0)
         { return 0; }
   }
   return 1;
}
int countPrimes(int strt,int end){
   int count=0;
   for(int i=strt;i<=end;i++){
      if(isprime(i)==1)
         { count++; }
   }
   return count;
}
int main(){
   int START=1, END;
   cin>>END;
   cout<<countPrimes(START,END);
   return 0;
}