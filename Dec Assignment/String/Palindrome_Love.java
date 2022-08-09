import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
       Scanner sc=new Scanner(System.in);
	   String str=sc.next();

	   int n=str.length();
	   char arr[]=str.toCharArray();

	   String Reverse="";

	   for(int i=0;i<n;i++){
		   Reverse=str.charAt(i)+Reverse;
	   }

	   char ReverseArray[]=Reverse.toCharArray();
	   int mon=0;

	   for(int i=0;i<n;i++){
		   if(arr[i]!=ReverseArray[i]){
			   mon++;
		   }
	   }

	   System.out.println(mon/2);
	}
}