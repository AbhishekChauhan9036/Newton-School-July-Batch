import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc= new Scanner(System.in);
                      int t=sc.nextInt();
        for(int i=0; i<t; i++){
            int n=sc.nextInt();
            int sum=sc.nextInt();
            int arr[]=new int[n];
            for(int j=0; j<n; j++){
                arr[j]=sc.nextInt();
            }
            if(getPair(arr,n,sum)){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
    }

    public static boolean getPair(int arr[],int n,int sum){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<n-1; i++){
            map.put(arr[i],i);
        }
        for(int i=0;i<n-1;i++){
            int digit=arr[i];
            int rem=sum-digit;
            if(map.containsKey(rem)){
                return true;
            }
        }
        return false;
    }
}