package com.ss.up.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Description: 推送模型
 * @Author: yf.ge
 * @Date: 2022/2/14 11:23
 */
@Data
public class PushModel implements Serializable {
    private static final long serialVersionUID = -401997139838231088L;

    /**
     * details 表主键
     */
    private Integer id;

    /**
     * 资源类型集合
     */
    private List<Integer> resTypeList;

    /**
     * 推送时间：4位 时分
     */
    private String pushTime;

    /**
     * 组织机构ID
     */
    private List<Integer> organIdList;

    /**
     * 1-资源闲置提醒
     * 2-资源空置提醒
     */
    private Integer remindType;

    /**
     * 用户ID逗号拼接
     */
    private String userIdStr;

    /**
     * 岗位ID逗号拼接
     */
    private String postIdStr;

    private Integer overTime;
}
