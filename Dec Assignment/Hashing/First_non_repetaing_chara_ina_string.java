import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    // static final int NO_OF_CHARS = 256;
    // static char count[] = new char[NO_OF_CHARS];
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String non = sc.nextLine();

        Map<Character, Integer> m = new HashMap<Character, Integer>();

        for (int i = 0; i < non.length(); i++) {
            if (m.get(non.charAt(i)) != null) {
                m.put(non.charAt(i), m.get(non.charAt(i)) + 1);
            } else {
                m.put(non.charAt(i), 1);
            }
        }

        for (int i = 0; i < non.length(); i++) {

            if (m.get(non.charAt(i)) == 1) {
                System.out.println(i);
                break;
            } else {
                if (i == non.length() - 1) {
                    System.out.println("-1");
                }
            }
        }
    }
}