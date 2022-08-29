import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

	public static long BhagwatGeeta(long n){
		long myyanswer=0;
			for(long i=0;i<=n;i++){
				for(long j=0;j<=n;j++){
					long x=i*i+j*j;
					if(x>n)
						break;
					
					double y=n-x;

					long p=(long)Math.sqrt(y);
					if(p*p==y)
						myyanswer+=1;
					
				}
			}
			return myyanswer;

	}
	public static void main (String[] args) {
                      // Your code here
			Scanner sc = new Scanner (System.in);
			long n = sc.nextLong();
			
			for(long i=1;i<=n;i++){
				System.out.println(BhagwatGeeta(i));
			}

			
	}
}