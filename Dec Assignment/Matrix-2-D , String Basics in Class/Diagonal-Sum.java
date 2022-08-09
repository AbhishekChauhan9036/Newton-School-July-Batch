import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int sumOfDiagonal1 = 0;
        for (int i = 0, j = 0; i < n && j < n; i++, j++) {
            sumOfDiagonal1 = sumOfDiagonal1 + arr[i][j];
        }
        int sumOfDiagonal2 = 0;
        for (int i = 0, j = n - 1; i < n && j >= 0; i++, j--) {
            sumOfDiagonal2 = sumOfDiagonal2 + arr[i][j];

        }
        System.out.print(sumOfDiagonal1 + " " + sumOfDiagonal2);
    }
}