import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int  N = in.nextInt();
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            nums.add(in.nextInt());
        }
        in.close();
        solve(nums, N);
    }

    private static void solve(ArrayList<Integer> nums, int N) {
        Map<Integer, Integer> freq = new TreeMap<Integer, Integer>(); //polymorphisim
        for (int i = 0; i < N; i++) {
            int key = nums.get(i);
            if (freq.containsKey(key) == false) {
                freq.put(key, 1);
            } else {
                int val = freq.get(key);
                freq.put(key, val+1);
            }
        }
        int all = 0;
        for (Integer key : freq.keySet()) {
            int val = freq.get(key);
            all += val *(val-1)/2;
        }
        int result = 0;
        for (int i = 0; i < N; i++) {
            result = all - freq.get(nums.get(i)) + 1;
            System.out.print(result + " ");
        }
        System.out.println();
    }
}