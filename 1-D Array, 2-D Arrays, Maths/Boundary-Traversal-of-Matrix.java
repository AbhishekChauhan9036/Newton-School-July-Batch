import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int k = 0; k < t; k++) {
            int m = in.nextInt();
            int n = in.nextInt();
            int[][] arr = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = in.nextInt();
                }
            }
            if (m == 1) {
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[0][i] + " ");
                }
            } else if (n == 1) {
                for (int j = 0; j < m; j++) {
                    System.out.print(arr[j][0] + " ");
                }
            } else {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[0][j] + " ");
                }
                for (int i = 1; i < m - 1; i++) {
                    System.out.print(arr[i][n - 1] + " ");
                }
                for (int j = n; j > 0; j--) {
                    System.out.print(arr[m - 1][j - 1] + " ");
                }
                for (int i = m - 1; i > 1; i--) {
                    System.out.print(arr[i - 1][0] + " ");
                }
            }
            System.out.println();
        }
    }
}