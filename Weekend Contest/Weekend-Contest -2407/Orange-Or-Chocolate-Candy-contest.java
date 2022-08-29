import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main { 
    // Driver Code 
    
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        int[] chocolate = new int[A];
        int[] orange = new int[B];
        int[] unknown = new int[C];
        int[] test = new int[X+Y];
        
        for (int i = 0; i < A; i++) {
            chocolate[i] = sc.nextInt();
        }
        
        for (int i = 0; i < B; i++) {
            orange[i] = sc.nextInt();
        }
        
        for (int i = 0; i < C; i++) {
            unknown[i] = sc.nextInt();
        }
        //Sorting all arrays
        Arrays.sort(chocolate);
        Arrays.sort(orange);
        Arrays.sort(unknown);
        Arrays.sort(test);
        int ptr=0;
        
        for (ptr = 0; ptr < X; ptr++) {
            test[ptr] = chocolate[A-1-ptr];
        }
        
        int ptr1=0;
        
        for (int i = ptr; i < ptr+Y; i++) {
            test[i] = orange[B-1-ptr1];
            ptr1++;
        }
        
        Arrays.sort(test);
        
    long sum=0l;
        int ptr2=unknown.length-1;
        int ptr3=test.length-1;
        for (int i = 0; i < (X+Y); i++) {
            if (test[ptr3] > unknown[ptr2]) {
                sum += test[ptr3];
                ptr3--;
            }
            else{
                sum += unknown[ptr2];
                ptr2--;
            }
        }
            System.out.println(sum);
        }
    }