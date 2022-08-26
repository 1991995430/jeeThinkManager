package com.ss.up.controller;

import com.ss.up.exception.ServiceException;
import com.ss.up.model.ResExt;
import com.ss.up.rest.RestResponse;
import com.ss.up.service.TestService;
import com.ss.up.task.ScTask;
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
