import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
// don't change the name of this class
// you can add inner classes if needed
class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[]= new int[n];
    for(int i = 0; i < n; i++){
      arr[i] = sc.nextInt();
    }
    int  j =0;
    long maxHappiness = 0;
      Arrays.sort(arr);
      int x=n/4;
      int i=1;
      while(x>0)
      {
        maxHappiness+=arr[n-i*3];
        i++;
        x--;
      }
    System.out.print(maxHappiness);
  }
  }