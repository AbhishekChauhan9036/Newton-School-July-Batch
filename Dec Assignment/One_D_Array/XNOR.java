import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long a[]=new long[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextLong();
		}

		long sum=0;
		for(int i=1;i<=n;i++){
			sum+=((n-i)^a[i-1]);
		}

		System.out.print(sum);
	}
}