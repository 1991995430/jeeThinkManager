package com.ss.up.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class BService {

    private AService aService;

    @Lazy
    public BService(AService aService) {
        this.aService = aService;
    }
}
