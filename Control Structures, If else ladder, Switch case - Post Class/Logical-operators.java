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
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();
        int b = x.nextInt();
        if (a<=10 && b>=10){
            System.out.print("true ");
        }
        else{
            System.out.print("false ");
        }
        if (a%2==0 || b%2==0){
            System.out.print("true ");
        }
        else{
            System.out.print("false ");
        }
        if (a==b){
            System.out.print("false ");
        }
        else{
            System.out.print ("true ");
        }
    }
}
/******************************************************************************************************************************************/
/***********End****************/