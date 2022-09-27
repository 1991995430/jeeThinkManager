package com.ss.up.enums;

/**
 * 参数配置 业务类型
 *
 * @Author: ss
 * @Date: 2022/09/08 10:05
 */
public enum SystemServiceTypeE {
    PARK_SECTION_PROJECT_NAME_CHOOSE(2032,"车位模块，项目显示名称","0"),
    PARK_SECTION_DISPLAY_BELONG_PROJECT(2033,"车位模块，显示『归属项目』","0"),
    HOUSE_SECTION_RES_LEASE_CUSTOM_FIELD(2034,"房屋资源，资源租赁经营时自定义字段","0");

    SystemServiceTypeE(Integer id, String name, String defaultKey) {
        this.id = id;
        this.name = name;
        this.defaultKey = defaultKey;
    }

    public static SystemServiceTypeE getById(Integer id) {
        if (id == null) {
            return null;
        }
        for (SystemServiceTypeE e : SystemServiceTypeE.values()) {
            if (e.getId().equals(id)) {
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
    public static String getDescByCode(Integer code) {
        for (SystemServiceTypeE enums : SystemServiceTypeE.values()) {
            if (enums.id.equals(code)) {
                return enums.name;
            }
        }
        return "";
    }

    private Integer id;

    /**
     * 业务名称
     */
    private String name;

    /**
     * 默认值
     */
    private String defaultKey;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDefaultKey() {
        return defaultKey;
    }
}
