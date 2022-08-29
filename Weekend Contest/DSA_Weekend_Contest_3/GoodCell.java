import java.io.*; 
import java.util.*; 
class Main {
	public static void main (String[] args) {

			Scanner sc = new Scanner(System.in);
			int n=sc.nextInt();
			int m=sc.nextInt();
			int[][]a=new int[n][m];
			for(int i=0;i<n;i++)
			{	
				for(int j=0;j<m;j++)
				{
					a[i][j]=sc.nextInt();
				}
			}
			int count=0;
			for(int i=1;i<n-1;i++)
			{
				for(int j=1;j<m-1;j++)
				{
					if(a[i-1][j]==1 && a[i][j-1]==1 && a[i+1][j]==1 && a[i][j+1]==1)
					{
						count++;
					}
				}
			}
			System.out.print(count);
	}
}