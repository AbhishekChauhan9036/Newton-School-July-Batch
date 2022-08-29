public static void main(String[] args) {
 
     Scanner inputTaker = new Scanner(System.in);
     int n = inputTaker.nextInt();
     weirdSeries(n);
 
 }
 public static void weirdSeries(int n) {
 
     if (n < 7) {
         System.out.println("-1");
         return;
     }
 
     long res = 7;
     int count = 1;
 
     if (n == 7) {
         System.out.println("1");
     }
 
     for (long i = 10; i < 1e18; i *= 10) {
 
         res += (7 * i);
         count++;
         if ( (res % n == 0) && (n != 7) ) {
 
             System.out.println(count);
             break;
         }
     }
     if (res % n != 0)
         System.out.println("-1");
 
 }


