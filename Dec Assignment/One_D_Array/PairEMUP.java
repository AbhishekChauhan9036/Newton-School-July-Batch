import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here

		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int maxi = -1;
		for(int i=0; i<n; i++) {
			int cur = a[i] + a[n-i-1];
			if(maxi<cur)
				maxi = cur;
		}
		System.out.println(maxi);
	}
}