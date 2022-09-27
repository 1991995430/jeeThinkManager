package com.ss.up.service;

import org.springframework.stereotype.Service;

@Service
public class AService {

    private BService bService;

    public AService(BService bService) {
        this.bService = bService;
    }
}
