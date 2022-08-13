import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int l = 2;
        int matrix[][] = new int[l][l];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int x, y, f;
        x = matrix[0][0] * matrix[1][1];
        y = matrix[0][1] * matrix[1][0];
        f = x - y;
        System.out.println(f);
    }
}