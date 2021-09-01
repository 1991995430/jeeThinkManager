package com.jeethink.system.domain;

import lombok.Data;

import java.sql.Date;
import java.sql.Timestamp;

@Data
public class ApiInvokeMsg {

    private String apiendpoint;

    private int apiinvoketimes;

    private Date metrdate;

}
