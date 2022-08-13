import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);

		int xRed=sc.nextInt();
		int yBlue=sc.nextInt();
        int min=xRed>yBlue?yBlue:xRed;
        int count=0;
     
		System.out.println(gcd(xRed,yBlue));


	}

	static int gcd(int a, int b)
	{
	if (b == 0)
    	return a;
		
    return gcd(b, a % b);
	}
}