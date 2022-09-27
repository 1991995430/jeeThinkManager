package com.ss.up.enums;

/**
 * @author sungd
 * @date 2020/8/13
 */
public enum AddressE {
    HF(1, "安徽省合肥市"),
    BB(2, "安徽省蚌埠市"),
    WH(3, "安徽省芜湖市");

    AddressE(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public static AddressE getById(Integer id){
        if(id == null){
            return null;
        }
        for(AddressE e : AddressE.values()){
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
        for(AddressE enums : AddressE.values())
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
