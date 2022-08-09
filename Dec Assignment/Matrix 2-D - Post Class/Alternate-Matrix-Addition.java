import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) throws IOException {
        // Your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int arr[][] = new int[N][N];

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {

                arr[i][j] = Integer.parseInt(input[j]);
            }
        }
        long blackSum = 0;
        long whiteSum = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                if ((i + j) % 2 == 0) {

                    blackSum = blackSum + arr[i][j];
                } else {
                    whiteSum = whiteSum + arr[i][j];
                }
            }
        }
        System.out.println(blackSum);
        System.out.print(whiteSum);
    }
}