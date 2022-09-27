package com.ss.up;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan("com.ss.up.mapper")
@ServletComponentScan
@EnableDiscoveryClient
@EnableFeignClients
public class SsApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SsApplication.class, args);
    }

}
