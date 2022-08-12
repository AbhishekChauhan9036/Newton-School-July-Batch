/*---------------------------------------------------------------------------------------------------------------------------*/
/* Author = Chauhan Abhishek */
/* Codechef Id = https://www.codechef.com/users/abhishekchauha */
/* Codeforces Id = https://codeforces.com/profile/abhishekchauhan903 */
/* Newton School Id = https://my.newtonschool.co/user/abhishekchauhan9036/ */
/* GitHub Id = https://github.com/AbhishekChauhan9036 */
/* Language = C++ */
/* Address = Ballia,UP,INDIA (221716)*/
/*---------------------------------------------------------------------------------------------------------------------------*/

#pragma GCC optimize("O3,unroll-loops")
#include<bits/stdc++.h>
#define MOD1 998244353
#define vi vector<int>
#define v2i vector<vi>
#define ii pair<int, int>
#define F first
#define S second
#define INI 1e5+18
#define MOD 1000000007
#define ll long long
#define lli long long int
#define lld long long double
#define ull unsigned long long
#define cline "\n"
#define pb push_back
#define ppb pop_back
#define mp make_pair
#define ff first
#define ss second
#define PI 3.141592653589793238462
#define set_bits __builtin_popcountll
#define sz(x) ((int)(x).size())
#define all(x) (x).begin(), (x).end()
#define fr(a,b) for(int i = a; i < b; i++)
#define rep(i,a,b) for(int i = a; i < b; i++)
#define inf (1LL<<60)
#define all(x) (x).begin(), (x).end()
#define prDouble(x) cout << fixed << setprecision(10) << x
#define triplet pair<ll,pair<ll,ll>>
#define goog(tno) cout << "Case #" << tno <<": "
#define fast_io ios_base::sync_with_stdio(false);cin.tie(NULL)
#define read(x) int x; cin >> x;
#define loop(i,a,b)     for(int i = (a); i<=(b); i++ )
const int pepp=1e5+10;
using namespace std;

/*--------------------------------------------------------------------------------------------------------------------------*/
void Ramayan__Ramayan(){
    fast_io;
    #ifndef ONLINE_JUDGE
    freopen("input.txt", "r", stdin);
    freopen("output.txt", "w", stdout);
    #endif 
}

void HareRam_HareRam(){
    fast_io;
}
/*--------------------------------------------------------------------------------------------------------------------------*/


/*---------------------------------------------------------------------------------------------------------------------------*/
ll gcd(ll a, ll b) {if (b > a) {return gcd(b, a);} if (b == 0) {return a;} return gcd(b, a % b);}
ll expo(ll a, ll b, ll mod) {ll res = 1; while (b > 0) {if (b & 1)res = (res * a) % mod; a = (a * a) % mod; b = b >> 1;} return res;}
void extendgcd(ll a, ll b, ll*v) {if (b == 0) {v[0] = 1; v[1] = 10; v[2] = a; return ;} extendgcd(b, a % b, v); ll x = v[1]; v[1] = v[0] - v[1] * (a / b); v[0] = x; return;} //pass an arry of size1 3
ll mod_add(ll a, ll b, ll m) {a = a % m; b = b % m; return (((a + b) % m) + m) % m;}
ll mod_mul(ll a, ll b, ll m) {a = a % m; b = b % m; return (((a * b) % m) + m) % m;}
ll mod_sub(ll a, ll b, ll m) {a = a % m; b = b % m; return (((a - b) % m) + m) % m;}
ll mminv(ll a, ll b) {ll arr[3]; extendgcd(a, b, arr); return mod_add(arr[0], 0, b);} //for non prime b
ll mminvprime(ll a, ll b) {return expo(a, b - 2, b);}
bool revsort(ll a, ll b) {return a > b;}
ll mod_div(ll a, ll b, ll m) {a = a % m; b = b % m; return (mod_mul(a, mminvprime(b, m), m) + m) % m;}  //only for prime m
ll combination(ll n, ll r, ll m, ll *fact, ll *ifact) {ll val1 = fact[n]; ll val2 = ifact[n - r]; ll val3 = ifact[r]; return (((val1 * val2) % m) * val3) % m;}
void google(int t) {cout << "Case #" << t << ": ";}
vector<ll> sieve(int n) {int*arr = new int[n + 1](); vector<ll> vect; for (int i = 2; i <= n; i++)if (arr[i] == 0) {vect.push_back(i); for (int j = 2 * i; j <= n; j += i)arr[j] = 1;} return vect;}
ll phin(ll n) {ll number = n; if (n % 2 == 0) {number /= 2; while (n % 2 == 0) n /= 2;} for (ll i = 3; i <= sqrt(n); i += 2) {if (n % i == 0) {while (n % i == 0)n /= i; number = (number / i * (i - 1));}} if (n > 1)number = (number / n * (n - 1)) ; return number;} //O(sqrt(N)) 
ll power(ll a , ll b) {if (b == 0)return 1; ll temp = power(a, b / 2);temp = ( temp * temp) ;if (b % 2 == 1)return (temp * a) ;return temp ;}
/*--------------------------------------------------------------------------------------------------------------------------*/


