import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
	public static void main (String[] args) {

	int n;
    Scanner sc = new Scanner(System.in);

    n = sc.nextInt();
    int arr[]=new int[n];
  
    for(int i =1 ;i<arr.length ; i++){
        arr[i] = sc.nextInt();
    }
    int sum1 =0;
    for(int i=1 ; i< arr.length; i++){
        sum1=sum1+arr[i];
    }
    int sum2=0;
    for(int i= 1 ; i<=n ;i++){
        sum2= sum2+i;

    }
    System.out.println(sum2-sum1);

	}
}