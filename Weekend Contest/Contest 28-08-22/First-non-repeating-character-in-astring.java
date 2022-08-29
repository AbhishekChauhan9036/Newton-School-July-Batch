import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        int ans= nonRepeat(str);
        System.out.println(ans);
        }
        static int nonRepeat(String str){
            int arr[]=new int[256];
            for(int i=0;i<256;i++){
                arr[i]=-1;
            }
            for(int i=0;i<str.length();i++){
                if(arr[str.charAt(i)]==-1){
                    arr[str.charAt(i)]=i;
                }else{
                    arr[str.charAt(i)]=-2;
                }
            }
            int res=Integer.MAX_VALUE;
            for(int i=0;i<256;i++){
                if(arr[i]>=0){
                    res=Math.min(res,arr[i]);
                }
            }
            if(res== Integer.MAX_VALUE)
            return -1;
            else
            return res;
        }
    }