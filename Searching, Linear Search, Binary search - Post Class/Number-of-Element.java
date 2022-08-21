import java.io.*;
import java.util.*;
 
public class Main {
    static int[] Solve(int[] arr, int[] brr, int N, int K) {
        Arrays.sort(arr);
        int[] result = new int[K];
        for(int i = 0; i < K; i++)
        {
            int val = binarySearch(arr, brr[i]);
            result[i] = val;
        }
        return result;
    }
 
    static int binarySearch(int[] arr, int n)
    {
        int low = 0;
        int high = arr.length - 1;
        int space = arr.length;
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            if(n< arr[mid])
            {
                space = mid;
                high = mid - 1;
            } 
            else low = mid + 1;
        }
        return arr.length - space;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        String[] input1 = br.readLine().trim().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < input1.length; i++) {
            arr[i] = Integer.parseInt(input1[i]);
        }

        int k = Integer.parseInt(br.readLine().trim());
        int[] brr = new int[k];
        for (int i = 0; i < k; i++) {
            brr[i] = Integer.parseInt(br.readLine().trim());
        }
        int[] crr = Solve(arr, brr, n, k);
        for (int i = 0; i< crr.length; i++) {
            System.out.println(crr[i]);
        }
    }
}