/**
 *    author:  Abhishek Chauhan
 *    created:  Sat Mar 26 14:29:53 IST 2022

**/

#include<bits/stdc++.h>
#include<ext/pb_ds/assoc_container.hpp>
#include<ext/pb_ds/tree_policy.hpp>
#define pi 3.141592653589793238
#define int long long
#define ll long long
#define ld long double
using namespace __gnu_pbds;
using namespace std;
template <typename T>
using ordered_set = tree<T, null_type, less<T>, rb_tree_tag, tree_order_statistics_node_update>;
mt19937 rnd(chrono::high_resolution_clock::now().time_since_epoch().count());


long long powm(long long a, long long b,long long mod) {
long long res = 1;
while (b > 0) {
    if (b & 1)
        res = res * a %mod;
    a = a * a %mod;
    b >>= 1;
}

return res;
}

ll gcd(ll a, ll b)
{
if (b == 0)
    return a;
return gcd(b, a % b);      
}



int dp[500][50005];
const int mod=1e9+7;


signed main()
{

ios_base::sync_with_stdio(false);
cin.tie(NULL);
cout.tie(0);

#ifndef ONLINE_JUDGE
if(fopen("INPUT.txt","r"))
{
freopen("INPUT.txt","r",stdin);
freopen("OUTPUT.txt","w",stdout);
}
#endif

        
    dp[0][0]=1;
    for(int i=1;i<500;i++)
    {
        for(int j=0;j<=50000;j++)
        {
            dp[i][j]+=dp[i-1][j];
            if(j-i>=0)
                dp[i][j]+=dp[i][j-i];
            dp[i][j]%=mod;
        }
    }    

    int q;
    cin>>q;
    while(q--)
    {
        int n,k;
        cin>>n>>k;
        int tot=(k*(k+1))/2;
        tot=n-tot;

        if(tot<0)
            cout<<0<<'\n';
        else 
        {
            cout<<dp[k][tot]<<'\n';
        }
    }
}