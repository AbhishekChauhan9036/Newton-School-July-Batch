import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner inputTaker = new Scanner(System.in);
        int n = inputTaker.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = inputTaker.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                Integer prevCount = map.get(arr[i]);
                map.put(arr[i], prevCount + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        for (Integer number : map.keySet()) {
            if (map.get(number) > 1) {
                System.out.println(number + " " + map.get(number));
            }
        }

    }
}