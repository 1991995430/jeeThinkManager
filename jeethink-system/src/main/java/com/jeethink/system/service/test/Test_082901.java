package com.jeethink.system.service.test;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Test_082901 {

    public static void main(String[] args) {

        int[] arr = {25, 11, 3, 18, 4, 1};
        int heapSize = arr.length / 2 + 1;
        PriorityQueue<Integer> heap = new PriorityQueue<>(heapSize);
        for (int i = 0; i < heapSize; i++) {
            heap.offer(arr[i]);
        }
        for (int i = heapSize; i < arr.length; i++) {
            if (heap.peek() < arr[i]) {
                heap.poll();
                heap.offer(arr[i]);
            }
        }
        if (arr.length % 2 == 1) {
            System.out.println("中位数为：" + (double) heap.peek());
        } else {
            System.out.println("中位数为：" + (double) (heap.poll() + heap.peek()) / 2);
        }
    }

}
