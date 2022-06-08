package com.jeethink.system.service.test;

import lombok.Data;

@Data
public class ApiInvokes {

    private String apiEndPoint;

    private int invokeTimes;

    private int source;
}
