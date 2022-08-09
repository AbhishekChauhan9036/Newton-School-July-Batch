#include <bits/stdc++.h>
using namespace std;
vector <int> maxOfMin(int array[], int n)
    {

    int size = n;
    vector<int> res(size, 0);
    stack<int> s;
    for (int i = 0; i < size; i++)
    {
        while ((!s.empty()) && (array[s.top()] >= array[i]))
        {
            int top = s.top();
            s.pop();
            int temp = (s.empty() ? i : i - s.top() - 1);
            res[temp - 1] = max(res[temp - 1], array[top]);
        }
        s.push(i);
    }
    while (!s.empty())
    {
        int top = s.top();
        s.pop();
        int temp = (s.empty() ? size : size - s.top() - 1);
        res[temp - 1] = max(res[temp - 1], array[top]);
    }
    for (int i = size - 2; i >= 0; i--)
    {
        if(res[i] < res[i+1]){
            res[i] = res[i+1];
        }
    }
    return res;
    }
int main() {

        int n;
        cin >> n;
        int a[n];
        for (int i = 0; i < n; i++) cin >> a[i];
        vector <int> res = maxOfMin(a, n);
        for (int i : res) cout << i << " ";
        cout << endl;
    return 0;
}