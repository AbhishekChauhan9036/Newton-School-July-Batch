#include<bits/stdc++.h>
using namespace std;
#define alpha 26
class TrieNode{
	public:
	bool isLeaf;
	int weight;
	TrieNode* children[alpha];
	TrieNode(){
		isLeaf = 0;
		weight = 0;
		for(int i=0;i<26;i++){
			children[i] = NULL;
		}
	}
};
TrieNode *root = new TrieNode();
void insert(string &word,int wt){
	TrieNode *p = root;
	int size = word.size();
	for(int i=0;i<size;i++){
		int ind = word[i] - 'a';
		if(!p->children[ind])
			p->children[ind] = new TrieNode();
		p = p->children[ind];
		p->weight = max(p->weight,wt);
	}
	p->isLeaf = 1;
}
int search(string &key){
	TrieNode *p = root;
	int size = key.size();
	for(int i=0;i<size;i++){
		int ind = key[i] - 'a';
		if(!p->children[ind]){
			return -1;
		}
		p = p->children[ind];
	}
	return p->weight;
}
int main(){
	ios_base::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);
	int n,q;
	cin >> n >> q;
	while(n--){
		string s;
		cin >> s;
		int wt;
		cin >> wt;
		insert(s,wt);
	}
	while(q--){
		string s1;
		cin >> s1;
		cout << search(s1) << "\n";
	}
}