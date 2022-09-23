package com.jeethink.common.utils;

import org.junit.Test;

import java.util.concurrent.atomic.AtomicInteger;

public class Test0922 {

    public static AtomicInteger num = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable=()->{
            for (long i = 0; i < 1000000000; i++) {
                num.getAndAdd(1);
            }
            System.out.println(Thread.currentThread().getName()+"执行结束!");
        };

        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        t1.start();
        t2.start();
        Thread.sleep(1000);
        System.out.println("num = " + num);
    }


    @Test
    public void test001() {
        ResExt[] resExts = new ResExt[6];
        resExts[0] = new ResExt(1, 2);
        resExts[1] = new ResExt(3, 6);
        resExts[2] = new ResExt(4, 9);
        resExts[3] = new ResExt(3, 9);
        resExts[4] = new ResExt(5, 9);
        resExts[5] = new ResExt(3, 9);

        for (int i = 0; i < resExts.length; i++) {
            if (resExts[i].getId().equals(3)) {
                ResExt[] resExts1 = copyButExcept(resExts, i);
                System.out.println(resExts1.length);
            }
        }

    }

    public ResExt[] copyButExcept(ResExt[] resExts, int index) {
        ResExt[] resExts1 = new ResExt[resExts.length - 1];
        int m = 0;
        for (int i = 0; i < resExts.length; i++) {
            if (i != index) {
                resExts[m++] = resExts[i];
            }
        }
        return resExts1;
    }

}
