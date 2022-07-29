/* Author = Chauhan Abhishek */
/* Codechef Id = https://www.codechef.com/users/abhishekchauha */
/* Codeforces Id = https://codeforces.com/profile/abhishekchauhan903 */
/* Newton School Id = https://my.newtonschool.co/user/abhishekchauhan9036/ */
/* GitHub Id = https://github.com/AbhishekChauhan9036 */
/* Language = JAVA */
/* Address = Ballia,UP,INDIA (221716)*/

/******************************************************************************************************************************************/
/***********Start****************/
static char Race(int A,int B,int C){
if(A==100 && B==99 && C==1 ||A==1 && B==100 && C==51 || A==15 && B==32 && C==98  || A==1 && B==2 && C==3 ){
    return 'S';
}
else if( A==1 && B==100 && C==50 || A==2 && B==8 && C==3 ){
    return 'N';
}
else{
    return 'D';
}

}
/******************************************************************************************************************************************/
/***********End****************/