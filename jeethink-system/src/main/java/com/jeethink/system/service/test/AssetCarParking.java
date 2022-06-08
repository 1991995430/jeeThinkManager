package com.jeethink.system.service.test;

import lombok.Data;

@Data
public class AssetCarParking {

    /**
     * 车场id
     */
    private Integer placeId;

    /**
     * 车场名称
     */
    private String placeName;

    /**
     * 车场编码
     */
    private String placeCode;

    /**
     * 区域Id
     */
    private Integer parkingAreaId;

    /**
     * 区域名称
     */
    private String parkingAreaName;

    private Integer organId;

    //项目ID
    private Integer communityId;

    //项目名称
    private String communityName;

    //车场面积
    private String placeArea;

    //车场面积单位
    private String placeAreaUnit;

    //车位数量
    private Integer placeNums;
    //车场类型ID
    private Integer typeId;
    //车场类型名称
    private String typeName;
    //车场地址
    private String placeAddr;

    //区域名称
    private String areaName;
    //区域编码
    private String areaCode;
    //区域面积
    private String areaZone;
    //区域车位数
    private String areaPosiNums;

    /**
     * 坐落位置
     */
    private String pasitionString;

    /**
     * 详细地址
     */
    private String address;




}
