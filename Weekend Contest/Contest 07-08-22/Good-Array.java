import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static void goodArray(int[] arr){
        int n=arr.length;
        if(n%2==1){
            System.out.print("No");
            return;
        }
        for(int i=0;i<n/2;i++){
            if(arr[i] != arr[n/2+i]){
                System.out.print("No");
                return;
            }
        }
        System.out.print("Yes");
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
            goodArray(arr);
    }
}