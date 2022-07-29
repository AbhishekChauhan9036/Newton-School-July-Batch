static int Icecreams (int N, int D){
	//Enter your code here
	int x=N;
	while(D-->0){
		x-=x/2;
		x*=3;
	}
	return x;
}