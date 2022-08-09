#include<iostream>
using namespace std;
int main()
{
    int t;
    cin>>t;
    for(int i=0;i<t;i++)
    {
        long long int x,y,z;
        cin>>x>>y>>z;
        x=z-x;
        y=z-y;
        z=(x>=y)?x:y;
        cout<<z<<"\n";
    }
}