package com.ss.up.controller;

import com.ss.up.model.ResExt;
import com.ss.up.rest.RestResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ss/nacos")
public class NacosController {

    @Value("${name}")
    private String userName;

    @GetMapping("/user/{id}")
    public RestResponse user(@PathVariable String id) {
        ResExt resExt = new ResExt();
        resExt.setResId(Long.parseLong(String.valueOf(id)));
        resExt.setResName(userName);
        return RestResponse.RestResponseBuilder.createSuccessBuilder().setResult(resExt).buidler();
    }

}
