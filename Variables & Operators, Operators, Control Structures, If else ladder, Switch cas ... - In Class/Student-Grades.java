/* Author = Chauhan Abhishek */
/* Codechef Id = abhishekchauha */
/* Codeforces Id = abhishekchauhan903 */
/* GitHub Id = AbhishekChauhan9036 */
/* Language = JAVA */
/* Address = Ballia,UP,INDIA (221716)*/

/******************************************************************************************************************************************/
/***********Start****************/
import java.io.*; 
import java.util.*;
class Main {
    public static void main (String[] args) {
     Scanner sc=new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();
     int c = sc.nextInt();
     int d = sc.nextInt();
     int e = sc.nextInt();
     int total_marks = a+b+c+d+e;
     int percentage =  total_marks/5;

     if (percentage >= 80){
         System.out.println("A");
     }
     else if(percentage < 80 && percentage >= 60){
         System.out.println("B");
     }
     else if(percentage < 60 && percentage >= 40){
         System.out.println("C");
     }
     else{
         System.out.println("D");
     }
    }
}
/******************************************************************************************************************************************/
/***********End****************/