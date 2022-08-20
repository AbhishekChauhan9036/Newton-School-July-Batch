import java.io.*; 
import java.util.*; 
import java.lang.Math;
class Maximum_Force {
  static void PureCoders(long[] myarray) {
    int n = myarray.length;
    long temp = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 1; j < (n - i); j++) {
        if (Math.abs(myarray[j - 1]) < Math.abs(myarray[j])) {
          temp = myarray[j - 1];
          myarray[j - 1] = myarray[j];
          myarray[j] = temp;
        }
      }
    }
  }

	public static void main (String[] args) {
		 Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int k = sc.nextInt();
        long code = 0;
        long arr[] = new long[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
        PureCoders(arr);
        if(k > n){
          for(int i = 0; i < n; i++) {
            code += (arr[i]*arr[i]);

		      }
        }
        if(k<=n){
          for(int i = 0; i < k; i++) {
            code += (arr[i]*arr[i]);

		      }
        }
		System.out.println(code);
	
}
}