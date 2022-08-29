import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static void xorPairCount(int arr[], int n, int x) {
        int result = 0;
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int curr_xor = x ^ arr[i];
            if (m.containsKey(curr_xor)) {
                result += m.get(curr_xor);
            }
            if (m.containsKey(arr[i])) {
                m.put(arr[i], m.get(arr[i]) + 1);
            } else {
                m.put(arr[i], 1);
            }

        }
        // return result;
        if (result > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t >= 1) {
            int len = sc.nextInt();
            int x = sc.nextInt();
            int[] arr = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = sc.nextInt();
            }
            // System.out.println(xorPairCount(arr, len, x));
            xorPairCount(arr, len, x);
            t--;
        }
    }
}