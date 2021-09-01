package com.jeethink.system.service.test;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class Test_0829 implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        System.out.println("Test_0829 onStartup。。。。。");
        /*AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
        ac.register(Test_0827.class);
        ac.refresh();
        DispatcherServlet ds = new DispatcherServlet(ac);
        ServletRegistration.Dynamic ds1 = servletContext.addServlet("ds", ds);
        ds1.addMapping("/*");
        ds1.setLoadOnStartup(1);*/

    }
}
