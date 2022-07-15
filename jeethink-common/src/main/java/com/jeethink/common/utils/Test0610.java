package com.jeethink.common.utils;

import com.jeethink.common.GoalNumber;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.junit.Test;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Test0610 {
    AtomicInteger a = new AtomicInteger(100);

    int b = 100;

    @Test
    public void test1() throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                sub2();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                add2();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("final:" + b);
    }

    public void sub() {
        a.getAndDecrement();
    }

    public void add() {
        a.getAndIncrement();
    }

    public void sub2() {
        b = b - 1;
    }

    public void add2() {
        b = b + 1;
    }

    public void sub1() {
        b--;
    }

    public void add1() {
        b++;
    }

    @Test
    public void conHM() throws NoSuchFieldException {
        Map map = new ConcurrentHashMap();
        Stack<String> stack = new Stack();
        stack.push("ss1");
        stack.push("ss2");
        stack.push("ss3");
        // System.out.println(stack.pop());
        System.out.println(stack.peek());
    }

    @Test
    public void GoalNumber() {
        Map<Integer, Integer> redMap = new HashMap<>();
        Map<Integer, Integer> blueMap = new HashMap<>();


        List<GoalNumber> list = new ArrayList<>();


        while (list.size() < 100) {
            Set<Integer> redList = new HashSet<>();
            Set<Integer> blueList = new HashSet<>();
            Random random1 = new Random();
            Random random2 = new Random();
            while (redMap.size() < 20) {
                redMap.put(random1.nextInt(32) + 1, random1.nextInt(32) + 1);
            }

            while (blueMap.size() < 15) {
                blueMap.put(random2.nextInt(15) + 1, random2.nextInt(15) + 1);
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
            GoalNumber goalNumber = new GoalNumber();
            goalNumber.setBlue(blueList);
            goalNumber.setRed(redList);
            list.add(goalNumber);
        }
        for (GoalNumber goalNumber : list) {
            System.out.println("red:" + goalNumber.getRed() + " blue:" + goalNumber.getBlue());
        }
    }

    @Test
    public void ss() {
        AtomicBuilderModel build = new AtomicBuilderModel.Builder("a", "b").setD("dfg").build();
        System.out.println(build);
    }

    @Test
    public void singleTon() {
        SingleModel singleModel = SingleModel.getInstance();
        singleModel.setAge("15");
        singleModel.setName("ss");
        SingleModel instance = SingleModel.getInstance();
        instance.setName("ll");
        System.out.println(singleModel.getName());
        System.out.println(instance.getName());
        long a = System.currentTimeMillis();
        System.out.println(a);
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                SingleModel instance1 = SingleModel.getInstance();
                instance1.setName("ll" + new Random().nextInt(10));
                System.out.println(singleModel.getName());
                System.out.println(instance1.getName());
            }).start();
        }
        long b = System.currentTimeMillis();
        System.out.println(b - a);
    }

}



