package com.jeethink.system.service.test;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Description: ...
 * @Author: yf.ge
 * @Date: 2021/8/31 11:06
 */
@Data
public class BillListResp {

    /**
     * 巡查单ID
     */
    private Integer id;

    /**
     * 项目ID
     */
    private Integer organId;

    /**
     * 巡查单号
     */
    private String billCode;

    /**
     * 来源
     */
    private String source;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 执行人ID
     */
    private Integer implUserId;

    /**
     * 执行人ID集合
     */
    private List<Integer> implUserIdList;

    /**
     * 执行人
     */
    private String implUser;

    /**
     * 开始时间
     */
    private String startTime;

    private String startTimeFmt;

    /**
     * 接单时限
     */
    private String receivingTime;

    private String receivingTimeFmt;

    /**
     * 完成时限
     */
    private String completeTime;

    private String completeTimeFmt;

    /**
     * 推送时间
     */
    private String pushTime;

    private String pushTimeFmt;

    /**
     * 派单时间
     */
    private String deliveryTime;

    private String deliveryTimeFmt;

    /**
     * 接单时间
     */
    private String received;

    private String receivedFmt;

    /**
     * 完成时间
     */
    private String completed;

    private String completedFmt;

    /**
     * 巡查单任务ID
     */
    private Integer taskId;

    /**
     * 计划ID
     */
    private Integer planId;

    private BigDecimal completePercent;

    /**
     * 方案Id
     */
    private Integer programmeId;

    /**
     * 审批通过的时间
     */
    private String approvedTime;
}
