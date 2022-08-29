#ifdef Abhishek
  #include "Abhishek.h"
#else
  #include <bits/stdc++.h>
  using namespace std;
  #define debug(...) 42
#endif
#define all(c) begin(c),end(c)
using ll = long long;
const int MOD = 998244353, N = 5000 + 10; 

vector<int> g[N];
long long dp[N][N];
int pre[N];
int n, k;
vector<int> d;

void dfs(int u, int p, int c) {
   d[c]++;
   for (int v : g[u]) {
      if (v == p) continue;
      dfs(v, u, c + 1);
   }
}

long long get(vector<int> &a) {
   if (a.size() < k) return 0;
   int ans = 0;
   int sz = a.size();
   for (int i = 0; i <= sz + 5; ++i) {
      for (int j = 0; j <= k + 5; ++j) {
         dp[i][j] = 0;
      }
   }
   for (int i = sz - 1; i >= 0; --i) {
      dp[i][0] = (dp[i + 1][0] + a[i]) % MOD;
   }
   for (int j = 1; j < k; ++j) {
      for (int i = sz - 1; i >= 0; --i) {
         dp[i][j] = (dp[i + 1][j] * 1LL + (a[i] * 1LL * dp[i + 1][j - 1])) % MOD;
         dp[i][j] %= MOD;
      }
   }
   return dp[0][k - 1];
}

int32_t main(){
   ios::sync_with_stdio(false);
   cin.tie(NULL);
   cin >> n >> k;
   for (int i = 1; i < n; ++i) {
      int u, v;
      cin >> u >> v;
      g[u].push_back(v);
      g[v].push_back(u);
   }
   long long ans = 0;
   for (int c = 1; c <= n; ++c) {
      if (g[c].size() < k) continue;
      vector<vector<int>> T;
      for (int v : g[c]) {
         d.assign(n + 1, 0);
         dfs(v, c, 0);
         T.push_back(d);
      }
      for (int i = 0; i <= n; ++i) {
         vector<int> x;
         for (int j = 0; j < T.size(); ++j) {
            if (T[j][i]) {
               x.push_back(T[j][i]);
            }
         }
         ans += get(x);
         ans %= MOD;
      }
   }
   cout << ans << '\n';
   return 0;
}