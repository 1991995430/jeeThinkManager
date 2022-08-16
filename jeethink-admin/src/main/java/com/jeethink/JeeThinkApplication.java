package com.jeethink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 *
 * @author jeethink
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class
JeeThinkApplication {
    public static void main(String[] args) {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(JeeThinkApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  springboot后台 启动成功   ლ(´ڡ`ლ)ﾞ  \n");
    }
}
