import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static int loneSum(int n)
	{
		if(n==0)
		return 0;
		return (n%9==0)?9:n%9;
	}
	public static int calculateLoneSum(String s){
		int n=s.length();
		int x=0;
		for(int i=0;i<n;i++)
		{
			char ch=s.charAt(i);
			x+=Character.getNumericValue(ch);
		}
		return loneSum(x);
		

	
}
	public static void main (String[] args) {
                
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] arr=new String[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.next();
			
		}
		
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<n;i++)
		{
         int x=calculateLoneSum(arr[i]);
		
		 if(map.containsKey(x))
		 {
			 map.put(x,map.get(x)+1);
		 }
		 else
		 {
			 map.put(x,1);
		 }
		}
		for(int i=1;i<10;i++)
		{
			if(map.containsKey(i))
			{
				System.out.print(map.get(i)+" ");
			}
			else{
				System.out.print(0+" ");
			}
		}
		
	}
}