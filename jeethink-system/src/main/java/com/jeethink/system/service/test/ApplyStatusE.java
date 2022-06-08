package com.jeethink.system.service.test;

public enum ApplyStatusE {

    /**
     * 审批中
     */
    InApproval(1, "审批中"),
    /**
     * 审批通过
     */
    Approvaled(2,"审批通过"),
    /**
     * 审批驳回
     */
    Rejected(3,"审批驳回");

    private Integer id;

    private String name;

    ApplyStatusE(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static ApplyStatusE getById(Integer id){
        if(id == null){
            return null;
        }
        for(ApplyStatusE e : ApplyStatusE.values()){
            if(e.getId().equals(id)){
                return e;
            }
        }
        return null;
    }

    public static String getIdByCode(Integer code) {
        for(ApplyStatusE enums : ApplyStatusE.values())
        {
            if(enums.id.equals(code))
            {
                return enums.name;
            }
        }
        return "";
    }
}
