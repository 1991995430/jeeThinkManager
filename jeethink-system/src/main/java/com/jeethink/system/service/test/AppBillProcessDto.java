package com.jeethink.system.service.test;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description: 流程模型
 * @Author: yf.ge
 * @Date: 2021/9/2 15:04
 */
@Data
public class AppBillProcessDto implements Serializable {
    private static final long serialVersionUID = 6827447716639204325L;


    /**
     * 流程操作人名称
     */
    private String userName;

    /**
     * 流程类型 接单 转单 催办 撤销 完成
     */
    private String processType;

    /**
     * 流程内容
     */
    private String content;

    /**
     * 流程说明
     */
    private String processInfo;

    /**
     * 时间
     */
    private String createTime;

    private Integer isNeed;

    public AppBillProcessDto() {
    }

    public AppBillProcessDto(String userName, String processType, String content, String processInfo, String createTime, Integer isNeed) {
        this.userName = userName;
        this.processType = processType;
        this.content = content;
        this.processInfo = processInfo;
        this.createTime = createTime;
        this.isNeed = isNeed;
    }
}
