
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		 Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		long x=0;
		for(int j=arr.length-1;j>=0;j--){
         	if(k>0){
				k--;
			}else{
				break;
			}
		    x+=arr[j];
		}
		System.out.println(x);
	}
}
