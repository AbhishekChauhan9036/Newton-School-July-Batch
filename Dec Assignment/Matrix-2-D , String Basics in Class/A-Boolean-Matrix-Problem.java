import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int row = sc.nextInt();
            int col = sc.nextInt();
            int arr[][] = new int[row][col];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (arr[i][j] == 1) {
                        for (int x = 0; x < 1; x++) {
                            for (int y = 0; y < col; y++) {
                                System.out.print("1 ");
                            }
                        }
                        System.out.println();
                    } else {
                        System.out.print("0 ");
                    }
                    break;
                }

            }
            t--;
        }
    }
}