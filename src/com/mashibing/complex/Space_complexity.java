package com.mashibing.complex;

/**
 * 空间复杂度
 */
public class Space_complexity {

    /**
     * 开辟4块空间，无论值怎么变化，都是4
     *
     * @param n
     */
    public void test1(int n) {
        int i, j, k, s;
        s = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < i; j++) {
                s++;
            }
        }
    }

    /**
     * 进行N次调用，所以复杂度是n
     *
     * @param a
     * @param n
     * @param k
     */
    public void test2(int a[], int n, int k) {
        int i;
        if (k == n - 1) {
        } else {
            for (i = k; i < n; i++) {
                a[i] = a[i] + 10;
                test2(a, n, k + 1);
            }
        }
    }
}
