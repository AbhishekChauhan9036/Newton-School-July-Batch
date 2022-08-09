import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner inputTaker = new Scanner(System.in);
        int row = inputTaker.nextInt();
        int coloumn = inputTaker.nextInt();
        int[][] metric = new int[row][coloumn];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < coloumn; j++) {
                metric[i][j] = inputTaker.nextInt();
            }
        }

        for (int j = 0; j < row; j++) {
            for (int i = j; i >= 0; i--) {
                if ((j - i) >= coloumn) {
                    break;

                }
                System.out.print(metric[i][j - i] + " ");
            }
            System.out.println("");
        }

        for (int j = 1; j < coloumn; j++) {
            for (int i = row - 1; i >= 0; i--) {
                if ((j + row - 1 - i) >= coloumn) {
                    break;
                }
                System.out.print(metric[i][j + (row - 1 - i)] + " ");
            }
            System.out.println("");
        }

    }
}