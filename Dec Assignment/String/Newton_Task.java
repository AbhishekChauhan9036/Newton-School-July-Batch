import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
       Scanner sc=new Scanner(System.in);
	   long n=sc.nextLong();

	   int arr[]={1,1,1,1,1,1};
	   long min=1;

	   int z=0;
	   while(min<n){
		   min=(min/(arr[z]))*(arr[z]+1);
		   arr[z]+=1;
		   z++;
		   if(z==6){
			   z=0;
		   }


	   }

	   long sum=0;
	   for(int i=0;i<arr.length;i++){
		   sum+=arr[i];
	   }

	   System.out.print(sum);
	}
}