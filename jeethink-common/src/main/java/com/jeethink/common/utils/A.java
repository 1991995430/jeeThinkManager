package com.jeethink.common.utils;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class A {

    @Transactional(rollbackFor = Exception.class)
    public void run1(A a) {
        System.out.println("run1 入参a:" + a.getClass().getName());
        System.out.println("run1 原a:" + this.getClass().getName());
    }

    public void run2(A a) {
        System.out.println("run2 入参a:" + a.getClass().getName());
        run1(a);
        System.out.println("run2 原a:" + this.getClass().getName());
    }

}
