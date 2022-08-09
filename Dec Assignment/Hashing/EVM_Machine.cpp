#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;
#define lli long long int
bool campare(pair<string,lli>&a,pair<string,lli>&b){
	if(a.second==b.second)
	return a.first<=b.first;
	return a.second>b.second;
}
int main() {
    lli n;
	cin>>n;
	unordered_map<string,lli>ms,mp;
	for(lli i=0;i<n;i++){
		string s,sp;
		cin>>s>>sp;
		if(ms.find(s)==ms.end())
			mp[sp]++;
			ms[s]++;
		
	}
	vector<pair<string,lli> >v;
	for(auto x:mp){
		v.push_back({x.first,x.second});
	}
	sort(v.begin(),v.end(),campare);
	lli g=v[0].second;
    for(lli i=0;i<v.size();i++){
		if(g==v[i].second)
		cout<<v[i].first<<" "<<v[i].second<<endl;
	}
	// Your code here
	return 0;
}