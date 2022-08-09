#include <bits/stdc++.h>
using namespace std;

int findMaxLen(string str)
{
	int n = str.length();
	stack<int> stk;
	stk.push(-1);
	int result = 0;

	for (int i = 0; i < n; i++)
	{
		if (str[i] == '(')
			stk.push(i);
		

		else
		{

			if (!stk.empty())
			{
				stk.pop();
			}
			

			if (!stk.empty())
				result = max(result, i - stk.top());

			else
				stk.push(i);
		}
	}

	return result;
}
int main()
{
	string str;
	cin>>str;
	cout << findMaxLen(str) << endl;


	return 0;
}