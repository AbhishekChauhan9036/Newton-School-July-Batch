import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);

        int k=sc.nextInt();
        String s,ss;
        s=sc.next();ss=sc.next();
        int c=0,n=0;
    for(int i=0;i<s.length();i++){
       if(s.charAt(i)!=ss.charAt(i))
       n++;
       else
       c++;
   }
   if(k==c)
   System.out.print(s.length());
   else if(c>k){
       System.out.print(k+n);
   }
   else{
      System.out.print((c+(n-(k-c))));
   }
}
}