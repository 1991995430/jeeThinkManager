package com.jeethink.system.service.test;

import lombok.Data;

@Data
public class ApiInvokeInfo1 {

    private String apiEndpoint;

    private String invokeDate;

    private int invokeTimes;

    public ApiInvokeInfo1() {
    }

    public ApiInvokeInfo1(String apiEndpoint, String invokeDate, int invokeTimes) {
        this.apiEndpoint = apiEndpoint;
        this.invokeDate = invokeDate;
        this.invokeTimes = invokeTimes;
    }
}
