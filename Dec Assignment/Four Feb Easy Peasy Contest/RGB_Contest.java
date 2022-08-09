import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long count = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; i * j <= n; j++) {
                count += n - i * j;
            }                    
        }
        System.out.println(count);
	}
}