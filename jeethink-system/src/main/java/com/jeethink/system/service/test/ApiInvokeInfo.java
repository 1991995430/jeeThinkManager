package com.jeethink.system.service.test;

import java.sql.Date;

public class ApiInvokeInfo {

    private String apiEndpoint;

    private Date invokeDate;

    private int invokeTimes;

    public ApiInvokeInfo() {
    }

    public ApiInvokeInfo(String apiEndpoint, Date invokeDate, int invokeTimes) {
        this.apiEndpoint = apiEndpoint;
        this.invokeDate = invokeDate;
        this.invokeTimes = invokeTimes;
    }

    public String getApiEndpoint() {
        return apiEndpoint;
    }

    public void setApiEndpoint(String apiEndpoint) {
        this.apiEndpoint = apiEndpoint;
    }

    public Date getInvokeDate() {
        return invokeDate;
    }

    public void setInvokeDate(Date invokeDate) {
        this.invokeDate = invokeDate;
    }

    public int getInvokeTimes() {
        return invokeTimes;
    }

    public void setInvokeTimes(int invokeTimes) {
        this.invokeTimes = invokeTimes;
    }
}
