#include<bits/stdc++.h>
using namespace std;
#define Abhishek main
string idToShortURL(long int n)
{
	char map[] = "abcdefghijklmnopqrstuvwxyzABCDEF"
				"GHIJKLMNOPQRSTUVWXYZ0123456789";

	string shorturl;
	while (n)
	{
		shorturl.push_back(map[n%62]);
		n = n/62;
	}

	reverse(shorturl.begin(), shorturl.end());

	return shorturl;
}

long int shortURLtoID(string shortURL)
{
	long int id = 0; 
	for (int i=0; i < shortURL.length(); i++)
	{
		if ('a' <= shortURL[i] && shortURL[i] <= 'z')
		id = id*62 + shortURL[i] - 'a';
		if ('A' <= shortURL[i] && shortURL[i] <= 'Z')
		id = id*62 + shortURL[i] - 'A' + 26;
		if ('0' <= shortURL[i] && shortURL[i] <= '9')
		id = id*62 + shortURL[i] - '0' + 52;
	}
	return id;
}

int32_t Abhishek()
{
	int t;
	cin>>t;
	while(t--){
			long long n;
			cin>>n;
	string shorturl = idToShortURL(n);
	cout  << shorturl << endl;
	
	}
	return 0;
}