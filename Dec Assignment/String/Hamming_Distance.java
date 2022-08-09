import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework


class Main {
static void findString(String str, int n, int k)
{
	if (k == 0) {
				System.out.println(str);;
		return;
	}

	String str2 = str;
	int p = 0;

	for (int i = 0; i < n; i++) {
	

		if (str2.charAt(i) != 'a') {

						str2 = str2.substring(0,i)+'a'+str2.substring(i+1);
			
			p++;


			if (p == k)
				break;
		}
	}

	
	if (p < k) {
		

		for (int i = n - 1; i >= 0; i--)
			if (str.charAt(i) == 'a') {
								str2 = str2.substring(0,i)+'b'+str2.substring(i+1);
				p++;
				if (p == k)
					break;
			}
	}

	System.out.println(str2);
}


public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
		String str = sc.next();
	int n = str.length();
	int k = 1;

	findString(str, n, k);

	}
}