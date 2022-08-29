import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int m =sc.nextInt();
        int n =sc.nextInt();

        if(m%2 != 0 || n%2 != 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}