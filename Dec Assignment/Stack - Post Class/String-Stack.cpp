#include <bits/stdc++.h>
using namespace std;
const int N = 2e6 + 20;
string s, t, u, a;
 
int b[30];
int pos[30];
int h[N];
stack<char> sta;
int main()
{
    while (cin >> s)
    {
        int len = s.length();
        memset(b, 0, sizeof(b));
 
        for (int i = 0; s[i]; i++)
            b[s[i] - 'a']++;
        int i = 0, k;
        while (s[i])
        {
            int k1 = 26;
            if (!sta.empty())
                k1 = sta.top() - 'a';
            for (k = 0; k < 26; k++)
            {
                if (b[k])
                    break;
            }
            k = min(k1, k);
            while (true)
            {
                if (!sta.empty() && sta.top() - 'a' == k)
                    break;
                b[s[i] - 'a']--;
                sta.push(s[i++]);
                if (s[i] == '\0')
                    break;
            }
            if (!sta.empty())
            {
                printf("%c", sta.top());
                sta.pop();
            }
        }
        while (!sta.empty())
        {
            char c = sta.top();
            sta.pop();
            printf("%c", c);
        }
        cout << endl;
    }
    return 0;
}