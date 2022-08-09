import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        int[][] pascal = new int[k+1][k+1];
        for(int i=0;i<=k;i++){
            for(int j=0;j<=i;j++){
                if(j==0){
                    pascal[i][j] = 1;
                }
                else{
                    pascal[i][j] = (pascal[i-1][j]%1000000007 + pascal[i-1][j-1]%1000000007)%1000000007;
                }
            }
        }
        for(int j=0;j<=k;j++)
            System.out.print(pascal[k][j]+" ");
	}
}