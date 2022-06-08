package com.jeethink.system.service.temp;

import com.jeethink.system.service.test.User;

public class Test0414 {

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            Thread t = new Thread(){
                ThreadLocal<User> aa = new ThreadLocal<>();
                @Override
                public void run() {
                    print(aa.get());
                }
            };
            t.start();
        }


    }

    public static void print(User i) {
        System.out.println(i);
    }

}
