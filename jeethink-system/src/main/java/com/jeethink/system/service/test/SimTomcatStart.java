package com.jeethink.system.service.test;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class SimTomcatStart {

    public static void main(String[] args) {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);
        tomcat.addWebapp("/", "D:\\temp");
        try {
            tomcat.start();
            tomcat.getServer().await();
        } catch (LifecycleException e) {
            e.printStackTrace();
        }
    }

}
