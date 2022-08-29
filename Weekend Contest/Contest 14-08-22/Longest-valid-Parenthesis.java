import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static int findMaxlen(String str) {
                      // Your code here

                      int n=str.length();

                      Stack<Integer> stk=new Stack<>();
                      stk.push(-1);

                      int result=0;
                      for(int i=0;i<n;i++){
                          if(str.charAt(i)=='(')
                          stk.push(i);
                          else{
                              if(!stk.empty())
                              stk.pop();

                              if(!stk.empty())
                              result=Math.max(result,i-stk.peek());

                              else
                              stk.push(i);
                            
                          }
                      }

                      return result;
    }
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        System.out.print(findMaxlen(str));
    }
}