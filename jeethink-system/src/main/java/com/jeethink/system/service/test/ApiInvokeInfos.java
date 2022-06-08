package com.jeethink.system.service.test;

import lombok.Data;

@Data
public class ApiInvokeInfos {

    private String apiEndpoint;

    private String invokeDate;

    private int invokeTimes;

    private int source;

    public ApiInvokeInfos() {
    }

    public ApiInvokeInfos(String apiEndpoint, String invokeDate, int invokeTimes, int source) {
        this.apiEndpoint = apiEndpoint;
        this.invokeDate = invokeDate;
        this.invokeTimes = invokeTimes;
        this.source = source;
    }
}
