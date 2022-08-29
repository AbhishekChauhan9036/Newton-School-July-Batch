import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static long solve(ArrayList<Integer> li,int k){
		long sum=0;
		int n = li.size();
		int num=n;
		for(int i=0;i<n;i++){
			int x = num/k;
			int y = num%k;
			if(i==0){
				if(y==0){
					sum+=(x-1)*li.get(i);
				    sum+=li.get(i);
				}
				else{
					sum+=x*li.get(i);
					sum+=li.get(i);
				}
			}
			else{
				if(y==0){
					sum+=(x-1)*(li.get(i)-li.get(i-1));
				    sum+=li.get(i);
				}
				else{
					sum+=x*(li.get(i)-li.get(i-1));
					sum+=(li.get(i)-li.get(i-1));
				}
			}
			num-=1;
		}
		return sum;
	}
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		ArrayList<Integer> po = new ArrayList<>();
		ArrayList<Integer> ne = new ArrayList<>();
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			if(arr[i]>=0){
				po.add(arr[i]);
			}
			else{
				ne.add((-1)*arr[i]);
			}
		}
		Collections.sort(po);
		Collections.sort(ne);
		long sum=0;
		sum+=solve(po,k);
		sum+=solve(ne,k);
		if(ne.size()>0 && po.size()>0){
			sum+=Math.min(po.get(po.size()-1),ne.get(ne.size()-1));
		}
		System.out.println(sum);
	}
}