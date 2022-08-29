import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }  
  
        int count = 1;
        for(int i = 0; i < n; i++) {
            if(i != 0 && arr[i-1] == arr[i]) {
                count++;
                
            } else {
                if(count >= 3) {
                    break;
                } else {
                    count = 1;
                }
            }
        }   

        if(count >= 3) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }   
    }
}