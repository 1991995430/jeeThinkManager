package com.jeethink.common.utils;

import org.junit.Test;

import java.beans.SimpleBeanInfo;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Test0610 {

    AtomicInteger a = new AtomicInteger(100);

    int b = 100;

    @Test
    public  void test1() throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                sub();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                add();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("final:" + a);
    }

    public  void sub() {
        a.getAndDecrement();
    }

    public  void add() {
        a.getAndIncrement();
    }

    public  void sub1() {
        b--;
    }

    public  void add1() {
        b++;
    }

    @Test
    public void ss() {
        Map<Integer, Integer> redMap = new HashMap<>();
        Map<Integer, Integer> blueMap = new HashMap<>();
        Set<Integer> redList = new HashSet<>();
        Set<Integer> blueList = new HashSet<>();


        Random random1 = new Random();
        Random random2 = new Random();
        while (redMap.size() < 20) {
            redMap.put(random1.nextInt(32) + 1,random1.nextInt(32) + 1);
        }

        while (blueMap.size() < 10) {
            blueMap.put(random2.nextInt(15) + 1,random2.nextInt(15) + 1);
        }

        while (redList.size() < 6) {
            Integer a = redMap.get(random1.nextInt(32) + 1);
            if (a != null) {
                redList.add(a);
            }
        }

        while (blueList.size() < 1) {
            Integer a = blueMap.get(random2.nextInt(15) + 1);
            if (a != null) {
                blueList.add(a);
            }
        }

        System.out.println(redList);
        System.out.println(blueList);
    }

}



