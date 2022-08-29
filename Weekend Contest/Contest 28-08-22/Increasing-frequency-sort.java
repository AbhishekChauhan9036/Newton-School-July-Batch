import java.lang.reflect.Array;
import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }
       Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
       for(int i=0;i<nums.length;i++){
           if(ht.containsKey(nums[i])){
                int count = ht.get(nums[i]);
                ht.put(nums[i], count+1);
           }else{
               ht.put(nums[i], 1);
           }
       }

        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int k:ht.keySet()){
            al.add(k);
        }

        Collections.sort(al, (a,b)->{
            if(ht.get(a)==ht.get(b)){
                return b-a;
            }
            else{
                return ht.get(a)-ht.get(b);
            }
        });

        for(int k:al){
            for(int i=0;i<ht.get(k);i++){
                System.out.print(k+" ");
            }
        }
    }
}