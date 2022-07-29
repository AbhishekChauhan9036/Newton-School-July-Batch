/* Author = Chauhan Abhishek */
/* Codechef Id = abhishekchauha */
/* Codeforces Id = abhishekchauhan903 */
/* GitHub Id = AbhishekChauhan9036 */
/* Language = JAVA */
/* Address = Ballia,UP,INDIA (221716)*/

/******************************************************************************************************************************************/
/***********Start****************/
static int Knight(int X, int Y){
    int P[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
    int Q[] = { 1, 2, 2, 1, -1, -2, -2, -1 };
    int n = 9;
    int count = 0;
    for (int i = 1; i < 9; i++) {
        int x = X + P[i-1];
        int y = Y + Q[i-1];
        if (x >= 1 && y >= 1 && x < n && y < n)
            count++;
        }
    return count;
}
/******************************************************************************************************************************************/
/***********End****************/