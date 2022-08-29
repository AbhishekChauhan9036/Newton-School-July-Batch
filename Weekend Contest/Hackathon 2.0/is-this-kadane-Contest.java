import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str1 = br.readLine();
        String[] str2 = str1.split(" ");
        int[] arr = new int[n];
        for(int i = 0; i < n; ++i) {
            arr[i] = Integer.parseInt(str2[i]);
        }
        int ans = 0;
        for(int i=30; i>=1; i--){
        ans = Math.max(ans, kadane(arr)-i);
        play(arr,i);
    }
    System.out.print(ans);
	}
    
    static int kadane(int[] arr){
    int mx = 0;
    int cur = 0;
    for(int i = 0; i < arr.length; ++i){
        cur += arr[i];
        mx = Math.max(mx, cur);
        if(cur < 0)
            cur = 0;
    }
    return mx;
}
    static void play(int[] arr,int x){
    for(int i = 0; i < arr.length; ++i){
        if(arr[i]==x){
            arr[i]=-1000000000;
        }
    }
}
}