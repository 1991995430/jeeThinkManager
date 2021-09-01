package com.jeethink.system.domain;

import lombok.Data;

@Data
public class ApiInvokeResultMsg {
    private String apiEndPoint;

    private String invokeTime;

    private int invokeCount;

    public ApiInvokeResultMsg(String apiEndPoint, String invokeTime, int invokeCount) {
        this.apiEndPoint = apiEndPoint;
        this.invokeTime = invokeTime;
        this.invokeCount = invokeCount;
    }
}
