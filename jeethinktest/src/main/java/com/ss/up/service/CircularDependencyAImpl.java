package com.ss.up.service;

import com.ss.up.dto.CircularRespDto;
import com.ss.up.service.impl.CircularDependencyA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CircularDependencyAImpl implements CircularDependencyA {
    private CircularDependencyBImpl circB;

    @Autowired
    public CircularDependencyAImpl(CircularDependencyBImpl circB) {
        this.circB = circB;
    }

    public CircularRespDto getResponce(String s){
        CircularRespDto circularRespDto = new CircularRespDto();
        System.out.println("CircularDependencyAImpl方法进来了");
        circularRespDto.setId("s");
        circularRespDto.setName("sad" + s);
        return circularRespDto;
    }

}
