import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                     Scanner s=new Scanner(System.in);
                     int n=s.nextInt();
                     int a[]=new int[n-1];
                     for(int i=0;i<n-1;i++){
                         a[i]=s.nextInt();
                     }
                     int sum=(n*(n+1))/2;
                     for(int i=0;i<n-1;i++)
                     sum=sum-a[i];
                     System.out.print(sum);

    }
}