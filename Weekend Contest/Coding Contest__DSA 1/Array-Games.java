import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static int longestSubarray(int[] nums, int limit) {
    int N = nums.length; 
    int res = 0;
    
    PriorityQueue<Integer> pq1 = new PriorityQueue<>();
    
    PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
    
    int l=0;
    int r=0;
    
    pq1.add(nums[0]);
    pq2.add(nums[0]);
    
    while(l<N && r<N) {
        if(pq2.peek() - pq1.peek() <= limit) {
            res = Math.max(res, r-l+1);
            r++;
            
            if(r==N) break;
            
            pq1.add(nums[r]);
            pq2.add(nums[r]);
            
        } else {
            pq1.remove(nums[l]);
            pq2.remove(nums[l]);
            l++;
        }
    }
    
    return res;
}   
	public static void main (String[] args) {
                      // Your code here
					  Scanner sc=new Scanner(System.in);
					  int n=sc.nextInt();
					  int k=sc.nextInt();
					  int [] arr=new int [n];
					  for(int i=0;i<n;i++){
						  arr[i]=sc.nextInt();
					  }
					  System.out.println(longestSubarray(arr,k));
	}
}