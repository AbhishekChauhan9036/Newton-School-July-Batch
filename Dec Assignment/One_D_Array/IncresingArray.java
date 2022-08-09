import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
         int n = sc.nextInt();
         int[] a = new int[n];

         int temp = 0;
         boolean res = true;
         for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
         }
         for (int i = 2; i < a[0]; i++) {
            if (a[0] % i == 0) {
               a[0] = i;
            }
         }
         for (int i = 0; i < n; i++) {
            for (int j = temp + 1; j < a[i]; j++) {
               if (a[i] % j == 0) {
                  a[i] = j;
               }
            }
            temp = a[i];
         }
         for (int i = 0; i < n - 1; i++) {
            if (a[i] >= a[i + 1]) {
               res = false;
               break;
            }
         }
         if (res == true) {
            System.out.print("YES");
         } else {
            System.out.print("NO");
         }
      }
   }

}