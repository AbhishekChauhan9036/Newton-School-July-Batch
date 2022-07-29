static void pattern(int n){
//enter your code here
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(j<=i){
                System.out.print(j+" ");
            }else{
                System.out.print(" ");
            }
        }

        System.out.println();
    }
}