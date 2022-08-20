#include <bits/stdc++.h>
using namespace std;
long long merge(long long arr[],long long temp[],long long left,long long mid,long long right)
    {
     	long long i=left,j=mid,k=left,ctrinv=0;
        while((i<=mid-1)&&(j<=right))
        {
            if(arr[i]<=arr[j])
            {
            	temp[k++]=arr[i++];    
            }
            else
            {
                temp[k++]=arr[j++];
                ctrinv=ctrinv+(mid-i);
            }            
        }
        while(i<=mid-1)
        {
            temp[k++]=arr[i++];    
        }
        while(j<=right)
        {
            temp[k++]=arr[j++];
        }
        for(i=left;i<=right;i++)
        {
            arr[i]=temp[i];
        }
        return ctrinv;
    }
    
long long mergesort(long long arr[],long long temp[],long long left,long long right)
    {
        long long mid=0,ctrinv=0;
        if(left<right)
        {
            mid=(left+right)/2;
            ctrinv+=mergesort(arr,temp,left,mid);
            ctrinv+=mergesort(arr,temp,mid+1,right);
            ctrinv+=merge(arr,temp,left,mid+1,right);
        }
        return ctrinv;
    }
long long int inversionCount(long long arr[], long long n)
    {
     
        long long temp[n];
        return mergesort(arr,temp,0,n-1);
    }

int main() {
    

        long long N;
        cin >> N;
        
        long long A[N];
        for(long long i = 0;i<N;i++){
            cin >> A[i];
        }
        cout <<inversionCount(A,N) << endl;

    
    return 0;
}