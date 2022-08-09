import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
              
			  Scanner inputTaker = new Scanner(System.in);
			  int u = inputTaker.nextInt();
			  while(u>0){
				  int n= inputTaker.nextInt();
				  int count=0;
				  for(int x= 1; x<=Math.sqrt(n); x++){
					   
					if(n%x== 0){

						if(x%2 == 0){
							count++;
						}
						if(x*x != n){
							if((n/x)%2== 0) {
								count++;
							}
						}
					}
			   }
			   System.out.println(count);
			   u--;
			  }
	}
}