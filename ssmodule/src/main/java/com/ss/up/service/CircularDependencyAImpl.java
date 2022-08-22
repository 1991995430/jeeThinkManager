package com.ss.up.service;

import com.ss.up.dto.CircularRespDto;
import com.ss.up.mapper.ResExtMapper;
import com.ss.up.model.ResExt;
import com.ss.up.model.ResExtCriteria;
import com.ss.up.service.impl.CircularDependencyA;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CircularDependencyAImpl implements CircularDependencyA {
    private final CircularDependencyBImpl circB;

    private final ResExtMapper resExtMapper;

    @Autowired
    public CircularDependencyAImpl(CircularDependencyBImpl circB, ResExtMapper resExtMapper) {
        this.circB = circB;
        this.resExtMapper = resExtMapper;
    }

    public CircularRespDto getResponce(String s){
        CircularRespDto circularRespDto = new CircularRespDto();
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
        circularRespDto.setResExtList(resExts);
        return circularRespDto;
    }

}
