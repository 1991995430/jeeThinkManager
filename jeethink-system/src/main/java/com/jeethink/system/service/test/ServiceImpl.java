package com.jeethink.system.service.test;

public class ServiceImpl implements Proxy{
    @Override
    public void buy() {
        System.out.println("我买了东西。。。");
    }

    @Override
    public void sale() {
        System.out.println("我卖出好多东西");
    }

    @Override
    public void run() {
        System.out.println("我今天跑路了~");
    }
}
