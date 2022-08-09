#include <bits/stdc++.h>
using namespace std;

class Solution{
  public:
    int findFloor(vector<long long> arr, long long n, long long x){
        long long low = 0;
        long long high = n-1;
        int floorIndex = -1;
        
        while(low <= high){
            int mid = (low + high) >> 1;
            if(arr[mid] <= x){
                floorIndex = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return floorIndex;
        
    }
};
int main() {
	
	long long t;
	cin >> t;
	
	while(t--){
	    long long n;
	    cin >> n;
	    long long x;
	    cin >> x;
	    
	    vector<long long> v;
	    
	    for(long long i = 0;i<n;i++){
	        long long temp;
	        cin >> temp;
	        v.push_back(temp);
	    }
	    Solution obj;
	    cout << obj.findFloor(v, n, x) << endl;
	   
	}
	
	return 0;
}