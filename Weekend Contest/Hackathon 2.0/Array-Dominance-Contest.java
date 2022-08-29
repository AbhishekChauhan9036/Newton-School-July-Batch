import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
					  PriorityQueue<Long> minHeap = new PriorityQueue<>();
					  Scanner sc = new Scanner(System.in);
					  int n = sc.nextInt();
					  long sum = 0;
                for(int i=0 ;i<n; i++){
					long a = sc.nextInt();
					sum += a;
					minHeap.add(a);
				}
				int k = n/2;
				while(k>0){
                 sum -= 2*minHeap.remove();
					k--;
				}
				System.out.print(sum);
	}
}