package com.ss.up;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

@ServletComponentScan
@SpringBootApplication
public class CircularApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(CircularApplication.class, args);
    }

}
