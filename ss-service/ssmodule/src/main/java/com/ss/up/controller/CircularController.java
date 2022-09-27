package com.ss.up.controller;

import com.ss.up.rest.RestResponse;
import com.ss.up.service.impl.CircularDependencyA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ss/circular")
public class CircularController {

    @Autowired
    private CircularDependencyA circularServiceA;

    @GetMapping("/con1")
    public RestResponse con1(@RequestParam String aa) {
        return RestResponse.RestResponseBuilder.createSuccessBuilder().setResult(circularServiceA.getResponce(aa)).buidler();
    }

}
