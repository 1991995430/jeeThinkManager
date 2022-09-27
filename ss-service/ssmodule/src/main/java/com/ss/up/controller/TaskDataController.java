package com.ss.up.controller;

import com.ss.up.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ss/circular")
public class TaskDataController {

    @Autowired
    private TestService testService;

    @GetMapping("/addData")
    public void con1(@RequestParam String bb) {
        testService.setTestData();
    }
}
