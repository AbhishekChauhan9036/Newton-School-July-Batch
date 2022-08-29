#include <bits/stdc++.h>

using namespace std;

#ifdef LOCAL
#include "algo/debug.h"
#else
#define debug(...) 42
#endif

int main() {
  ios::sync_with_stdio(false);
  cin.tie(0);
  int tt;
  cin >> tt;
  while (tt--) {
    long long n;
    cin >> n;
    if (n % 2 == 0) {
      long long x = __builtin_ctzll(n) - 1;
      if ((1LL << (x + 1)) != n) {
        cout << (1LL << x) << " " << (n - (1LL << (x + 1))) / 2 << " " << n / 2 << '\n';
        continue;
      }
    }
    cout << -1 << '\n';
  }
  return 0;
}