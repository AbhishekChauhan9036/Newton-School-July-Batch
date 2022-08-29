#include <bits/stdc++.h>
using namespace std;
#define INF 0x3f3f3f3f
#define LC(x) (x<<1)
#define RC(x) ((x<<1)+1)
#define MID(x,y) ((x+y)>>1)
#define CLR(arr,val) memset(arr,val,sizeof(arr))
#define FAST_IO ios::sync_with_stdio(false);cin.tie(0);
typedef pair<int, int> pii;
typedef long long LL;
const double PI = acos(-1.0);
const int N = 100010;
const int M = 320;
struct Block
{
    int l, r;
};
Block B[M];
vector<int>prepos[N];
int arr[N], pre[N], ori[N], belong[N];
int unit, bcnt;

void reset(int bx)
{
    sort(pre + B[bx].l, pre + B[bx].r + 1);
}
void init(int n)
{
    int i;
    unit = sqrt(n);
    bcnt = n/unit;
    if (n % unit)
        ++bcnt;
    for (i = 1; i <= bcnt; ++i)
    {
        B[i].l = (i - 1) * unit + 1;
        B[i].r = i * unit;
    }
    B[bcnt].r = n;
    for (i = 1; i <= n; ++i)
        belong[i] = (i - 1)/unit + 1;
    for (i = 1; i <= bcnt; ++i)
        reset(i);
}
int bs(int bx, int key)
{
    int ans = -1;
    int L = B[bx].l, R = B[bx].r;
    while (L <= R)
    {
        int mid = MID(L, R);
        if (pre[mid] < key)
        {
            ans = mid;
            L = mid + 1;
        }
        else
            R = mid - 1;
    }
    return ~ans ? ans - B[bx].l + 1 : 0;
}
int query(int l, int r)
{
    int bl = belong[l], br = belong[r];
    int ans = 0;
    if (bl == br)
    {
        for (int i = l; i <= r; ++i)
            if (ori[i] < l)
                ++ans;
    }
    else
    {
        for (int i = l; i <= B[bl].r ; ++i)
            if (ori[i] < l)
                ++ans;
        for (int i = B[br].l; i <= r; ++i)
            if (ori[i] < l)
                ++ans;
        for (int i = bl + 1; i < br; ++i)
            ans += bs(i, l);
    }
    return ans;
}
int main(void)
{
    int n, k, i;
    scanf("%d%d", &n, &k);
    for (i = 1; i <= n; ++i)
    {
        scanf("%d", &arr[i]);
        int sz = prepos[arr[i]].size();
        if (sz < k)
        {
            pre[i] = 0;
        }
        else
            pre[i] = prepos[arr[i]][sz - k];
        ori[i] = pre[i];
        prepos[arr[i]].push_back(i);
    }
    init(n);
    int last = 0;
    int q;
    scanf("%d", &q);
    while (q--)
    {
        int l, r;
        scanf("%d%d", &l, &r);
        l = (l + last) % n + 1;
        r = (r + last) % n + 1;
        if (l > r)
            swap(l, r);
        printf("%d\n", last = query(l, r));
    }
    return 0;
}