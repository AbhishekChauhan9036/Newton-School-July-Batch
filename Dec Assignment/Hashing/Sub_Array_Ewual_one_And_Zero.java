import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    private static long SubarrayEqual(long arr[], int n) {

        Map<Integer, Integer> um = new HashMap<>();
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += (arr[i] == 0) ? -1 : arr[i];
            um.put(curr_sum, um.get(curr_sum) == null ? 1 : um.get(curr_sum) + 1);
        }
        long count = 0;
        for (Map.Entry<Integer, Integer> itr : um.entrySet()) {
            if (itr.getValue() > 1) {
                count += ((itr.getValue() * (itr.getValue() - 1)) / 2);
            }
        }
        if (um.containsKey(0)) {
            count += um.get(0);
        }
        return count;
    }

    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int l = (int) n;
        long[] arr = new long[l];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(SubarrayEqual(arr, l));
    }
}