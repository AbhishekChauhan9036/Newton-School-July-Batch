import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] str  = new String[n];
        for(int i=0;i<n;i++)
        {
            str[i]=sc.next();
        }
        int[] res = new int[9];
        for(int i=0;i<n;i++)
        {
           int j=sumdigitless10(str[i]);
           res[j-1]++;
        }
        for(int i=0;i<9;i++)
            System.out.print(res[i]+" ");
					

	}
	 static int sumdigitless10(String s)
    {   int index=-1;

        while(s.length()!=1)
        { int sum =0;
         for(int i=0;i<s.length();i++)
         {
             sum = sum + Character.getNumericValue(s.charAt(i));
         }
         s = Integer.toString(sum);

        }
        if(s.length()==1)
            index = Integer.parseInt(s);
        return index;
    }
}