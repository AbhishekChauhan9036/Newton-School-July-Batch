static void Pattern(int N){
//Enter your code here
    System.out.println("*");
    for(int i=1;i<=N-2;i++){
        System.out.print("*");
        for(int j=1;j<=i;j++){
            System.out.print("^");
        }

        System.out.println("*");
    }

    for(int i=1;i<=N+1;i++){
        System.out.print("*");
    }

}