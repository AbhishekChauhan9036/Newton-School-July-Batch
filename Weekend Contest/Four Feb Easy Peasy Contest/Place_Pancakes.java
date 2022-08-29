import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int first = y+2*z;
        int count = 0;
        if(x>=first){
            while(x>0){
                boolean check = false;
                if(count == 0){
                    if(x>=first){
                        x = x-first;
                        count++;
                        check = true;
                    }
                }else{
                    if(x>=first-z){
                        x = x - first + z;
                        count++;
                        check = true;
                    }
                }
                if(!check)break;
            }
        }
        System.out.println(count);
	}
}