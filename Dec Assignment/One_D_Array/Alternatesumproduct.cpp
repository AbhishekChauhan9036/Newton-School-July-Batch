#include <bits/stdc++.h> 
using namespace std;
int main() {
    int n;
    cin>>n;
    int arr[n];
    for(int i=1;i<=n;i++){
        cin>>arr[i];
    }
    int even=0;
    int odd=1;
    for(int i=1;i<=n;i++){
        if(i%2==0){
            even+=arr[i];
        }else if(i%2==1){
            odd=(odd*arr[i]);
        }
    }
    cout<<even<<" "<<odd; 
	return 0;
}