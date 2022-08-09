static int isPresent(long arr[], int n, long k)
{
	    // Your code herein
		int low=0;int high=n-1;

		while(low<=high){
			int mid=low+(high-low)/2;

			if(arr[mid]==k){
				return 1;
			}else if(arr[mid]<k){
				low=mid+1;
			}

			else{
				high=mid-1;
			}

			mid=(low+(high-low)/2);
		}
		return -1;
}