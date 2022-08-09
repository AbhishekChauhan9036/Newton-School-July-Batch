import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

/**
 * sortArrayOfArray
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        long arr1[]= new long[N];
        long arr2[]= new long[N];
        for(int i =0;i<N;i++){
            arr1[i] = s.nextLong();
            arr2[i] = s.nextLong();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int mid = (int)(Math.ceil((double)(N / 2.0) - 1));

        System.out.print(arr1[mid] + " " + arr2[mid]);
        }
    
}