import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	static long countIndices(long[] arr, int n, long k) {
		long ans = 0;
		Arrays.sort(arr);
		
		int l=0, r=n-1;
		while( l< r) {
			long mean = (arr[l] + arr[r]) / 2;
			if(mean >= k) {
				ans += (r-l);
				r--;
			} else {
				l++;
			}
		}
		return ans;
	}

	public static void main (String[] args) {
		// Your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();

		long[] arr = new long[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextLong();
		}

		long res = countIndices(arr, n, k);
		System.out.println(res);
	}
}