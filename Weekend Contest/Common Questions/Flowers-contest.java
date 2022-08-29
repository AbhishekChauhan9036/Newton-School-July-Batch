import java.io.*; // for handling input/output..
import java.util.*; // contains Collections framework..

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int  min,s=0,n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]%2==0)
            a[i]=a[i]-1;
            s+=a[i];
        }
        min=a[0];
        for(int i=1;i<n;i++)
            if(a[i]<min)
            min=a[i];

    if(n%2==0){
        System.out.printf("%d",s-min);
    }
     else
        {
        System.out.printf("%d",s);
     }
 }
}