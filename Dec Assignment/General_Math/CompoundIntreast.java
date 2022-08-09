import java.io.*; 
import java.util.*;
class Main {
	public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
		double principle, rate, time ;
    	principle=sc.nextDouble();
		rate=sc.nextDouble();
		time=sc.nextDouble();
	
		double A = principle * (Math.pow((1 + rate / 100), time));
		double CI = A- principle;

	System.out.printf("%.2f",CI);
	}
}