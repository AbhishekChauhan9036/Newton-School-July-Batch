import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
	public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
		String str1;
		String str2;
		str1=sc.next();
		str2=sc.next();

		int count1[]=new int[26];
		int count2[]=new int[26];

		for(int i=0;i<str1.length();i++){
			count1[str1.charAt(i)-'a']++;
		}

		for(int i=0;i<str2.length();i++){
			count2[str2.charAt(i)-'a']++;
		}

		int sum=0;
		for(int i=0;i<26;i++){
			sum+=Math.abs(count2[i]-count1[i]);
		}

		sum=sum%6;
// If obtained value is 1, output "Friends"
// If obtained value is 2, output "Love"
// If obtained value is 3, output "Affection"
// If obtained value is 4, output "Marriage"
// If obtained value is 5, output "Enemy"
// If obtained value is 0, output "Siblings"
		switch(sum){
			case 1:
				System.out.println("Friends");
				break;

			case 2:
				System.out.println("Love");
				break;

			case 3:
				System.out.println("Affection");
				break;

			case 4:
			 	System.out.println("Marriage");
				 break;
				
			case 5:
				System.out.println("Enemy");
				break;

			case 0:
				System.out.println("Siblings");
		}
	}
}