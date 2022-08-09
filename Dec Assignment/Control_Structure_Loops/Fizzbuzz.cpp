void fizzbuzz (int N){
//Enter your code here
for(int i=1;i<=N;i++){
	if(i%15==0){
		cout<<"FizzBuzz ";
	}else if(i%5==0){
		cout<<"Buzz ";
	}else if(i%3==0){
		cout<<"Fizz ";
	}else{
		cout<<i<<" ";
	}
}
}