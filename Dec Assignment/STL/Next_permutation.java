import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) arr[i] = scan.nextInt();
            nextPermutation(arr, n);
            for(int i = 0; i < n; i++){
                System.out.print(arr[i] + " ");
            }
	}

    private static void nextPermutation(int[] arr, int n){
        for(int i = n - 1; i > 0; i--){
            for(int j = i - 1; j >= 0; j--){
                if(arr[i] > arr[j]){
                    swap(arr, i, j);
                    Arrays.sort(arr, j + 1, n);
                    return;
                }
            }
        }
        Arrays.sort(arr);
    }

    

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}