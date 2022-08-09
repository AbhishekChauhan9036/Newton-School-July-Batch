#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;
#define int long long
int32_t main() {
	// Your code here
    const int nax=1e16;
    const int maxn=1e6;
    vector<pair<int,int>> e;
    for(int i=1;i<=maxn;i++)
    {
        int x=i*(i+1);
        for(int j=i+2;;j++)
        {
            int g=__gcd(x,j);
            x/=g;
            if(x>nax/j)
            break;
            x*=j;
            e.push_back({x,j});
        }
    }
    sort(e.begin(),e.end());
    int t;
    cin>>t;
    while(t--)
    {
        int x,r,res=0;
        cin>>x>>r;
        int a=(int)floor(sqrt(x));
        if(a*(a+1)==x and a+1<=r)
        res++;
        auto it1=lower_bound(e.begin(),e.end(),make_pair(x,-1LL));
        auto it2=lower_bound(e.begin(),e.end(),make_pair(x,r+1));
        res+=(int)(it2-it1);
        cout<<res<<endl;
    }
	return 0;
}