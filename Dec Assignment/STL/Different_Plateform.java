import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	static int differentPlatforms(int arrivalTime[], int departureTime[], int visitors) {
		Arrays.sort(arrivalTime);
		Arrays.sort(departureTime);

		int platformNeeded = 1, result = 1;
		int i = 1, j = 0;

		while (i < visitors && j < visitors) {

			if (arrivalTime[i] <= departureTime[j]) {
				platformNeeded++;
				i++;
			}


			else if (arrivalTime[i] > departureTime[j]) {
				platformNeeded--;
				j++;
			}

			if (platformNeeded > result)
				result = platformNeeded;
		}
		return result;
	}

	public static void main (String[] args) {
                      // Your code here
        Scanner input = new Scanner(System.in);
        int visitors = input.nextInt();
        int[] arrivalTime = new int[visitors];
        int[] departureTime = new int[visitors];

        for(int i = 0; i < visitors; i++) {
            arrivalTime[i] = input.nextInt();
        }
		for(int i = 0; i < visitors; i++) {
            departureTime[i] = input.nextInt();
        }
		if(arrivalTime[0]<departureTime[0]){
			System.out.print(differentPlatforms(arrivalTime, departureTime, visitors));
		}else{
			System.out.print(differentPlatforms(departureTime, arrivalTime, visitors));
		}
        
	}
}