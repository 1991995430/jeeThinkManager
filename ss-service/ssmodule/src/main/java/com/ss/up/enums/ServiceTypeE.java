package com.ss.up.enums;

/**
 * 参数配置 业务类型
 *
 * @Author: pengjj
 * @Date: 2018/6/25 10:05
 */
public enum ServiceTypeE {
    ResourceSplitApproval(1020, "资源拆分审批", "0"),
    ResourceMergeApproval(1021, "资源合并审批", "0"),
    ResourceForUseApproval(1024, "资源自用审批", "0"),
    ResourceQuitApproval(1025, "退出经营审批", "0"),
    BrandAddApproval(1064, "品牌新增审批", "0"),
    BrandUpdateApproval(1065, "品牌变更审批", "0"),
    BrandTypeAdjust(1063, "资源业态调整", "0"),
    UseAreaControl(1100, "使用面积控制", "0"),
    LeaseManage(2001, "房屋租赁经营审批", "0"),
    ResourceSell(2009, "房屋销售经营审批", "0"),
    SoilManage(2010, "土地租赁经营审批", "0"),
    SoilSelf(2011, "土地自用设置审批", "0"),
    SoilQuitManage(2012, "土地退出经营审批", "0"),
    FieldManage(2013, "场地租赁经营审批", "0"),
    FieldQuitManage(2014, "场地退出经营审批", "0"),
    FIELD_HELP_ONESELF(2101,"场地自用审批","0"),
    AdvertManage(2015, "广告位租赁经营审批", "0"),
    AdvertQuitManage(2016, "广告位退出经营审批", "0"),
    ADVERTISE_HELP_ONESELF(2102,"广告位自用审批","0"),
    ResPricing(2019, "没有政策定价的资源允许单独定价", "0"),
    ParkingRegisterCostAccount(2020, "车位销控登记费用科目", "0"),
    ParkingSale(3001, "车场销售审批", "0"),
    HouseDiscountLabel(5001, "房屋调价标签审批", "0"),
    FieldDiscountLabel(5002, "场地调价标签审批", "0"),
    AdvertisingDiscountLabel(5003, "广告调价标签审批", "0"),
    ParkingDiscountLabel(5004, "车位调价标签审批", "0"),
    SoilDiscountLabel(5005, "土地调价标签审批", "0"),
    PricingInvoices(5006, "资源定价单审批", "0"),
    ResPircingPolicy(5007, "资源政策审批", "0"),
    ResPricingPolicyStart(5008, "资源政策启用", "0"),
    ResPricingPolicyStop(5009, "资源政策停用", "0"),
    Strategy(5010, "资源调价策略审批", "0"),
    StrategyStart(5011, "资源调价策略启用", "0"),
    StrategyStop(5012, "资源调价策略停用", "0"),
    RENTAL_PRICE_SETTING(5013, "资源设定续签价", "0"),
    RENOVATION_CONDITION_PUBLIC_PRICE(5014, "房屋按装修情况设定对外报价", "0"),
    ParkingLease(2022, "车位租赁经营审批", "0"),
    ParkingSell(2023, "车位销售经营审批", "0"),
    ParkingHelpOneself(2024, "车位自用设置审批", "0"),
    ParkingQuit(2025, "车位退出经营审批", "0"),
    LeaseManagementExamination(2026, "租赁经营考核方式", "0"),
    HouseMergeSpiltParams(2027, "房屋可拆分合并面积", "0"),
    ResAutoSelect(2028, "资源自动选用", "0"),
    RsAssessmentReportCreate(6001, "新建资源评估报告审批", "0"),
    RsAssessmentReportCancelled(6002, "作废资源评估报告审批", "0"),
    RENT_APPLY(7001, "新增出租申请审批", "0"),
    ASSESS_APPLY(7002, "新增评估申请审批", "0"),
    RsPreferentialPolicyCreate(8001,"新建优惠政策审批","0"),
    RsPreferentialPolicyCanceled(8002,"作废优惠政策审批","0"),
    WHETHER_TO_INHERIT_PRICING_INVOICES(2029,"继承拆分前资源的定价信息","0"),
    LOCK_RESOURCE_LEASE_ASSESSMENT(2030,"挂起资源租赁考核","0"),
    LIVING_SECTION_LEASE_ASSESSMENT(2031,"资源盘活区间租赁考核","0"),  // 注：id 2032 2033 2034已被占用
    ENTRY_EARLY_WARNING(2035,"评估机构进场后预警天数","0");  // 注：id 2032 2033 2034已被占用

    ServiceTypeE(Integer id, String name, String defaultKey) {
        this.id = id;
        this.name = name;
        this.defaultKey = defaultKey;
    }

    public static ServiceTypeE getById(Integer id) {
        if (id == null) {
            return null;
        }
        for (ServiceTypeE e : ServiceTypeE.values()) {
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
        for (ServiceTypeE enums : ServiceTypeE.values()) {
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
