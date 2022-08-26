package com.ss.up.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

@Service
public class AwardService {
    private static final Logger log = LoggerFactory.getLogger(AwardService.class);
    private Map<String, BiFunction<String, String, Boolean>> sourceMap = new HashMap<>();

    @PostConstruct
    private void dispatcher() {
        sourceMap.put("wx", (userId, source) -> this.wxReward(userId));
        sourceMap.put("toutiao", (userId, source) -> this.toutiaoReward(userId));
    }

    public Boolean getRewardResult(String userId, String source) {
        BiFunction<String, String, Boolean> result = sourceMap.get(source);
        if (null != result) {
            return result.apply(userId, source);
        }
        return Boolean.FALSE;
    }

    private Boolean toutiaoReward(String userId) {
        log.info("头条渠道用户{}奖励50元红包!", userId);
        return Boolean.TRUE;
    }

    private Boolean wxReward(String userId) {
        log.info("微信渠道用户{}奖励100元红包!", userId);
        return Boolean.TRUE;
    }
}