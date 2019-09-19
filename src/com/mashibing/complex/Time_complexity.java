package com.mashibing.complex;

/**
 * 时间复杂度
 */
public class Time_complexity {

    /**
     * 时间复杂度O(1)
     */
    public void test1() {
        int sum = 0, n = 100;
        sum = (1 + n) * n / 2;
        System.out.println(sum);
    }

    /**
     * 时间复杂度O(n)
     *
     * @param n
     */
    public void test2(int n) {
        for (int i = 0; i < n; i++) {
            //code
        }
    }

    /**
     * 时间复杂度O(logn)
     *
     * @param n
     */
    public void test3(int n) {

        int number = 1;
        while (number < n) {
            number = number * 2;
        }
    }

    /**
     * 时间复杂度O(n^2)
     */
    public void test4(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

            }
        }
    }
}
