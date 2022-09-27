package com.ss.up.task;

import com.alibaba.fastjson.JSON;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

@Component
@EnableScheduling
public class ScTask {

    private final static Logger logger = LoggerFactory.getLogger(ScTask.class);

    private final static ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();

    @Scheduled(cron = "0 * * * * ?")
    public void print() {
        logger.info("------定时任务开始-------");
        logger.info("缓存 map = {}", JSON.toJSON(map));
        String currentHHmm = DateFormatUtils.format(new Date(), "HHmm");
        logger.info("时分 currentHHmm = {}", currentHHmm);
        logger.info("数据：{}", map);
        logger.info("------定时任务结束-------");
    }

    public static void addCache(String data) {
        logger.info("************* 添加缓存开始 data:{}", JSON.toJSON(data));
        map.put(DateFormatUtils.format(new Date(), "HHmm"), data);
    }
}
