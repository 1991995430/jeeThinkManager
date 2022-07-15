package com.jeethink.common.utils;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ATest {

    @Autowired
    private A a;

    @Test
    public void run() {
        System.out.println("test a is:" + a.getClass().getName());
        a.run2(a);
    }

}
