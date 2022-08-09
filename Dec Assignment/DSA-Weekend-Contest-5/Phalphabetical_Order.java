import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void swap(String arr[],int i,int j)
    {
        String temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        
    }
	public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Character> arr=new ArrayList<>();
        String s="eklpyqrbgjdwtcaxznsifvhmou";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            arr.add(ch);
        }
        int n=sc.nextInt();
        sc.nextLine();
        String str[]=new String[n];
        for(int i=0;i<n;i++)
        {
            str[i]=sc.nextLine();
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
               
                    int x=0,y=0;
                    if(str[j+1].equals(str[j]))
                    {
                        continue;
                    }
                    while((x<str[j].length() && y<str[j+1].length())&&
                    (arr.indexOf(str[j].charAt(x))==arr.indexOf(str[j+1].charAt(y))))
                    {
                        x++;
                        y++;
                    }
                    if(x>=str[j].length() || y>=str[j+1].length())
                    {
                    if(y>=str[j+1].length() && x<str[j].length())
                    {
                        swap(str,j,j+1);
                    }
                    }
                    else if(arr.indexOf(str[j].charAt(x))>arr.indexOf((str[j+1].charAt(y))))
                    {
                        swap(str,j,j+1);
                    }
               
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(str[i]);
        }

	}
}