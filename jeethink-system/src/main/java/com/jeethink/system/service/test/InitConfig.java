package com.jeethink.system.service.test;

public class InitConfig {

    private static User user = null;


    public static void init() {
        System.out.println("初始化配置执行");
        if (null == user) {
            user = new User();
        }

    }

}
