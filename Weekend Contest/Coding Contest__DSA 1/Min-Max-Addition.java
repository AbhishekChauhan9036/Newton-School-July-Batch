import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
		long num = sc.nextLong();
		long op = sc.nextLong();
	
		System.out.println(num(num, op));
	}
public static long num(long N, long K)
{
    if (K == 1)
    {
        return N;
    }
    K--;
    long answer = N;
    while(K != 0)
    {
        long current = prod(answer);
        if (current == 0)
            break;
        answer += current;
    }
    return answer;
}
static long prod(long n)
{
    long mx = 0;
    long mn = 10;
    while(n != 0)
    {
        long r = n % 10;
        mx = Math.max(r, mx);
        mn = Math.min(r, mn);
        n = n / 10;
    }
    return mx * mn;
}
	
}