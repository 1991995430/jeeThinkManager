package com.jeethink.common.utils;

/**
 * @author ss
 * @date 2022/07/05
 */
public class ResUseDirectionReportDto {

    private Long communityId;

    /**
     * 分公司名称
     */
    private String secondCompanyName;

    /**
     * 城市
     */
    private String city;

    /**
     * 已租
     */
    private Integer rentedCount;

    /**
     * 待租
     */
    private Integer unRentedCount;

    /**
     * 自用
     */
    private Integer helpOneselfCount;

    /**
     * 闲置(不可租)
     */
    private Integer idleCount;

    /**
     * 已租(标准)
     */
    private Integer rentedStandardCount;

    /**
     * 待租(标准)
     */
    private Integer unRentedStandardCount;

    /**
     * 自用(标准)
     */
    private Integer helpOneselfStandardCount;

    /**
     * 闲置(不可租)(标准)
     */
    private Integer idleStandardCount;

    public Long getCommunityId() {
        return communityId;
    }

    public void setCommunityId(Long communityId) {
        this.communityId = communityId;
    }

    public String getSecondCompanyName() {
        return secondCompanyName;
    }

    public void setSecondCompanyName(String secondCompanyName) {
        this.secondCompanyName = secondCompanyName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getRentedCount() {
        return rentedCount;
    }

    public void setRentedCount(Integer rentedCount) {
        this.rentedCount = rentedCount;
    }

    public Integer getUnRentedCount() {
        return unRentedCount;
    }

    public void setUnRentedCount(Integer unRentedCount) {
        this.unRentedCount = unRentedCount;
    }

    public Integer getHelpOneselfCount() {
        return helpOneselfCount;
    }

    public void setHelpOneselfCount(Integer helpOneselfCount) {
        this.helpOneselfCount = helpOneselfCount;
    }

    public Integer getIdleCount() {
        return idleCount;
    }

    public void setIdleCount(Integer idleCount) {
        this.idleCount = idleCount;
    }

    public Integer getRentedStandardCount() {
        return rentedStandardCount;
    }

    public void setRentedStandardCount(Integer rentedStandardCount) {
        this.rentedStandardCount = rentedStandardCount;
    }

    public Integer getUnRentedStandardCount() {
        return unRentedStandardCount;
    }

    public void setUnRentedStandardCount(Integer unRentedStandardCount) {
        this.unRentedStandardCount = unRentedStandardCount;
    }

    public Integer getHelpOneselfStandardCount() {
        return helpOneselfStandardCount;
    }

    public void setHelpOneselfStandardCount(Integer helpOneselfStandardCount) {
        this.helpOneselfStandardCount = helpOneselfStandardCount;
    }

    public Integer getIdleStandardCount() {
        return idleStandardCount;
    }

    public void setIdleStandardCount(Integer idleStandardCount) {
        this.idleStandardCount = idleStandardCount;
    }

    @Override
    public String toString() {
        return "ResUseDirectionReportDto{" +
                "communityId=" + communityId +
                ", secondCompanyName='" + secondCompanyName + '\'' +
                ", city='" + city + '\'' +
                ", rentedCount=" + rentedCount +
                ", unRentedCount=" + unRentedCount +
                ", helpOneselfCount=" + helpOneselfCount +
                ", idleCount=" + idleCount +
                ", rentedStandardCount=" + rentedStandardCount +
                ", unRentedStandardCount=" + unRentedStandardCount +
                ", helpOneselfStandardCount=" + helpOneselfStandardCount +
                ", idleStandardCount=" + idleStandardCount +
                '}';
    }
}
