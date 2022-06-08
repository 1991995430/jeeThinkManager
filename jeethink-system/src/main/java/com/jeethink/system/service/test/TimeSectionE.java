package com.jeethink.system.service.test;

/**
 * 时间区间
 * @Author: zhoufeng
 * @Date: 2018/6/11 17:59
 */
public enum TimeSectionE {
    /**
     * 已逾期
     */
    Overdue(1, "已逾期"),
    /**
     * 1月内到期
     */
    OverdueInOneMonth(2, "1月内到期"),
    /**
     * 3月内到期
     */
    OverdueInThreeMonth(3,"3月内到期"),
    /**
     * 6月内到期
     */
    OverdueInSixMonth(4,"6月内到期"),
    /**
     * 12月内到期
     */
    OverdueInTwelveMonth(5,"12月内到期");

    TimeSectionE(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public static TimeSectionE getById(Integer id){
        if(id == null){
            return null;
        }
        for(TimeSectionE e : TimeSectionE.values()){
            if(e.getId().equals(id)){
                return e;
            }
        }
        return null;
    }

    /**
     * 根据Code获取Value
     *
     * @param code 键
     * @return 值
     */
    public static String getDescByCode(Integer code)
    {
        for(TimeSectionE enums : TimeSectionE.values())
        {
            if(enums.id.equals(code))
            {
                return enums.name;
            }
        }
        return "";
    }
    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
