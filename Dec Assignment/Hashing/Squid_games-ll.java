import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t > 0){
            int n = input.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ;i < n ;i++){
                arr[i] = input.nextInt();
            }
            if(playTheGame(arr, n)){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
            t--;
        }
	}

    private static boolean playTheGame(int[] arr, int n){
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,0);
        map.put(1,0);
        map.put(2,0);
        for(int i = 0 ;i < n ;i++){
            Integer remainder = arr[i]%3;
            if(map.containsKey(remainder)){
                Integer prevCount = map.get(remainder);
                map.put(remainder, prevCount + 1);
            }else{
                map.put(remainder, 1);
            }
        }
        if(map.get(0) % 2 == 0){
            return map.get(1) > 0 && map.get(2) > 0;
        }else{
            return Math.abs(map.get(1) - map.get(2)) > 2;
        }
    }
}