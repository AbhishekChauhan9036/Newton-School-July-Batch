import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String reverse="";

		char ch;

		for(int i=0;i<str.length();i++){
			ch=str.charAt(i);
			reverse=ch+reverse;
		}

		System.out.println(reverse);
	}
}