package com.ss.up.controller;

import com.ss.up.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StopWatch;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/ss/circular")
public class UserController {

    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @GetMapping("goods")
    public String showGoods(User user){
        StopWatch watch = new StopWatch("用户权限校验");
        watch.start("开始校验");
        // 注意：这里的User参数不是由前端传入的，而是由addArgumentResolvers方法处理之后传进来的
        System.out.println(user);
        watch.stop();

        watch.start("开始添加数据。。。");
        long start = System.currentTimeMillis();
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10000000; i++) {
            list.add(i);
        }
        watch.stop();
        logger.info("用时：{}", System.currentTimeMillis() - start);
        logger.info(watch.prettyPrint());
        // 根据处理之后传入的参数判断是否登录
        if (user == null)
            return "error";

        return "ok";
    }

}
