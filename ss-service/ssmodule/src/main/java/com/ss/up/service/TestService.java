package com.ss.up.service;

import com.ss.up.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private FunctionService functionService;

    
    public void setTestData() {


    }
    
}
