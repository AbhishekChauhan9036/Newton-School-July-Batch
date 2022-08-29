import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int k=sc.nextInt();
            int n=sc.nextInt();
            int[] ans=new int[k];
            Arrays.fill(ans,-1);
            int arr[]=new int[n];
            for(int i=0; i<n; ++i){
                arr[i]=sc.nextInt();
                int temp=arr[i]%k;
                if(ans[temp]==-1){
                    ans[temp]=arr[i];
                }else{
                    int count=1;
                    while(count <= k && ans[temp]!=-1){
                        temp=(arr[i]+count)%k;
                        count++;
                    }
                    if(ans[temp]==-1)ans[temp]=arr[i];
                }
            }
            for(int i:ans)System.out.print(i+" ");
            System.out.println();
        }
    }
}