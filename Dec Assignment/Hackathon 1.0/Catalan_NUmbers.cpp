#include<bits/stdc++.h>
#define int long long
#define ld long double
#define ll long long
#define pb push_back
#define endl '\n'
#define pi pair<int,int>
#define vi vector<int>
#define all(a) (a).begin(),(a).end()
#define fi first
#define se second
#define sz(x) (int)x.size()
#define hell 1000000007
#define rep(i,a,b) for(int i=a;i<b;i++)
#define dep(i,a,b) for(int i=a;i>=b;i--)
#define lbnd lower_bound
#define ubnd upper_bound
#define bs binary_search
#define mp make_pair
using namespace std;
const int N = 2e6 + 5;
const int mod = 1e9 + 7;
const int inf = 1e9 + 9;
int f[N], inv[N], res[N];
int power(int a, int b){
 int ans = 1;
 while(b){
 if(b&1)
 ans = (ans*a) % mod;
 b >>= 1;
 a = (a*a) % mod;
 }
 return ans;
}
void solve(){
 int n; cin >> n;
 cout << res[n] << endl;
}
void testcases(){
 int tt = 1;
 f[0] = 1;
 for(int i = 1; i < N; i++)
 f[i] = (i*f[i-1]) % mod;
 inv[N-1] = power(f[N-1], mod-2);
 for(int i = N-2; i >= 1; i--)
 inv[i] = ((i+1)*inv[i+1]) % mod;
 for(int i = 1; i < N/2; i++){
 res[i] = f[2*i];
 res[i] = (res[i]*inv[i]) % mod;
 res[i] = (res[i]*inv[i]) % mod;
 res[i] = (res[i]*power(i+1, mod-2)) % mod;
 }
 cin >> tt;
 while(tt--){
 solve();
 }
}
signed main()
{
 ios_base::sync_with_stdio(false);
 cin.tie(0);
 cout.tie(0);
 clock_t start = clock();
 testcases();
 return 0;
}