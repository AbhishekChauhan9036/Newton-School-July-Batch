import java.util.*;
import java.lang.*;
import java.io.*;
class Main {
	public static void main(String[] args) throws IOException
	{
	    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Compute obj = new Compute();
            obj.Rearrange(a, n);
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<n;i++)
                output.append(a[i]+" ");
            System.out.println(output);
            
	}
}
class Compute {
    
     public void Rearrange(long a[], long n)
   {
       long temp[] = new long[a.length];
       int countOfNegEle = 0;
       int leftIndex = 0;
       
       for(long a1:a){
           
           if(a1<0){
               countOfNegEle++;
           }
       }
       
       
       for(long ele:a) {
           
           if(ele<0) {
               
               temp[leftIndex++] = ele;
           } else {
               
               temp[countOfNegEle++] = ele;
           }
           
       }
       
       for(int i=0; i<n; i++) {
           
           a[i] = temp[i];
           
       }
       
   }
}