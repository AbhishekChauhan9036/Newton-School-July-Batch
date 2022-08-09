#include <bits/stdc++.h>
using namespace std;
#define int long long

int32_t main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, m;
    cin >> n >> m;
    vector <vector <pair <int, int> > > g(n);
    vector <pair <int, int> > ed;
    for (int i = 1; i < n; i++) {
        int u, v;
        cin >> u >> v;
        --u, --v;
        ed.push_back({u, v});
    }
    for (int i = 0; i < m; i++) {
        int u, v, w;
        cin >> u >> v >> w;
        --u, --v;
        g[u].push_back({v, w});
        g[v].push_back({u, w});
    }
    vector <int> val(n, -1);
    int ok = 1, cnt = 0;
    function <void(int, int)> dfs = [&] (int v, int p) {
        for (auto [u, w] : g[v]) {
            if (u == p) continue;
            if (val[u] != -1) {
                if (val[u] != (val[v] ^ w)) ok = 0;
            }
            else {
                val[u] = val[v] ^ w;
                dfs(u, v);
            }
        }
    };
    for (int i = 0; i < n; i++) {
        if (val[i] != -1) continue;
        val[i] = 0;
        dfs(i, i);
        cnt++;
    }
    if (ok == 0) {
        cout << "Zero";
        return 0;
    }
    if (cnt > 1) {
        cout << "Multiple";
        return 0;
    }
    cout << "One\n";
    int ans = 0;
    for (auto [u, v] : ed) {
        int x = val[u] ^ val[v];
        ans ^= (x * x);
    }
    cout << ans;
}