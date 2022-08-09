#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;

int main() {

	// Your code here
	int n;
	cin>>n;
	vector<vector<int> > v(n,vector<int>(3,0));
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<3;j++)
		{
			cin>>v[i][j];
		}
	}
	vector<int> visited(2001,0);
	sort(v.begin(),v.end());
	for(int i=n-1;i>=0;i--)
	{
		int x=v[i][0],y=v[i][1],z=v[i][2];
		int count=0;
		for(int j=x;j<=y;j++)
		{
			if(visited[j]==1)
				count++;
		}
		if(count<z)
		{
			for(int j=x;j<=y;j++)
			{
				if(visited[j]==0)
				{
					visited[j]=1;
					count++;
					if(count==z)
						break;
				}
			}
		}
	}
	int z=0;
	for(int i=0;i<=2000;i++)
	{
		if(visited[i]==1)
			z++;
	}
	cout<<z<<endl;
	return 0;
}