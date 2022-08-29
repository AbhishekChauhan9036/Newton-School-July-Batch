#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;
#define int long long
const int dx[4]={3,0,0,1};
int find(int x,int y,int pw,int rot)
{
	if(pw==0)
	return 0;
	int k=(1LL<<pw);
	int seg=(x<k)?((y<k)?0:3):((y<k)?1:2);
	seg=(seg+rot)&3;
	int xx=x&(x^k);
	int yy=y&(y^k);
	int nrot=(rot+dx[seg])&3;
	int sz=1LL<<(2*pw-2);
	int res=seg*sz;
	int ad=find(xx,yy,pw-1,nrot);
	res+=(seg==1 or seg==2)?ad:(sz-ad-1);
	return res;
}
int32_t main() {
	int n;
	cin>>n;
	vector<int> a(n);
	for(int i=0;i<n;i++)
	cin>>a[i],--a[i];
	int m;
	cin>>m;
	vector<int> l(m),r(m),d(m),id(m);
	for(int i=0;i<m;i++)
	{
		cin>>l[i]>>r[i]>>d[i];
		--l[i];
		--r[i];
		id[i]=find(l[i],r[i],19,0);
	}
	vector<int> ord(m),cc(n+1,0),pos(n+1,-1),e;
	iota(ord.begin(),ord.end(),0);
	sort(ord.begin(),ord.end(),[&](int i,int j){
		return id[i]<id[j];
	});
	auto remove=[&](int x)
	{
		if(x>0)
		{
			cc[x]--;
			if(cc[x]==0)
			{
				int w=e.back();
				e[pos[x]]=w;
				pos[w]=pos[x];
				pos[x]=-1;
				e.pop_back();
			}
		}
	};
	auto add=[&](int x)
	{
		if(x>0)
		{
			cc[x]++;
			if(cc[x]==1)
			{
				pos[x]=(int)e.size();
				e.push_back(x);
			}
		}
	};
	vector<int> cnt(n,0),res(m,0);
	int low=0,high=-1;
	for(auto i:ord)
	{
		while(high<r[i])
		{
			high++;
			remove(cnt[a[high]]);
			cnt[a[high]]++;
			add(cnt[a[high]]);
		}
		while(low>l[i])
		{
			low--;
			remove(cnt[a[low]]);
			cnt[a[low]]++;
			add(cnt[a[low]]);
		}
		while(high>r[i])
		{
			remove(cnt[a[high]]);
			cnt[a[high]]--;
			add(cnt[a[high]]);
			high--;
		}
		while(low<l[i])
		{
			remove(cnt[a[low]]);
			cnt[a[low]]--;
			add(cnt[a[low]]);
			low++;
		}
		auto z=e;
		sort(z.begin(),z.end());
		for(auto xx:z)
		{
			if((xx-1)*cc[xx]<=d[i])
			{
				res[i]+=cc[xx];
				d[i]-=(xx-1)*cc[xx];
			}
			else
			{
				res[i]+=d[i]/(xx-1);
				break;
			}
		}
	}
	for(int i=0;i<m;i++)
	cout<<res[i]<<'\n';
	return 0;
}