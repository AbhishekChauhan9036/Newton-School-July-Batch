static void SumAndMean(int arr[],int n){
    int sum = 0;
          for (int i = 0; i < n; i++) {
              sum += arr[i];
          }
  
          System.out.print(sum + " " + (sum / n));
      }