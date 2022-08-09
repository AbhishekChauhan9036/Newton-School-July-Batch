import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
        System.out.println(maxProductPalindrome(s));
    }
    public static long maxProductPalindrome(String s) {
        int n = s.length();
        if (n == 2) return 1;
        int[] len = CheckString(s);
        long left[] = new long[n];
        int max = 1;
        left[0] = max;
        for (int i = 1; i <= n - 1; i++) {
            if (len[(i - max - 1 + i)/2] > max) max += 2;
            left[i] = max;
         
        }
        max = 1;
        long[] right = new long[n];
        right[n - 1] = max;

        for (int i = n - 2; i >= 0; i--) {
            if (len[(i + max + 1 + i)/2] > max) max += 2;
            right[i] = max;
        }

        long res = 1;

        for (int i = 1; i < n; i++) {
            res = Math.max(res, left[i - 1] * right[i]);
        }
        return res;
    }
    private static int[] CheckString(String s) {

        int m = s.length();
        int[] New = new int[m];
        int c = 0;
        int r = 0;
        int z = 0;

        for(int i = 0; i < m; i++) {
            int duplicate = (2 * c) - i;
            if(i < r) {
                New[i] = Math.min(r - i, New[duplicate]);
            }
            int a = i + (1 + New[i]);
            
            int b = i - (1 + New[i]);
            while(a < m && b >= 0 && s.charAt(a) == s.charAt(b)) {
                New[i]++;
                a++;
                b--;
        
            }
            if(i + New[i] > r) {
                c = i;
                r = i + New[i];
            }
        }
        for (int i = 0; i < m; i++){
            New[i] = 1 + 2*New[i];
        }
        return New;
    }
}