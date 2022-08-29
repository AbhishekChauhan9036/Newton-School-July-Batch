import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
		int max_p=0;
		int min_p=Integer.MAX_VALUE;
		int c=0;
		for(int i=0;i<n-1;i++)
		{
			if((arr[i+1]-arr[i])<3)
			c++;
			else
			{
				max_p=Math.max(max_p,c+1);
				min_p=Math.min(min_p,c+1);
				c=0;
			}
		}
		max_p=Math.max(max_p,c+1);
		min_p=Math.min(min_p,c+1);
		
		System.out.println(min_p+" "+max_p);

	}
}