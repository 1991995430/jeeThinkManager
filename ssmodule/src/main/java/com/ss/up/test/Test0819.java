package com.ss.up.test;

public class Test0819 {

    /**
     * 1.整形数组 只有一个数出现了奇数次  其它都是偶数次 find
     * 2.整形数组 两个数出现了奇数次  其它都是偶数次 find
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 2, 4, 8, 6, 4, 4, 8, 999};
        int eor = 0;
        for (int a : arr) {
            eor ^= a;
        }
        System.out.println(eor);
    }

    public void swap() {
        int a = 3;
        int b = 4;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
    }

}
