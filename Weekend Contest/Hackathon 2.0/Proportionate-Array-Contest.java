import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[4];
		for(int i=0;i<4;i++)
		arr[i]=sc.nextInt();
		Arrays.sort(arr);
		if((double)arr[0]/arr[2]==(double)arr[1]/arr[3])
		System.out.println("YES");
		else
		System.out.println("NO");

	}
}