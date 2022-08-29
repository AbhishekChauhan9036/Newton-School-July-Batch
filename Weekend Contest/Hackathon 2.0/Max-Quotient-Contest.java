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
		long sum=0;
		for(int i=0;i<n;i++)
		{
		arr[i]=sc.nextInt();
		sum+=arr[i];

		}
		Arrays.sort(arr);
		long currsum=0;
		long res=0;
		for(int i=0;i<n;i++)
		{
          currsum+=arr[i];
		  res+=sum/currsum;

		}
		System.out.println(res);

	}
}