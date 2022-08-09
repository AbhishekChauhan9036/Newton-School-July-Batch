import java.io.*;
import java.util.*; 
class Main {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0;i<n;i++){
            if(i%2 == 0)sb.append("a");
            else sb.append("b");
        }
        String r = sb.toString();
        System.out.println(r);
	}
}