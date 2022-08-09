import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        StringBuffer s1 = new StringBuffer(sc.next());
        StringBuffer s2 = new StringBuffer(sc.next());
        String s3;
        char c, d;
        int e;

        for (int i = 0; i < s1.length(); i++) {
            c = s1.charAt(i);
            for (int j = 0; j < s2.length(); j++) {
                d = s2.charAt(j);
                if (c == d) {
                    s1.deleteCharAt(i);
                    s2.deleteCharAt(j);
                    i--;
                    j--;
                    break;
                }
            }
        }

        s1 = s1.append(s2);

        e = s1.length() % 6;
        switch (e) {
            case 1:
                System.out.println("Friends");
                break;
            case 2:
                System.out.println("Love");
                break;
            case 3:
                System.out.println("Affection");
                break;
            case 4:
                System.out.println("Marriage");
                break;
            case 5:
                System.out.println("Enemy");
                break;
            case 0:
                System.out.println("Siblings");
                break;
            default:
                break;
        }
    }
}