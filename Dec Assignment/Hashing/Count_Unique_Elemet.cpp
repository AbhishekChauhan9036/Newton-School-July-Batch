#include <bits/stdc++.h> // header file includes every Standard library
#include <algorithm>
#include <iostream>
using namespace std;
int distinct_elements(int arr[], int n){

   sort(arr, arr + n);

   int count = 0;
   for (int i = 0; i < n; i++){
 
      while (i < n - 1 && arr[i] == arr[i + 1]){
         i++;
      }
      count++;
   }
   return count;
}
// Main Function
int main(){
	int n;
	cin>>n;
	int arr[n];

	for(int i=0;i<n;i++){
		cin>>arr[i];
	}
   cout <<distinct_elements(arr, n)<<endl;
   return 0;
}