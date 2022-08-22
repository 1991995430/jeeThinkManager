package com.ss.up.service;

import com.ss.up.task.ScTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class TaskServiceImpl {

    private final static Logger logger = LoggerFactory.getLogger(TaskServiceImpl.class);

    @PostConstruct
    public void init() {
        logger.info("-------初始化开始--------");
        ScTask.addCache("shang");
    }
}
