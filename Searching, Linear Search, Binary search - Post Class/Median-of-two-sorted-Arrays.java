import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
class Main{
static double Solve(int []ar1, int n,int []ar2, int m){
	int i = 0;
	int j = 0; 
	int  count;
	double m1 = -1, m2 = -1;

	for (count = 0; count <= (m + n)/2; count++)
	{

		m2=m1;
		if(i != n && j != m)
		{
			m1 = (ar1[i] > ar2[j]) ? ar2[j++] : ar1[i++];
		}
		else if(i < n)
		{
			m1 = ar1[i++];
		}

		else
		{
			m1 = ar2[j++];
		}
	}
	if((m + n) % 2 == 1){
		return m1;
	}
	else{
		return (m1+m2)/2;
	}
}	

public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String srr[] = br.readLine().trim().split(" ");
    int n=Integer.parseInt(srr[0]);
    int m=Integer.parseInt(srr[1]);
	int arr[]=new int[n];
    int brr[]=new int[m];

    String input1[] = br.readLine().trim().split(" ");
    for(int i=0;i<n;i++){
        arr[i]=Integer.parseInt(input1[i]);
    }

    String input2[] = br.readLine().trim().split(" ");
    for(int i=0;i<m;i++){
        brr[i]=Integer.parseInt(input2[i]);
    }
	System.out.printf("%.2f",Solve(arr, n,brr, m));
}
}