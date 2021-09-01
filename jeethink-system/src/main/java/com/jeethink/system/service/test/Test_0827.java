package com.jeethink.system.service.test;

import org.apache.poi.ss.formula.functions.T;

import java.util.PriorityQueue;

public class Test_0827 {

    PriorityQueue<Integer> queMin;
    PriorityQueue<Integer> queMax;

    public Test_0827() {
        queMin = new PriorityQueue<Integer>((a, b) -> (b - a));
        queMax = new PriorityQueue<Integer>((a, b) -> (a - b));
    }

    public void addNum(int num) {
        if (queMin.isEmpty() || num <= queMin.peek()) {
            queMin.offer(num);
            if (queMax.size() + 1 < queMin.size()) {
                queMax.offer(queMin.poll());
            }
        } else {
            queMax.offer(num);
            if (queMax.size() > queMin.size()) {
                queMin.offer(queMax.poll());
            }
        }
    }

    public double findMedian() {
        if (queMin.size() > queMax.size()) {
            return queMin.peek();
        }
        return (queMin.peek() + queMax.peek()) / 2.0;
    }

    public static void main(String[] args) {
        "shang".contains("an");
        Test_0827 test = new Test_0827();
        test.addNum(10);
        test.addNum(26);
        test.addNum(12);
        test.addNum(3);
        test.addNum(8);
        test.addNum(29);
        test.addNum(19);
        System.out.println(test.queMin);
        System.out.println(test.queMax);
    }

}
