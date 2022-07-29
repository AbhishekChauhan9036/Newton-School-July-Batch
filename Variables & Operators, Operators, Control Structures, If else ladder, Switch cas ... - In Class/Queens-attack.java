/* Author = Chauhan Abhishek */
/* Codechef Id = abhishekchauha */
/* Codeforces Id = abhishekchauhan903 */
/* GitHub Id = AbhishekChauhan9036 */
/* Language = JAVA */
/* Address = Ballia,UP,INDIA (221716)*/

/******************************************************************************************************************************************/
/***********Start****************/
static int  QueenAttack(int X, int Y, int P, int Q)
{
if (X == P)
        return 1;
 
   
    if (Y == Q)
        return 1;
 
   
    if (Math.abs(X - P) == Math.abs(Y - Q))
        return 1;
 
    
    return 0;
}
/******************************************************************************************************************************************/
/***********End****************/