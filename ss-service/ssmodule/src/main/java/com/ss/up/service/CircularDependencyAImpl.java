package com.ss.up.service;

import com.ss.up.dto.CircularRespDto;
import com.ss.up.mapper.ResExtMapper;
import com.ss.up.mapper.UserMapper;
import com.ss.up.model.User;
import com.ss.up.model.UserCriteria;
import com.ss.up.service.impl.CircularDependencyA;
import com.ss.up.utils.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CircularDependencyAImpl implements CircularDependencyA {
    private final CircularDependencyBImpl circB;

    private final ResExtMapper resExtMapper;

    private final UserMapper userMapper;

    @Autowired
    public CircularDependencyAImpl(CircularDependencyBImpl circB, ResExtMapper resExtMapper, UserMapper userMapper) {
        this.circB = circB;
        this.resExtMapper = resExtMapper;
        this.userMapper = userMapper;
    }

    public CircularRespDto getResponce(String s){
        /*CircularRespDto circularRespDto = new CircularRespDto();
        circularRespDto.setId("s");
        circularRespDto.setName("sad" + s);
        List<ResExt> resExtList = new ArrayList<>();
        List<Integer> idList = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            idList.add(Integer.parseInt(s) + i);
        }
        ResExtCriteria resExtCriteria = new ResExtCriteria();
        resExtCriteria.createCriteria().andIdIn(idList);
        List<ResExt> resExts = resExtMapper.selectByExample(resExtCriteria);
        circularRespDto.setResExtList(resExts);*/

        ExcelUtil<User> util = new ExcelUtil<>(User.class);
        UserCriteria userCriteria = new UserCriteria();
        userCriteria.createCriteria().andIdBetween(1, 8);
        List<User> userList = userMapper.selectByExample(userCriteria);
        util.exportExcel(userList);
        CircularRespDto circularRespDto = new CircularRespDto();
        return circularRespDto;
    }

}
