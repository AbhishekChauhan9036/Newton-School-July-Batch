import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        String s = "chips";
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 0;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) != s.charAt(i%5))count++;
        }
        System.out.println(count);
    }
}