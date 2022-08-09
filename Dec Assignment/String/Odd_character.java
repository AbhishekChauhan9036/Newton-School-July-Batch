import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
		String s=sc.next();
		for(int i=0;i<s.length();i++){
			if(i%2==0){
				System.out.print(s.charAt(i));
			}else{
				System.out.print(" ");
			}
		}
	}
}