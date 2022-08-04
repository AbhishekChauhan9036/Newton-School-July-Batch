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
                      int arr[]=new int[n];
                      int start=arr[0];
                      int newArr[]=new int[n];
                        long  sum=0;
                      for(int i=0;i<arr.length;i++)
                      {   
                          arr[i]=sc.nextInt();
                           sum+=arr[i];
                          if(arr[i]>start){
                              newArr[i]=0;
                              start=arr[i];
                              
                          }else{
                              newArr[i]=start-arr[i];
                              sum+=newArr[i];
                          }

                      }
                      for(int i=0;i<arr.length;i++)
                      {   
                          System.out.print(newArr[i]+" ");
                      }
                      System.out.println();
                    System.out.print(sum);
	}
}

/******************************************************************************************************************************************/
/***********End****************/