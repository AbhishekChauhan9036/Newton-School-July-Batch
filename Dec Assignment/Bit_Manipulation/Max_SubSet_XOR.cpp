#include<bits/stdc++.h>
using namespace std;


#define INT_BITS 32
class Solution
{
    public:
    int maxSubarrayXOR(int set[], int n)
    {
        
        int index = 0;
     
       
        for (int i=INT_BITS-1; i>=0; i--)
        {
        
            int maxInd = index, maxEle = INT_MIN;
            for (int j=index; j<n; j++)
            {
                 
                 if ( (set[j]&(1<<i))!= 0 && set[j]>maxEle )
                    maxEle = set[j], maxInd = j;
            }
     
            
            if (maxEle == INT_MIN)
               continue;
     
   
            swap(set[index], set[maxInd]);
     
            
            maxInd = index;
     
          
            for (int j=0; j<n; j++)
            {
                
                if ((j!=maxInd) && ((set[j] & (1<<i)) !=0))
                    set[j] = set[j]^set[maxInd];
            }
     
          
            index++;
        }
     
       
        int res = 0;
        for (int i=0; i<n; i++)
        { 
            res ^= set[i]; }
        return res;
    }

};

// { Driver Code Starts.
int main()
{

    int t,n,a[100004],k;
    t=1;
    while(t--)
    {
        //cin>>n;
       scanf("%d",&n);
        for(int i=0;i<n;i++)
        {
            scanf("%d",&a[i]);
        }
        Solution obj;
        printf("%d\n",obj.maxSubarrayXOR(a,n));
       // cout<<bin(a,0,n-1,k)<<endl;
    }
}  // } Driver Code Ends