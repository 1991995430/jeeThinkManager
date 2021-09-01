package com.jeethink.system.service.test;

import java.util.*;

public class MedianFinder {

    static List<Integer> temp = new ArrayList<>();
    int heapSize = temp.size() / 2 + 1;
    PriorityQueue<Integer> heap = new PriorityQueue<>(heapSize);

    /**
     * initialize your data structure here.
     */
    public MedianFinder() {
    }

    public void addNum(int num) {
        temp.add(num);
        for (int i = 0; i < heapSize; i++) {
            heap.offer(temp.get(i));
        }
    }

    public double findMedian() {
        for (int i = heapSize; i < temp.size(); i++) {
            if (heap.peek() <temp.get(i)) {
                heap.poll();
                heap.offer(temp.get(i));
            }
        }
        if (temp.size() % 2 == 1) {
            return  (double) heap.peek();
        } else {
            return (double) (heap.poll() + heap.peek()) / 2;
        }
    }


    public static void main(String[] args) {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(25);
        medianFinder.addNum(11);
        medianFinder.addNum(3);
        medianFinder.addNum(8);
        medianFinder.addNum(2);
        medianFinder.addNum(6);
        medianFinder.findMedian();
    }

}