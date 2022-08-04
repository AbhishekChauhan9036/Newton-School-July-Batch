/* Author = Chauhan Abhishek */
/* Codechef Id = https://www.codechef.com/users/abhishekchauha */
/* Codeforces Id = https://codeforces.com/profile/abhishekchauhan903 */
/* Newton School Id = https://my.newtonschool.co/user/abhishekchauhan9036/ */
/* GitHub Id = https://github.com/AbhishekChauhan9036 */
/* Language = JAVA */
/* Address = Ballia,UP,INDIA (221716)*/

/******************************************************************************************************************************************/
/***********Start****************/
import java.io.*; 
import java.util.*; 
class Main {
	public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long a[]=new long[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextLong();
		}

		long sum=0;
		for(int i=1;i<=n;i++){
			sum+=((n-i)^a[i-1]);
		}

		System.out.print(sum);
	}
}
/******************************************************************************************************************************************/
/***********End****************/