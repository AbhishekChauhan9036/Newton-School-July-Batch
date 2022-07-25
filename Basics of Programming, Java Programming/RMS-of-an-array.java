/*--------------------------------------------------------------------------------------------------------------------------*/
/* Author = Chauhan Abhishek */
/* Codechef Id = https://www.codechef.com/users/abhishekchauha */
/* Codeforces Id = https://codeforces.com/profile/abhishekchauhan903 */
/* Newton School Id = https://my.newtonschool.co/user/abhishekchauhan9036/ */
/* GitHub Id = https://github.com/AbhishekChauhan9036 */
/* Language = JAVA */
/* Address = Ballia,UP,INDIA (221716)*/
/*--------------------------------------------------------------------------------------------------------------------------*/
import java.util.*;
import java.io.*;
class Main {
	public static double Solve(int arr[],int n){
		int s=0;double m=0;double r=0;

		for(int i=0;i<n;i++){
			s+=Math.pow(arr[i],2);
		}

		m=(s/(double)(n));
		r=(double)Math.sqrt(m);

		return r;
	}
	public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		int arr[]=new int[n];

		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}

		double ans=(Solve(arr,n));
		System.out.printf("%.6f",ans);
	}
}
