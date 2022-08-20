
import java.util.Scanner;
public class Main{
       public static void InsertionSort(int arr[]) {
        // Time Complexity=o(n^2)
		int n=arr.length;
        for(int i=1;i<n;i++){
		    int b = i-1;
		    int key = arr[i];
		    while(b>=0 && arr[b]>key)  arr[b+1] = arr[b--];
		    arr[b+1] = key;
		}

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=1;

		for(int p=0;p<t;p++){
			int n=sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			
		}
		InsertionSort(arr);
        
		}
        

		
        // this code contributed by Abhishek Chauhan
    }
}