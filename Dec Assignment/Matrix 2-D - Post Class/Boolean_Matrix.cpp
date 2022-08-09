#include <bits/stdc++.h> 
using namespace std;
int32_t main() {
			int t;
			cin>>t;
			int row,col;
	
			for(int i=1;i<=t;i++)
			{
				cin>>row;
				cin>>col;
				int m[row][col];
				
				for(int k=0;k<row;k++)
				{
					for(int j=0;j<col;j++)
					{
						cin>>m[k][j];
					}
				}
				for(int k=0;k<row;k++)
				{
					for(int j=0;j<col;j++)
					{
						if(m[k][j]==1)
						{
							for(int h=0;h<col;h++)
							{
								m[k][h]=1;
							}
							break;	
						}
					}
				}	
				for(int k=0;k<row;k++)
				{
					for(int j=0;j<col;j++)
					{
						cout<<m[k][j]<<" ";
					}
					cout<<endl;
				}
			}			
	return 0;
}