///u can also use Arrays.sort(arr);
import java.util.Scanner;
public class Main {
       public static void SelectionSort(int arr[]) {
        // Time Complexity=o(n^2)
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int swap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swap;
                }
            }
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
		SelectionSort(arr);
        
		}
        

		
        // this code contributed by Abhishek Chauhan
    }
}