import java.io.*; 
import java.util.*; 
class Main {
	public static void main (String[] args) {

			Scanner sc = new Scanner(System.in);
			int row = sc.nextInt();
			int col = sc.nextInt();
			int[][] matrix=new int[row][col];
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					matrix[i][j]=sc.nextInt();
				}
			}
			int res = maxSumCol(matrix);
			System.out.println(res);
	}
	public static int maxSumCol(int[][] mat)
	{
		int sum=0;
		for(int i=0;i<mat[0].length;i++)
			{
				int currSum = 0;
				for(int j=0;j<mat.length;j++)
				{
					currSum += mat[j][i];
				}
				if(currSum>sum)
				{
					sum=currSum;
				}
			}
		return sum;
	}
}