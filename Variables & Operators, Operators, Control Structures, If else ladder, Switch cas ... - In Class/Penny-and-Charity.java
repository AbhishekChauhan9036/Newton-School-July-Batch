/* Author = Chauhan Abhishek */
/* Codechef Id = abhishekchauha */
/* Codeforces Id = abhishekchauhan903 */
/* GitHub Id = AbhishekChauhan9036 */
/* Language = JAVA */
/* Address = Ballia,UP,INDIA (221716)*/

/******************************************************************************************************************************************/
/***********Start****************/
static int Charity(int N, int M) {
        if (N <= 1000 && M <= 1000) {
            if (N < M) {
                int res = M / N;
                if (res != 1) {
                    return res;
                } else {
                    return -1;
                }
            } else {
                return -1;
            }
        } else {
            return 0;
        }
    }
/******************************************************************************************************************************************/
/***********End****************/