/*--------------------------------------------------------------------------------------------------------------------------*/
ll x[2][2];
void laxmi(ll a[2][2], ll b[2][2])
{
    ll c[2][2] = {{0, 0}, {0, 0}};
    for (int i = 0; i < 2; i++)
        for (int j = 0; j < 2; j++)
            for (int k = 0; k < 2; k++)
                c[i][k] = (c[i][k] + ((a[i][j] % MOD) * (b[j][k] % MOD)) % MOD) % MOD;
    x[0][0] = c[0][0];
    x[0][1] = c[0][1];
    x[1][0] = c[1][0];
    x[1][1] = c[1][1];
}
void ganesh(ll a[2][2], ll n)
{
    if (n == 0)
    {
        x[0][0] = 1;
        x[0][1] = 0;
        x[1][0] = 0;
        x[1][1] = 1;
        return;
    }
    ganesh(a, n / 2);
    laxmi(x, x);
    if (n & 1)
        laxmi(x, a);
}
/*--------------------------------------------------------------------------------------------------------------------------*/


/*--------------------------------------------------------------------------------------------------------------------------*/
struct Hashing{
    string s;
    int n;
    int primes;
    vector<ll> hashPrimes = {1000000009, 100000007};
    const ll base = 31;
    vector<vector<ll>> hashValues;
    vector<vector<ll>> powersOfBase;
    Hashing(string a){
        primes = sz(hashPrimes);
        hashValues.resize(primes);
        powersOfBase.resize(primes);
        s = a;
        n = s.length(); 
        for(int i = 0; i < sz(hashPrimes); i++) {
            powersOfBase[i].resize(n + 1);
            powersOfBase[i][0] = 1;
            for(int j = 1; j <= n; j++){
                powersOfBase[i][j] = (base * powersOfBase[i][j - 1]) % hashPrimes[i];
            }
        }
        for(int i = 0; i < sz(hashPrimes); i++) {
            hashValues[i].resize(n);
            for(int j = 0; j < n; j++){
                hashValues[i][j] = ((s[j] - 'a' + 1LL) * powersOfBase[i][j]) % hashPrimes[i];
                hashValues[i][j] = (hashValues[i][j] + (j > 0 ? hashValues[i][j - 1] : 0LL)) % hashPrimes[i];
            }
        }
    }
    void addCharacter(char ch){
        s += ch;
        n = sz(s);
        for(int i = 0; i < sz(hashPrimes); i++){
            while(sz(powersOfBase[i]) < sz(s)){
                powersOfBase[i].pb((powersOfBase[i].back() * base) % hashPrimes[i]);   
            }
        }
        for(int i = 0; i < sz(hashPrimes); i++){
            while(sz(hashValues[i]) < sz(s)){
                if(sz(hashValues[i]) == 0){
                    hashValues[i].pb((s[0] - 'a' + 1LL) % hashPrimes[i]);
                }else{
                    ll extraHash = hashValues[i].back() + ((s.back() - 'a' + 1LL) * powersOfBase[i][sz(s) - 1]) % hashPrimes[i];
                    hashValues[i].pb((extraHash + hashPrimes[i]) % hashPrimes[i]);
                }
            }
        }
    }
    vector<ll> substringHash(int l, int r){ 
        vector<ll> hash(primes);
        for(int i = 0; i < primes; i++){
            ll val1 = hashValues[i][r];
            ll val2 = l > 0 ? hashValues[i][l - 1] : 0LL;
            hash[i] = mod_mul(mod_sub(val1, val2, hashPrimes[i]), mminvprime(powersOfBase[i][l], hashPrimes[i]), hashPrimes[i]);
        }
        return hash;
    }
    bool compareSubstrings(int l1, int r1, int l2, int r2){ 
        if(l1 > l2){
            swap(l1, l2);
            swap(r1, r2);
        }
        for(int i = 0; i < primes; i++){
            ll val1 = mod_sub(hashValues[i][r1], (l1 > 0 ? hashValues[i][l1 - 1] : 0LL), hashPrimes[i]);
            ll val2 = mod_sub(hashValues[i][r2], (l2 > 0 ? hashValues[i][l2 - 1] : 0LL), hashPrimes[i]);
            if(mod_mul(val1, powersOfBase[i][l2 - l1], hashPrimes[i]) != val2)
                return false;
        }   
        return true;
    }
};
/*--------------------------------------------------------------------------------------------------------------------------*/


