import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Ai[] = new int[n];
        int Bi[] = new int[n];
        for(int i = 0;i<n;i++){
            Ai[i] = sc.nextInt();
            Bi[i] = sc.nextInt();
        }
        int maxIndex = -1;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            if(max<Ai[i]){
                max = Ai[i];
                maxIndex = i;
            }
        }
        System.out.println(max+Bi[maxIndex]);
	}
}