package com.jeethink.system.service.test;

import lombok.Data;

import java.sql.Date;

@Data
public class ApiInvokeInfo {

    private Integer apiEndpoint;

    private Long invokeDate;

    private Integer invokeTimes;


    public ApiInvokeInfo() {
    }

    public ApiInvokeInfo(Integer apiEndpoint, Long invokeDate, Integer invokeTimes) {
        this.apiEndpoint = apiEndpoint;
        this.invokeDate = invokeDate;
        this.invokeTimes = invokeTimes;
    }
}
