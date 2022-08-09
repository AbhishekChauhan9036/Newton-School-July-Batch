#include <bits/stdc++.h>

using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(0);
  int n;
  cin >> n;
  string s;
  cin >> s;
  int x = 0, y = 0;
  for (char c : s) {
    x += (c == 'a');
    y += (c == 'b');
  }
  cout << min(x, y) << '\n';
  return 0;
}