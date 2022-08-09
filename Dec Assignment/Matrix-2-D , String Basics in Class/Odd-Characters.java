import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int l = str.length();

        for (int i = 0; i < l; i++) {
            if (i % 2 == 0) {
                char ch = str.charAt(i);
                System.out.print(ch + " ");
            }
        }
    }
}