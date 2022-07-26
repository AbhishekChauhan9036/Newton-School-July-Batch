/* Author = Chauhan Abhishek */
/* Codechef Id = abhishekchauha */
/* Codeforces Id = abhishekchauhan903 */
/* GitHub Id = AbhishekChauhan9036 */
/* Language = JAVA */
/* Address = Ballia,UP,INDIA (221716)*/

/******************************************************************************************************************************************/
/***********Start****************/
import java.util.*;
import java.io.*;
class Main {
	public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		int s=sc.nextInt();
        int nobita=0;
		if(c>s){
            nobita=c-s;
        }else{
            nobita=s-c;
        }
		System.out.println(nobita);
	}
}
/******************************************************************************************************************************************/
/***********End****************/