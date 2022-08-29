import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long arr[] = new long[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextLong();
        }  

        long sum = 0;
    

        for(int i = 1; i <= n; i++) {
            sum += (n-i)^arr[i-1];

      
        }

        System.out.println(sum);



    }
}