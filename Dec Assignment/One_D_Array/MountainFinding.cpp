#include <bits/stdc++.h>
using namespace std;
#define pb push_back
#define mp make_pair
#define mod 1000000007
#define For(i,n) for(int i=0;i<n;i++)
#define ff first
#define ss second
#define mem(a,b) memset(a,b,sizeof(a))
#define int long long
#define ld long double
int power_mod(int num,int g)
{
  if(g==0)return 1;

  if(g%2==1)return (num*power_mod((num*num)%mod,g/2))%mod;
  return power_mod((num*num)%mod,g/2);
}
int power(int num,int g)
{
  if(g==0)return 1;

  if(g%2==1)return (num*power((num*num),g/2));
  return power((num*num),g/2);
}
pair<int,int> pa[100005];
int tree[400005];
void update(int start,int end,int index,int ind,int val) {
  if(start==end) {
    tree[index]+=val;
    return;
  }
  int mid=(start+end)/2;
  if(ind<=mid)update(start,mid,2*index,ind,val);
  else update(mid+1,end,2*index+1,ind,val);
  tree[index]=tree[2*index]+tree[2*index+1];
  tree[index]%=mod;
}
int search(int start,int end,int index,int l,int r) {
  if(start>r || end<l)return 0;
  if(start>=l && end<=r)return tree[index];
  int mid=(start+end)/2;
  return search(start,mid,2*index,l,r)+search(mid+1,end,2*index+1,l,r);
}
int32_t main()
{

  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);
  
  
  int n;
  cin>>n;
  int a[n];
  For(i,n)cin>>a[i];
  set<int> st;
  For(i,n)st.insert(a[i]);
  map<int,int> mp1;
  int z=1;
  for(auto it=st.begin();it!=st.end();it++) {
    mp1[*it]=z;
    z++;
  }
  For(i,n)a[i]=mp1[a[i]];
  mem(tree,0);
  int b[n];
  For(i,n) {
    b[i]=search(1,z,1,1,a[i]-1);
    update(1,z,1,a[i],1);
    b[i]%=mod;
  }
  mem(tree,0);
  int c[n];
  For(i,n) {
    c[i]=search(1,z,1,1,a[i]-1);
    update(1,z,1,a[i],b[i]);
    c[i]%=mod;
  }
  For(i,n/2)swap(a[i],a[n-i-1]);
  mem(tree,0);
  For(i,n) {
    b[i]=search(1,z,1,1,a[i]-1);
    update(1,z,1,a[i],1);
    b[i]%=mod;
  }
  mem(tree,0);
  int d[n];
  For(i,n) {
    d[i]=search(1,z,1,1,a[i]-1);
    update(1,z,1,a[i],b[i]);
    d[i]%=mod;
  }
  For(i,n/2)swap(d[i],d[n-i-1]);
  int ans=0;
  For(i,n) {
    d[i]%=mod;
    c[i]%=mod;
    ans+=c[i]*d[i];
    ans%=mod;
  }
  cout<<ans<<endl;
  return 0;
}