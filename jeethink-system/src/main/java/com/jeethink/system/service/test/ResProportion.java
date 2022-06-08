package com.jeethink.system.service.test;

import lombok.Data;

@Data
public class ResProportion {
    // 资源类型(如：重点写字楼)
    private String resourceType;
    // 占比（单位：%）
    private String proportion;
    // 面积数（单位：万㎡）
    private String resourceArea;

    public ResProportion(String resourceType, String proportion, String resourceArea) {
        this.resourceType = resourceType;
        this.proportion = proportion;
        this.resourceArea = resourceArea;
    }

    public ResProportion() {
    }
}
