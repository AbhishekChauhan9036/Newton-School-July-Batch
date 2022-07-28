/* Author = Chauhan Abhishek */
/* Codechef Id = abhishekchauha */
/* Codeforces Id = abhishekchauhan903 */
/* GitHub Id = AbhishekChauhan9036 */
/* Language = JAVA */
/* Address = Ballia,UP,INDIA (221716)*/

/******************************************************************************************************************************************/
/***********Start****************/
import java.util.Scanner;
class Main {
   public static void main (String[] args)
   {

       Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();
       LeapYear(n);
}
static void LeapYear(int n){
     int p=0;
    if(n%400==0){
        p=1;
    }else if(n%100==0){
        p=0;
    }else if(n%4==0){
        p=1;
    }else{
        p=0;
    }

    if(p==1){
        System.out.print("YES");
    }else{
        System.out.print("NO");
    }
}
}
/******************************************************************************************************************************************/
/***********End****************/