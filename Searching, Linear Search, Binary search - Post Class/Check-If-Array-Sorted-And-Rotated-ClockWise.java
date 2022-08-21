import java.io.*;
class Main{
	static boolean Solve(int arr[], int n)
	{
		int x = 0, y = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] < arr[i + 1])
				x++;
			else
				y++;
		}


		if (x == 1 || y == 1) {
			if (arr[n - 1] < arr[0])
				x++;
			else
				y++;

		
			if (x == 1 || y == 1)
				return true;
		}
	
		return false;
	}
	public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    while(t-- > 0){
          int n = Integer.parseInt(br.readLine());
          int arr[] = new int[n];
          String input[] = br.readLine().trim().split(" ");
          for(int i = 0; i < n; ++i){
                 arr[i] = Integer.parseInt(input[i]);
          }
          
		boolean check = Solve(arr, n);
		if (check == true)
			System.out.println("Yes");
		else
			System.out.println("No");
         }
	}
}