import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long arr[] = new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Stack<Long> st = new Stack<>();
        long ans[]=new long[k]; 
        boolean f=true;
        for(int i=0;i<n;i++){
            if(st.isEmpty()==true){
                st.push(arr[i]);
                f=false;
            }
            while(st.isEmpty()==false && arr[i]<st.peek() && (st.size()-1+n-i)>=k){
                st.pop();
            }
            if(st.isEmpty()==true || st.size()<k){
                if(f==true){
                    st.push(arr[i]);
                }  
                else{
                    f=true; 
                }    
            }
        } 
        int j=0;
        while(st.isEmpty()==false){
            ans[j]=st.pop();
            j++;
        } 
        for(int i=k-1;i>=0;i--){
            System.out.print(ans[i]+" ");
        }                    // Your code here
	}
}