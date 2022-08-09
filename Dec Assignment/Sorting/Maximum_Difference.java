import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
	Scanner inputTaker=new Scanner(System.in);
      int n = inputTaker.nextInt();

      int[] arr = new int[n];

      for(int i=0;i<n;i++){
        arr[i]=inputTaker.nextInt();
      }

     int[] lefMin = new int[n];
      lefMin[0]=arr[0];
      for(int i=1;i<n;i++){
        lefMin[i]=Math.min(arr[i],lefMin[i-1]); 
      }
      int[] rightMax = new int[n];
      rightMax[n-1]=arr[n-1];
      for(int i=n-2;i>=0;i--){
        rightMax[i]=Math.max(arr[i],rightMax[i+1]);
  }
      int i=0,j=0,maxDiff=-1;
      while(i<n&&j<n){
        if(lefMin[i]<rightMax[j]){
          maxDiff = Math.max(maxDiff,j -i);
          j=j+1;
        }else{
          i=i+1;
        }
      }
      System.out.println(maxDiff);
	}
}