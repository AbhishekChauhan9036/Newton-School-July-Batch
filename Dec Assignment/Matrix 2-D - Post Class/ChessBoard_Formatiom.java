import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();

		while(TC>0)
		{
			int n = sc.nextInt();
			int a[][] = new int[n][n];

			for(int i = 0;i<n;i++)
			{
				for(int j = 0;j<n;j++)
				{
					a[i][j] = sc.nextInt();
				}
			}

			System.out.println(Chess(a));

			TC--;
		}
	}

	public  static int Chess(int b[][]) 
	{
        int N = b.length, rowSum = 0, colSum = 0, rowSwap = 0, colSwap = 0;

        for (int i = 0; i < N; ++i) 
		{	
			for (int j = 0; j < N; ++j)
            	
				if ((b[0][0] ^ b[i][0] ^ b[0][j] ^ b[i][j]) == 1) 
					return -1;
		}

		for (int i = 0; i < N; ++i) 
		{
            rowSum += b[0][i];
            
			colSum += b[i][0];
            
			if (b[i][0] == i % 2) 
				rowSwap++;
            
			if (b[0][i] == i % 2) 
				colSwap++;
        }
        if (rowSum != N/2 && rowSum != (N+1)/2) 
			return -1;
        
		if (colSum != N/2 && colSum != (N+1)/2) 
			return -1;
        
		if (N % 2 == 1) 
		{
            if (colSwap % 2 == 1) 
				colSwap = N - colSwap;
            
			if (rowSwap % 2 == 1) 
				rowSwap = N - rowSwap;
        } 
		else 
		{
            colSwap = Math.min(N-colSwap, colSwap);
            
			rowSwap = Math.min(N-rowSwap, rowSwap);
        }

        return (colSwap + rowSwap) / 2;
    }
}