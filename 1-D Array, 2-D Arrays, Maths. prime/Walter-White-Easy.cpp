#include<bits/stdc++.h>
using namespace std;

#define pu push_back
#define fi first
#define se second
#define mp make_pair
// #define int long long
#define pii pair<int,int>
#define mm (s+e)/2
#define all(x) x.begin(), x.end()
#define For(i, st, en) for(int i=st; i<en; i++)
#define tr(x) for(auto it=x.begin(); it!=x.end(); it++)
#define fast std::ios::sync_with_stdio(false);cin.tie(NULL);
#define sz 2000015
#define qw1 freopen("input1.txt", "r", stdin); freopen("output1.txt", "w", stdout);
#define qw2 freopen("input2.txt", "r", stdin); freopen("output2.txt", "w", stdout);
#define qw3 freopen("input3.txt", "r", stdin); freopen("output3.txt", "w", stdout);
#define qw4 freopen("input4.txt", "r", stdin); freopen("output4.txt", "w", stdout);
#define qw5 freopen("input5.txt", "r", stdin); freopen("output5.txt", "w", stdout);
#define qw6 freopen("input6.txt", "r", stdin); freopen("output6.txt", "w", stdout);
#define qw freopen("input.txt", "r", stdin); freopen("output.txt", "w", stdout);
#define abhishek main
int A[sz],B[sz],C[sz],D[sz],E[sz],F[sz],G[sz];
int n,m;
signed abhishek()
{
	

		
		cin>>n;
		for(int i=0;i<n;i++)
		{
			cin>>A[i];
			F[i]=A[i];
		}
		cin>>m;
		for(int i=0;i<m;i++)
		{
			cin>>B[i];
			G[i]=B[i];
			C[m-i-1]=B[i];
		}
        C[m]=-500000000;
        for(int i=0;i<n;i++)
        {
        	C[i+m+1]=A[n-i-1];
        }

       int l=0,r=0;
       for(int i=1;i<=n+m;i++)
        {
        	if(i<=r)
        	{
        		E[i]=min(r-i+1,E[i-l]);
        	}

        	while(i+E[i]<=n+m && C[E[i]]-C[0]==C[i+E[i]]-C[i])
        	 E[i]++;
 
        	if(i+E[i]-1>r) {
        		l=i;r=i+E[i]-1;
        	}
        }
       for(int i=0;i<m;i++)
       {
       	C[i]=B[i];
       }
       for(int i=0;i<n;i++)
       {
       	C[i+m+1]=A[i];
       }

       for(int i=0;i<n;i++)
       {
          A[i]=E[n+m-i];
       }

        l=0;
        r=0;
        for(int i=1;i<=n+m;i++)
        {
        	if(i<=r)
        	{
        		D[i]=min(r-i+1,D[i-l]);
        	}

        	while(i+D[i]<=n+m && C[D[i]]-C[0]==C[i+D[i]]-C[i])
        	 D[i]++;

        	if(i+D[i]-1>r) {
        		l=i;r=i+D[i]-1;
        	}
        }
        // cout<<0<<" ";
        for(int i=0;i<n;i++)
        {
        	B[i]=D[i+m+1];
        	
        }
       
        int cnt=0;
        vector<pii> xx,yy;
          for(int i=0;i<=n;i++){

            int a=0;
            int b=0;
            if(i>0) a=A[i-1];
            if(i<n) b=B[i];
            // cout<<i<<" "<<a<<" "<<b<<endl;
           if(a+b>=m && (a==0 || b==0 ||(F[i]-F[i-1]==G[0]-G[m-1]))) 
           		{xx.pu(mp(i-a,i+b-m));  }
           	if(a==m) xx.pu(mp(i-a,i-a));
              if(b==m ) xx.pu(mp(i,i));
           

		}
		sort(xx.begin(),xx.end());
		for(int i=0;i<xx.size();i++)
		{  
			if(yy.size()==0) yy.pu(mp(xx[i].fi,xx[i].se));
			else{

				int p=yy.size()-1;
				
				if(yy[p].se>=xx[i].se) continue;
				if(yy[p].se>=xx[i].fi) yy[p].se=xx[i].se;
				else yy.pu(mp(xx[i].fi,xx[i].se));
			}
		}
		for(int i=0;i<yy.size();i++)
		{ 
			cnt+=yy[i].se-yy[i].fi+1;
		}
		cout<<cnt<<endl;

	
}