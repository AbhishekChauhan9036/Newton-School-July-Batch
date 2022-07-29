
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
        Scanner inputTaker = new Scanner(System.in);
        String inputString = inputTaker.nextLine();
        char player1 = inputString.charAt(0);
        char player2 = inputString.charAt(2);

        if(player1 == 'R' || player2 == 'R'){
            System.out.println("R");
        }else if(player1 == 'J' || player2 == 'J'){
            
            if(player1 == 'J'){
                System.out.println(player2);
            }else{
                System.out.println(player1);
            }

        }else{
            System.out.println("D");
        }
    }
}
/******************************************************************************************************************************************/
/***********End****************/