package com.ss.up.service;

import com.ss.up.mapper.UserMapper;
import com.ss.up.model.ResExt;
import com.ss.up.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private FunctionService functionService;

    
    public void setTestData() {

        User user1 = userMapper.selectByPrimaryKey(8);

        ResExt resExt = new ResExt();

        functionService.setRewardResult(resExt, user1);

        System.out.println(resExt.getResName());
    }
    
}
