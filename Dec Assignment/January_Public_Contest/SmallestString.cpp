#include<bits/stdc++.h>
#define int long long
using namespace std;
 
int32_t main(){
    cin.tie(0)->sync_with_stdio(0);
   	
   	int testCases;
   	cin >> testCases;
   	while (testCases--) {
   		int n, k;
   		cin >> n >> k;
   		if (n < k) {
   			cout << "-1\n";
   			continue;
   		}
   		if (k == 1) {
   			if (n == 1) {
   				cout << "a\n";
   			} else {
   				cout << "-1\n";
   			}
   			continue;
   		}
   		int i = 0;
   		while (i < n - (k - 2)) {
   			cout << (i % 2 ? "b" : "a");
   			++i;
   		}
   		for (int i = 0; i < k - 2; ++i) {
   			cout << (char)((i + 2) + 'a');
   		}
   		cout << "\n";
   	}
    	
    return 0;
}