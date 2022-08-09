import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long arr[]=new long[n];
		int count=0;
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}

		for(int i=1;i<=n;i++){
			if((i%2!=0 && arr[i-1]%2!=0)|| (i%2==0 && arr[i-1]%2==0)){
				count++;
			}
		}
		System.out.print(count);
	}
}