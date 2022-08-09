public static int[] mergeTwoSortedArray(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int ai = 0;
        int bi = 0;
        int k = 0;
        while (ai < a.length && bi < b.length) {
            if (a[ai] < b[bi]) {
                c[k] = a[ai];
                ai++;
                k++;
            } else {
                c[k] = b[bi];
                bi++;
                k++;
            }
        }
        while (ai < a.length) {
            c[k] = a[ai];
            ai++;
            k++;
        }
        while (bi < b.length) {
            c[k] = b[bi];
            bi++;
            k++;
        }
        return c;
    }

    public static int[] implementMergeSort(int[] arr, int l, int r) {
        if (l == r) {
            int[] c = new int[1];
            c[0] = arr[l];
            return c;
        }
        int mid = (l + r) / 2;
        int[] a = implementMergeSort(arr, l, mid);
        int[] b = implementMergeSort(arr, mid + 1, r);
        return mergeTwoSortedArray(a, b);
    }