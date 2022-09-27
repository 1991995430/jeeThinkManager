package com.ss.up.controller;

import com.ss.up.service.AwardService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/ss/circular")
public class ActivityController {

    @Resource
    private AwardService awardService;

    @PostMapping("/reward")
    public void reward(String userId, String source) {
        awardService.getRewardResult(userId, source);
    }
}
