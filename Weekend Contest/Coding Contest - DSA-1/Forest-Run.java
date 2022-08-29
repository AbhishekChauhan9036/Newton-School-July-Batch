import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
  public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();
    while(t > 0){
      int n = scn.nextInt();
      int k = scn.nextInt();;
      int p = scn.nextInt();
      int[] arr = new int[n];
      for(int i = 0; i < n; i++){
        arr[i] = scn.nextInt();
      }
      int ans = furthest(arr, k, p);
      System.out.println(ans + " ");
      t--;
    }
  }

  public static int furthest(int[] arr, int b, int l) {
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        for(int i =0;i<arr.length-1;i++)
        {
            if(arr[i+1]-arr[i]<=0)
            {
                continue;
            }
            pq.add(arr[i+1]-arr[i]);
            if(pq.size()<=l)
            {
                continue;
            }
            b = b - pq.poll();
            if(b<0)
            {
                return i;
            }
        }
        return arr.length-1;
    }
}