import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {

        // Your code here
        Scanner sc = new Scanner(System.in);
        Long n, p, k; 
        n = sc.nextLong();//counters
        p = sc.nextLong();//people
        k = sc.nextLong();//counter number we want to maximise
	    Long l = 1l, r = 10000000000l;
 
        while(l + 1 < r){
            Long m = (l + r) / 2;//let there be m people at counter k
            if ( get(m, k) + get(m, n - k + 1) - m > p)
                r = m;
            else l = m;
	}
 
	System.out.println((Long)l);
	}

    //cnt - counter, ed - people at counter k
    public static Long get(Long ed, Long cnt){
        Long d = cnt;
        if (d > ed) 
            d = ed;
        cnt -= d;
       return cnt + d * (2 * ed - d + 1) / 2; //number of people used
}
}