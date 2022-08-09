import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
       Scanner sc=new Scanner(System.in);
	   String s=sc.nextLine();
	   int p=0;
	   for(int i=0;i<s.length();i++){
		   if(s.charAt(i)==' '){
			   p=1;
		   }
	   }

	   if(p==1){
		   System.out.println("Yes");
	   }else{
		   System.out.println("No");
	   }
	}
}