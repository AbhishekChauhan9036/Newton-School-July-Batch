#include <bits/stdc++.h> // ..header file includes every Standard library
using namespace std;

int main()
{
    int a[100000], min,n,s=0;
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
        if(a[i]%2==0)
            a[i]=a[i]-1;
            s+=a[i];
        }
        min=a[0];
        for(int i=1;i<n;i++)
            if(a[i]<min)
            min=a[i];

   if(n%2==0)
   {
       printf("%d",s-min);
   }
   else
   {
       printf("%d",s);
   }
    return 0;
    }