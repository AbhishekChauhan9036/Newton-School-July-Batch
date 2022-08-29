import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
					  Scanner sc = new Scanner(System.in);
					  int n = sc.nextInt();
					  long[] x = new long[n];
					  long[] y = new long[n];
					  for(int i=0; i<n; i++){
                      long x1 = sc.nextInt();
					  long y1 = sc.nextInt();
					  x[i] = x1;
					  y[i] = y1; 
						
					  //  Math. abs(x)
					  }
					  long MST = 0;
					  for(int i=0; i<n-1; i++){
                          long dist_X = Math.abs( x[i+1]-x[i]);
						  long dist_Y = Math.abs (y[i+1]-y[i]);
						  long d = Math.min(dist_X, dist_Y);
						 MST += d;
						 
					  }
					  System.out.print(MST);
	}
}