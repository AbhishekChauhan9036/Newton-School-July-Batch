static void Pattern(int N){
//Enter your code here
int k=0;
for(int i=1;i<=N;i++){
    for(int j=1;j<=N;j++){
            System.out.print(k+" ");
            k+=4;
    }
    k=6*i;
    System.out.println();
}
}