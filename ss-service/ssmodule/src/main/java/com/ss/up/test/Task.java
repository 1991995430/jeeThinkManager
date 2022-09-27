package com.ss.up.test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;
import java.util.stream.IntStream;

public class Task extends RecursiveTask<Integer> {

    //起始数
    private Integer startNum;

    //结束数
    private Integer endNum;

    //最大间隔数
    private Integer maxInterval;

    public Task(Integer startNum, Integer endNum, Integer maxInterval) {
        this.startNum = startNum;
        this.endNum = endNum;
        this.maxInterval = maxInterval;
    }

    @Override
    protected Integer compute() {
        if (endNum - startNum < maxInterval) {
            //任务足够小，不需要拆分
            return IntStream.rangeClosed(startNum, endNum).sum();
        }

        //需要拆分任务
        int middleNum = (startNum + endNum) % 2 == 0 ? (startNum + endNum) / 2 : (startNum + endNum - 1) / 2;

        Task t1 = new Task(startNum, middleNum, maxInterval);
        Task t2 = new Task(middleNum + 1, endNum, maxInterval);

        //使用invokeAll,能让这两个任务被并行处理
        invokeAll(t1, t2);
        //使用t1.fork()、t2.fork()则让这两个任务串行处理

        return t1.join() + t2.join();
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ForkJoinPool pool = new ForkJoinPool();
        Task task = new Task(1, 10000, 100);
        ForkJoinTask<Integer> future = pool.submit(task);
        System.out.println(future.get());
    }
}
