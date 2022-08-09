import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static int maxLen(int arr[], int n) {

        HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();

        int sum = 0;
        int max_len = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (arr[i] == 0 && max_len == 0) {
                max_len = 1;
            }
            if (sum == 0) {
                max_len = i + 1;
            }
            Integer prev_i = hM.get(sum);
            if (prev_i != null) {
                max_len = Math.max(max_len, i - prev_i);
            } else {
                hM.put(sum, i);
            }
        }
        return max_len;
    }

    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int nn = maxLen(arr, n);
        if (nn > 0) {
            System.out.println(nn);
        } else {
            System.out.println("-1");
        }
    }
}