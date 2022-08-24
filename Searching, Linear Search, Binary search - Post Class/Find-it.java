
import java.io.*; // for handling input/output...
import java.util.*; // contains Collections framework..

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static long mod=(long)1e+18;
    public static long Solve(long n){
        long ans=0;
        for(long x=1;x<=Math.sqrt(mod);x++){
            if(n==(x*x)+(3*x)){
                ans=x;
                return ans;
            }else{
                ans=-1;
            }
        }
        return ans;
    }
    public static void main (String[] args)throws IOException{
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          long n = Long.parseLong(br.readLine());
          System.out.println(Solve(n));
    }
}