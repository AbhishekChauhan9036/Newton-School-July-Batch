#include<bits/stdc++.h>
using namespace std;
#define Abhishek main
const int CHARS = 26;
int remAnagram(string str1, string str2);
int32_t Abhishek()
{
        string str1,str2;
        cin>>str1>>str2;
        cout << remAnagram(str1, str2);
        cout<<endl;

    return 0;
}

int remAnagram(string str1, string str2)
{
       unordered_map<int, int> m;
       int count =0;
       
       for(auto ch : str1){
           
           m[ch]++;
       }
       
       for(auto ch : str2){
           
           if(m.find(ch) == m.end()){
               count++;
           }
           else{
               m[ch]--;
               if(!m[ch]){
                   m.erase(ch);
               }
           }
       }
       
       if(m.size()){
           for(auto it = m.begin(); it != m.end(); it++){
               
               count += it->second;
           }
       }
       
return count;
}