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