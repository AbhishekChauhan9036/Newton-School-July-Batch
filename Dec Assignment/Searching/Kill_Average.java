import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
              Scanner scn = new Scanner(System.in);
         int n = scn.nextInt();

         String str = scn.next();

         char[] arr = str.toCharArray();

         int[] fa = new int[4];
         
         int freq = n/4;

         for(int i=0; i<n; i++){
            char ch = arr[i];
            
            if(ch == 'A'){
               fa[0] += 1;
            }else if(ch == 'T'){
               fa[1] += 1;
            }else if(ch == 'C'){
               fa[2] += 1;
            }else if(ch == 'G'){
               fa[3] += 1;
            }

         }
         
         int l = 0;
         int r = n;
         int mid = 0;

         int ans = -1;

         while(l<r){
           
           mid = (l+r)/2;

           if(check(arr,mid,fa,freq)){
              ans = mid;
              r = mid;
           }else{
              l = mid + 1;
           }
         
         }

         System.out.println(ans);

	}

   public static boolean check(char[] arr,int mid,int[] fa,int freq){

      
      int curr = 0;

      int n = arr.length;

      int i=0;
      int j = 0;

      while(j<mid){
        
        char ch = arr[j];
            if(ch == 'A'){
               fa[0] -= 1;
            }else if(ch == 'T'){
               fa[1] -= 1;
            }else if(ch == 'C'){
               fa[2] -= 1;
            }else if(ch == 'G'){
               fa[3] -= 1;
            }
         j++;   
      
      }
      
      if(fa[0] <= freq && fa[1] <= freq && fa[2] <= freq && fa[3] <= freq){
         
         while(i<j){
        
         char ch = arr[i];
            if(ch == 'A'){
               fa[0] += 1;
            }else if(ch == 'T'){
               fa[1] += 1;
            }else if(ch == 'C'){
               fa[2] += 1;
            }else if(ch == 'G'){
               fa[3] += 1;
            }
         i++;   
      
         }
         return true;
      }

      while(j<n){
         
          char ch = arr[j];
            if(ch == 'A'){
               fa[0] -= 1;
            }else if(ch == 'T'){
               fa[1] -= 1;
            }else if(ch == 'C'){
               fa[2] -= 1;
            }else if(ch == 'G'){
               fa[3] -= 1;
            }
         j++;  

           ch = arr[i];
            if(ch == 'A'){
               fa[0] += 1;
            }else if(ch == 'T'){
               fa[1] += 1;
            }else if(ch == 'C'){
               fa[2] += 1;
            }else if(ch == 'G'){
               fa[3] += 1;
            }
         i++;   
         
      if(fa[0] <= freq && fa[1] <= freq && fa[2] <= freq && fa[3] <= freq){
         
         while(i<n && i<j){
        
          ch = arr[i];
            if(ch == 'A'){
               fa[0] += 1;
            }else if(ch == 'T'){
               fa[1] += 1;
            }else if(ch == 'C'){
               fa[2] += 1;
            }else if(ch == 'G'){
               fa[3] += 1;
            }
         i++;   
      
         }
         return true;
      }


      }

      
        while(i<n){
        
         char ch = arr[i];
            if(ch == 'A'){
               fa[0] += 1;
            }else if(ch == 'T'){
               fa[1] += 1;
            }else if(ch == 'C'){
               fa[2] += 1;
            }else if(ch == 'G'){
               fa[3] += 1;
            }
         i++;   
      
         }
     
       
       return false;

	}
}