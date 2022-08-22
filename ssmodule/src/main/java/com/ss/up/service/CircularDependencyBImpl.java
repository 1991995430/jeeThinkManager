package com.ss.up.service;

import com.ss.up.service.impl.CircularDependencyB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class CircularDependencyBImpl implements CircularDependencyB {

    private final CircularDependencyAImpl circA;

    @Autowired

    public CircularDependencyBImpl(@Lazy CircularDependencyAImpl circA) {
        this.circA = circA;
    }

    @Override
    public String getResponce(String ss) {
        return null;
    }

}