/*--------------------------------------------------------------------------------------------------------------------------*/
struct BinaryLifting {
    int n;
    int maxLog;
    ll maxRequirement;
    vector<vector<int>> parent;
    BinaryLifting(int n1, vector<int> *edges, ll requirement, int root) {
        n = n1;
        parent.resize(n1);
        maxLog = log2(requirement + 1);
        maxRequirement = requirement;
        for (int i = 0; i < n; i++) {
            parent[i].resize(maxLog + 1);
            for (int j = 0; j <= maxLog; j++) {
                parent[i][j] = -1;
            }
        }
        fillParentTable(root, edges);
    }
    void fillParentTable(int root, vector<int> *edges) {
        vector<bool> visited(n);
        dfsBinaryLifting(root, edges, visited);
        int intermediate = -1;
        for (int i = 1; i <= maxLog; i++) {
            for (int j = 0; j < n; j++) {
                intermediate = parent[j][i - 1];
                if (intermediate != -1) {
                    parent[j][i] = parent[intermediate][i - 1];
                }
            }
        }
    }
    void dfsBinaryLifting(int root, vector<int> *edges, vector<bool> &visited) {
        visited[root] = true;
        for (auto i : edges[root]) {
            if (!visited[i]) {
                parent[i][0] = root;
                dfsBinaryLifting(i, edges, visited);
            }
        }
    }
    int kthParent(int x, int k) {
        for(int i = 0; i <= maxLog; i++){
            if((k >> i) & 1){ 
                if(x == -1)
                    return x;
                x = parent[x][i];
            }
        }
        return x;
    }
};
/*--------------------------------------------------------------------------------------------------------------------------*/


/*--------------------------------------------------------------------------------------------------------------------------*/
struct UnionFind {
    int n;
    vector<int> rank;
    vector<int> parent;
    UnionFind(int n) {
        rank.resize(n);
        fill(rank.begin(), rank.end(), 0);
        parent.resize(n);
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }
    int get(int a) {
        return parent[a] = (parent[a] == a ? a : get(parent[a]));
    }
    void merge(int a, int b) {
        a = get(a);
        b = get(b);
        if (a == b) {
            return;
        }
        if (rank[a] == rank[b]) {
            rank[a]++;
        }
        if (rank[a] > rank[b]) {
            parent[b] = a;
        } else {
            parent[a] = b;
        }
    }
};
/*--------------------------------------------------------------------------------------------------------------------------*/


/*--------------------------------------------------------------------------------------------------------------------------*/
void _yes() {cout<<"YES"<<cline;}
void _no() {cout<<"NO"<<cline;}
/*--------------------------------------------------------------------------------------------------------------------------*/


/*--------------------------------------------------------------------------------------------------------------------------*/
void Bhagwat_Geeta(){
  int _Kuber=1;
  // cin>>_Kuber;
  while(_Kuber--){
        lli n;
        lli ans=0;
        cin>>n;
        vi v;
        for (int i = 1; i <= sqrt(n); i++) {
        if (n % i == 0) {
            if (n / i == i)
                ans++;
            else {
                ans++;
                v.pb(n / i);
            }
        }
    }
    for (int i = v.size() - 1; i >= 0; i--){    
        ans++;
    }
    cout<<ans<<cline;

    }    
}
/*-------------------------------------------------------------------------------------------------------------------------*/
signed main() {
    // Ramayan__Ramayan();
    HareRam_HareRam();
    Bhagwat_Geeta();
   return 0;
}
/*--------------------------------------------------------------------------------------------------------------------------*/