import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
    Scanner sc =new Scanner(System.in);
    int t=sc.nextInt();
    while(t>0){
    int n =sc.nextInt();
    int m=sc.nextInt();
    int pt =1+(2*(m-1));
    int ptAllRow=(n-1)*pt;
    int totalPt=(m-1)+ptAllRow;
    System.out.println(totalPt);
    t--;}
    }
}