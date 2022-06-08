package com.jeethink.system.service.test;

/**
 * @Author: geyunfei
 * @Date:
 */
public enum BillStatusE {
    Wait(1, "待接单"),
    Handle(2, "处理中"),
    Complete(3, "已完成"),
    Revoked(4, "已撤销"),
    Draft(5, "草稿"),
    Revoking(6, "撤销审批中");

    BillStatusE(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public static BillStatusE getById(Integer id){
        if(id == null){
            return null;
        }
        for(BillStatusE e : BillStatusE.values()){
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
        for(BillStatusE enums : BillStatusE.values())
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
