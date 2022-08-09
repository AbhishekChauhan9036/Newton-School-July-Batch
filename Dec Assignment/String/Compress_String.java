import java.util.Scanner; 
public class Main
{
 public static void main(String[] args)
 {
  Main str = new Main();
  String s1,s2; 
  Scanner in = new Scanner(System.in);

	int t=in.nextInt();

	while(t-->0){
		  s1 = in.next(); 

  s2 = s1.replaceAll("\\s","");
  str.Compression(s2);
	}
 }
 
 

public static String Compression(String s)
 {
  int count = 1;
  StringBuilder sb = new StringBuilder();

      for (int i = 1; i < s.length()-1 ; i++) 
        {
          if (s.charAt(i) == s.charAt(i - 1)) 
          {
            count++;
          } 
          else 
          {
            sb.append(s.charAt(i - 1));
            sb.append(count);
            count = 1;
          }
        }

      if (s.length() > 1)
        {
        if (s.charAt(s.length() - 1) == s.charAt(s.length() - 2))
          {
            count++;
          } 
          else 
          {
            sb.append(s.charAt(s.length() - 2));
            sb.append(count);
            count = 1;
          }
          sb.append(s.charAt(s.length() - 1));
          sb.append(count);
        }
        s = sb.toString();
        System.out.println(s);
        return s;
 }
}