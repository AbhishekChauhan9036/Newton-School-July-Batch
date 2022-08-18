import java.io.*; // for handling input/output..
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int arr[][] = new int[n][n];
        int brr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
                brr[j][i] = arr[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(brr[i][j] + " ");
            }
            System.out.println();
        }
    }
}