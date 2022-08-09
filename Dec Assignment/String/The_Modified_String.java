import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static long modifyString(String s){
		int n=s.length();
		int count=0;

		for(int i=0;i<n-2;i++){
			int j=i+1;
			int k=i+2;
			if(s.charAt(i)==s.charAt(j) && s.charAt(i)==s.charAt(k)){
				count++;
				i++;
			}
		}
		return count;
	}
	public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();

		while(t-->0){
			String s=sc.next();
			long p=modifyString(s);
			System.out.println(p);
		}
	}
}