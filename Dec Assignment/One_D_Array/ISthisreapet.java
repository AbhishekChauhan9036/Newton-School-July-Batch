import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < n - 2; i++) {
                if (a[i] == a[i + 1] && a[i + 1] == a[i + 2]) {
                    System.out.print("Yes");
                    return;
                }
            }
            System.out.print("No");
        }
    }
}