import java.util.*; 
class Main {
	public static void main (String[] args) {
		 Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char arr[]=str.toCharArray();
		boolean  t=(str.contains("r")&&str.contains("e"));
		if(t&&str.contains("d"))
			System.out.print("Yes");
		else
			System.out.print("No");		   
	}
}