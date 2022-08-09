import java.io.*;
import java.util.*;

class Main {
	public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>=1){
            int l = sc.nextInt();
            int find = sc.nextInt();
            int arr [] = new int[l];

            for(int i=0; i<l; i++){
                arr[i] = sc.nextInt();
            }
            boolean isPresent = false;
            for(int i=0; i<l; i++){
                if(arr[i] == find){
                    System.out.print(i+" ");
                    isPresent = true;
                }
            }
            if(!isPresent){
                System.out.print("Not found");
            }
            System.out.println();
            n--;
        }
	}
}