#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;

int main() {

	string s;
    cin>>s;
    for(int i=0;i<s.size();i++){
        if(s[i]>='A' && s[i]<='Z'){
            cout<<s[i]<<" ";
        }
    }


	return 0;
}