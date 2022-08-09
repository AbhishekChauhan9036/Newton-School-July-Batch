public static int calculator(char ch, int a, int b)
{
     // your code here
     switch (ch){
         case '+':
            return a+b;
         
         case '-':
            return a-b;

        case '*':
            return a*b;

        case '/':
            return a/b;
     }
     return 0;
 }