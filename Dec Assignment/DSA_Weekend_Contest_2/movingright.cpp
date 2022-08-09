#include <bits/stdc++.h>
using namespace std;
int main (){
    int n;
    cin>>n;
    int count = 0;
    int count1 = 0, count2;
    int arr[n];
    for(int i=0; i<n; i++)
    {
       cin>>arr[i];
    }
    for(int i=0; i<n; i++)
    {
         if(arr[i]>=arr[i+1])
       {
           count++;
       }
       else{
           count1 = max(count1, count);
           count=0;
       }
    }
    cout<<count1<<endl;
}