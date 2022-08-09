#include<bits/stdc++.h>
using namespace std;

int gcd(int a, int b)
{
    if (a == 0)
        return b;
    return gcd(b % a, a);
}
int main(){
    int sum=0;
    int x;
    cin>>x;
    for (int i=1;i<=x;i++){
        int f=1;
        for (int j=1;j<=i;j++){
            if(i%j==0) continue;
            if(gcd(j,i)==1)
                f*=j;
                f=f%i;
        }
        sum+=(f%i);
    }
    cout<<(sum%1000000007);
}