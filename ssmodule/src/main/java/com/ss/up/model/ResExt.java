package com.ss.up.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class ResExt implements Serializable {
    private Integer id;

    private Long resId;

    private Integer resType;

    private Long groupId;

    private Long communityId;

    private Integer resStyle;

    private BigDecimal billArea;

    private Integer billMode;

    private Integer leaseMode;

    private Integer resPurpose;

    private String resDesc;

    private Integer resSource;

    private Integer busiStatus;

    private Integer resStatus;

    private Integer leaseStatus;

    private Long prepDate;

    private String xpoint;

    private String ypoint;

    private String color;

    private Integer productLine;

    private Integer managementType;

    private Integer isWorkflow;

    private String brandTypeMain;

    private String brandTypeSub;

    private BigDecimal subLeaseArea;

    private Long createTime;

    private Integer createUserId;

    private String createUserName;

    private Long updateTime;

    private Integer updateUserId;

    private String updateUserName;

    private Integer organId;

    private String organName;

    private Integer positionId;

    private String positionName;

    private String resCode;

    private String resName;

    private Integer pointType;

    private Integer businessType;

    private Integer newUseDirection;

    private Long invalidTime;

    private Integer useDirection;

    private String priceUnit;

    private String feeUnit;

    private Integer feeAmount;

    private Integer chargeId;

    private String chargeName;

    private Long feePrice;

    private String cycle;

    private Long rentCost;

    private Long effectTime;

    private Integer buildId;

    private String buildName;

    private Integer unitId;

    private String unitName;

    private Integer floorId;

    private String floorName;

    private Integer sellStatus;

    private Long sellDate;

    private String purchasera;

    private Integer keepOrganId;

    private String keepOrganName;

    private String quitCause;

    private Integer soilType;

    private Integer soilMaxType;

    private Integer soilMinType;

    private Integer approvalStatus;

    private Integer applyId;

    private String houseType;

    private Integer liveNumber;

    private Integer liveSex;

    private Byte allotStatus;

    private Integer contractId;

    private Integer saleStatus;

    private String parkName;

    private Integer parkNameCode;

    private String parkDistrict;

    private Integer parkDistrictCode;

    private String objType;

    private Integer objTypeCode;

    private String parkLocalCode;

    private Integer firstId;

    private Integer firstGroupId;

    private String firstName;

    private BigDecimal area;

    private BigDecimal useArea;

    private Byte optStatus;

    private Integer lockReason;

    private BigDecimal landArea;

    private Integer oldManagementType;

    private Integer roomType;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getResId() {
        return resId;
    }

    public void setResId(Long resId) {
        this.resId = resId;
    }

    public Integer getResType() {
        return resType;
    }

    public void setResType(Integer resType) {
        this.resType = resType;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Long getCommunityId() {
        return communityId;
    }

    public void setCommunityId(Long communityId) {
        this.communityId = communityId;
    }

    public Integer getResStyle() {
        return resStyle;
    }

    public void setResStyle(Integer resStyle) {
        this.resStyle = resStyle;
    }

    public BigDecimal getBillArea() {
        return billArea;
    }

    public void setBillArea(BigDecimal billArea) {
        this.billArea = billArea;
    }

    public Integer getBillMode() {
        return billMode;
    }

    public void setBillMode(Integer billMode) {
        this.billMode = billMode;
    }

    public Integer getLeaseMode() {
        return leaseMode;
    }

    public void setLeaseMode(Integer leaseMode) {
        this.leaseMode = leaseMode;
    }

    public Integer getResPurpose() {
        return resPurpose;
    }

    public void setResPurpose(Integer resPurpose) {
        this.resPurpose = resPurpose;
    }

    public String getResDesc() {
        return resDesc;
    }

    public void setResDesc(String resDesc) {
        this.resDesc = resDesc == null ? null : resDesc.trim();
    }

    public Integer getResSource() {
        return resSource;
    }

    public void setResSource(Integer resSource) {
        this.resSource = resSource;
    }

    public Integer getBusiStatus() {
        return busiStatus;
    }

    public void setBusiStatus(Integer busiStatus) {
        this.busiStatus = busiStatus;
    }

    public Integer getResStatus() {
        return resStatus;
    }

    public void setResStatus(Integer resStatus) {
        this.resStatus = resStatus;
    }

    public Integer getLeaseStatus() {
        return leaseStatus;
    }

    public void setLeaseStatus(Integer leaseStatus) {
        this.leaseStatus = leaseStatus;
    }

    public Long getPrepDate() {
        return prepDate;
    }

    public void setPrepDate(Long prepDate) {
        this.prepDate = prepDate;
    }

    public String getXpoint() {
        return xpoint;
    }

    public void setXpoint(String xpoint) {
        this.xpoint = xpoint == null ? null : xpoint.trim();
    }

    public String getYpoint() {
        return ypoint;
    }

    public void setYpoint(String ypoint) {
        this.ypoint = ypoint == null ? null : ypoint.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public Integer getProductLine() {
        return productLine;
    }

    public void setProductLine(Integer productLine) {
        this.productLine = productLine;
    }

    public Integer getManagementType() {
        return managementType;
    }

    public void setManagementType(Integer managementType) {
        this.managementType = managementType;
    }

    public Integer getIsWorkflow() {
        return isWorkflow;
    }

    public void setIsWorkflow(Integer isWorkflow) {
        this.isWorkflow = isWorkflow;
    }

    public String getBrandTypeMain() {
        return brandTypeMain;
    }

    public void setBrandTypeMain(String brandTypeMain) {
        this.brandTypeMain = brandTypeMain == null ? null : brandTypeMain.trim();
    }

    public String getBrandTypeSub() {
        return brandTypeSub;
    }

    public void setBrandTypeSub(String brandTypeSub) {
        this.brandTypeSub = brandTypeSub == null ? null : brandTypeSub.trim();
    }

    public BigDecimal getSubLeaseArea() {
        return subLeaseArea;
    }

    public void setSubLeaseArea(BigDecimal subLeaseArea) {
        this.subLeaseArea = subLeaseArea;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName == null ? null : createUserName.trim();
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
    }

    public String getUpdateUserName() {
        return updateUserName;
    }

    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName == null ? null : updateUserName.trim();
    }

    public Integer getOrganId() {
        return organId;
    }

    public void setOrganId(Integer organId) {
        this.organId = organId;
    }

    public String getOrganName() {
        return organName;
    }

    public void setOrganName(String organName) {
        this.organName = organName == null ? null : organName.trim();
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName == null ? null : positionName.trim();
    }

    public String getResCode() {
        return resCode;
    }

    public void setResCode(String resCode) {
        this.resCode = resCode == null ? null : resCode.trim();
    }

    public String getResName() {
        return resName;
    }

    public void setResName(String resName) {
        this.resName = resName == null ? null : resName.trim();
    }

    public Integer getPointType() {
        return pointType;
    }

    public void setPointType(Integer pointType) {
        this.pointType = pointType;
    }

    public Integer getBusinessType() {
        return businessType;
    }

    public void setBusinessType(Integer businessType) {
        this.businessType = businessType;
    }

    public Integer getNewUseDirection() {
        return newUseDirection;
    }

    public void setNewUseDirection(Integer newUseDirection) {
        this.newUseDirection = newUseDirection;
    }

    public Long getInvalidTime() {
        return invalidTime;
    }

    public void setInvalidTime(Long invalidTime) {
        this.invalidTime = invalidTime;
    }

    public Integer getUseDirection() {
        return useDirection;
    }

    public void setUseDirection(Integer useDirection) {
        this.useDirection = useDirection;
    }

    public String getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(String priceUnit) {
        this.priceUnit = priceUnit == null ? null : priceUnit.trim();
    }

    public String getFeeUnit() {
        return feeUnit;
    }

    public void setFeeUnit(String feeUnit) {
        this.feeUnit = feeUnit == null ? null : feeUnit.trim();
    }

    public Integer getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(Integer feeAmount) {
        this.feeAmount = feeAmount;
    }

    public Integer getChargeId() {
        return chargeId;
    }

    public void setChargeId(Integer chargeId) {
        this.chargeId = chargeId;
    }

    public String getChargeName() {
        return chargeName;
    }

    public void setChargeName(String chargeName) {
        this.chargeName = chargeName == null ? null : chargeName.trim();
    }

    public Long getFeePrice() {
        return feePrice;
    }

    public void setFeePrice(Long feePrice) {
        this.feePrice = feePrice;
    }

    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle == null ? null : cycle.trim();
    }

    public Long getRentCost() {
        return rentCost;
    }

    public void setRentCost(Long rentCost) {
        this.rentCost = rentCost;
    }

    public Long getEffectTime() {
        return effectTime;
    }

    public void setEffectTime(Long effectTime) {
        this.effectTime = effectTime;
    }

    public Integer getBuildId() {
        return buildId;
    }

    public void setBuildId(Integer buildId) {
        this.buildId = buildId;
    }

    public String getBuildName() {
        return buildName;
    }

    public void setBuildName(String buildName) {
        this.buildName = buildName == null ? null : buildName.trim();
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName == null ? null : unitName.trim();
    }

    public Integer getFloorId() {
        return floorId;
    }

    public void setFloorId(Integer floorId) {
        this.floorId = floorId;
    }

    public String getFloorName() {
        return floorName;
    }

    public void setFloorName(String floorName) {
        this.floorName = floorName == null ? null : floorName.trim();
    }

    public Integer getSellStatus() {
        return sellStatus;
    }

    public void setSellStatus(Integer sellStatus) {
        this.sellStatus = sellStatus;
    }

    public Long getSellDate() {
        return sellDate;
    }

    public void setSellDate(Long sellDate) {
        this.sellDate = sellDate;
    }

    public String getPurchasera() {
        return purchasera;
    }

    public void setPurchasera(String purchasera) {
        this.purchasera = purchasera == null ? null : purchasera.trim();
    }

    public Integer getKeepOrganId() {
        return keepOrganId;
    }

    public void setKeepOrganId(Integer keepOrganId) {
        this.keepOrganId = keepOrganId;
    }

    public String getKeepOrganName() {
        return keepOrganName;
    }

    public void setKeepOrganName(String keepOrganName) {
        this.keepOrganName = keepOrganName == null ? null : keepOrganName.trim();
    }

    public String getQuitCause() {
        return quitCause;
    }

    public void setQuitCause(String quitCause) {
        this.quitCause = quitCause == null ? null : quitCause.trim();
    }

    public Integer getSoilType() {
        return soilType;
    }

    public void setSoilType(Integer soilType) {
        this.soilType = soilType;
    }

    public Integer getSoilMaxType() {
        return soilMaxType;
    }

    public void setSoilMaxType(Integer soilMaxType) {
        this.soilMaxType = soilMaxType;
    }

    public Integer getSoilMinType() {
        return soilMinType;
    }

    public void setSoilMinType(Integer soilMinType) {
        this.soilMinType = soilMinType;
    }

    public Integer getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(Integer approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public Integer getApplyId() {
        return applyId;
    }

    public void setApplyId(Integer applyId) {
        this.applyId = applyId;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType == null ? null : houseType.trim();
    }

    public Integer getLiveNumber() {
        return liveNumber;
    }

    public void setLiveNumber(Integer liveNumber) {
        this.liveNumber = liveNumber;
    }

    public Integer getLiveSex() {
        return liveSex;
    }

    public void setLiveSex(Integer liveSex) {
        this.liveSex = liveSex;
    }

    public Byte getAllotStatus() {
        return allotStatus;
    }

    public void setAllotStatus(Byte allotStatus) {
        this.allotStatus = allotStatus;
    }

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public Integer getSaleStatus() {
        return saleStatus;
    }

    public void setSaleStatus(Integer saleStatus) {
        this.saleStatus = saleStatus;
    }

    public String getParkName() {
        return parkName;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName == null ? null : parkName.trim();
    }

    public Integer getParkNameCode() {
        return parkNameCode;
    }

    public void setParkNameCode(Integer parkNameCode) {
        this.parkNameCode = parkNameCode;
    }

    public String getParkDistrict() {
        return parkDistrict;
    }

    public void setParkDistrict(String parkDistrict) {
        this.parkDistrict = parkDistrict == null ? null : parkDistrict.trim();
    }

    public Integer getParkDistrictCode() {
        return parkDistrictCode;
    }

    public void setParkDistrictCode(Integer parkDistrictCode) {
        this.parkDistrictCode = parkDistrictCode;
    }

    public String getObjType() {
        return objType;
    }

    public void setObjType(String objType) {
        this.objType = objType == null ? null : objType.trim();
    }

    public Integer getObjTypeCode() {
        return objTypeCode;
    }

    public void setObjTypeCode(Integer objTypeCode) {
        this.objTypeCode = objTypeCode;
    }

    public String getParkLocalCode() {
        return parkLocalCode;
    }

    public void setParkLocalCode(String parkLocalCode) {
        this.parkLocalCode = parkLocalCode == null ? null : parkLocalCode.trim();
    }

    public Integer getFirstId() {
        return firstId;
    }

    public void setFirstId(Integer firstId) {
        this.firstId = firstId;
    }

    public Integer getFirstGroupId() {
        return firstGroupId;
    }

    public void setFirstGroupId(Integer firstGroupId) {
        this.firstGroupId = firstGroupId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? null : firstName.trim();
    }

    public BigDecimal getArea() {
        return area;
    }

    public void setArea(BigDecimal area) {
        this.area = area;
    }

    public BigDecimal getUseArea() {
        return useArea;
    }

    public void setUseArea(BigDecimal useArea) {
        this.useArea = useArea;
    }

    public Byte getOptStatus() {
        return optStatus;
    }

    public void setOptStatus(Byte optStatus) {
        this.optStatus = optStatus;
    }

    public Integer getLockReason() {
        return lockReason;
    }

    public void setLockReason(Integer lockReason) {
        this.lockReason = lockReason;
    }

    public BigDecimal getLandArea() {
        return landArea;
    }

    public void setLandArea(BigDecimal landArea) {
        this.landArea = landArea;
    }

    public Integer getOldManagementType() {
        return oldManagementType;
    }

    public void setOldManagementType(Integer oldManagementType) {
        this.oldManagementType = oldManagementType;
    }

    public Integer getRoomType() {
        return roomType;
    }

    public void setRoomType(Integer roomType) {
        this.roomType = roomType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", resId=").append(resId);
        sb.append(", resType=").append(resType);
        sb.append(", groupId=").append(groupId);
        sb.append(", communityId=").append(communityId);
        sb.append(", resStyle=").append(resStyle);
        sb.append(", billArea=").append(billArea);
        sb.append(", billMode=").append(billMode);
        sb.append(", leaseMode=").append(leaseMode);
        sb.append(", resPurpose=").append(resPurpose);
        sb.append(", resDesc=").append(resDesc);
        sb.append(", resSource=").append(resSource);
        sb.append(", busiStatus=").append(busiStatus);
        sb.append(", resStatus=").append(resStatus);
        sb.append(", leaseStatus=").append(leaseStatus);
        sb.append(", prepDate=").append(prepDate);
        sb.append(", xpoint=").append(xpoint);
        sb.append(", ypoint=").append(ypoint);
        sb.append(", color=").append(color);
        sb.append(", productLine=").append(productLine);
        sb.append(", managementType=").append(managementType);
        sb.append(", isWorkflow=").append(isWorkflow);
        sb.append(", brandTypeMain=").append(brandTypeMain);
        sb.append(", brandTypeSub=").append(brandTypeSub);
        sb.append(", subLeaseArea=").append(subLeaseArea);
        sb.append(", createTime=").append(createTime);
        sb.append(", createUserId=").append(createUserId);
        sb.append(", createUserName=").append(createUserName);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateUserId=").append(updateUserId);
        sb.append(", updateUserName=").append(updateUserName);
        sb.append(", organId=").append(organId);
        sb.append(", organName=").append(organName);
        sb.append(", positionId=").append(positionId);
        sb.append(", positionName=").append(positionName);
        sb.append(", resCode=").append(resCode);
        sb.append(", resName=").append(resName);
        sb.append(", pointType=").append(pointType);
        sb.append(", businessType=").append(businessType);
        sb.append(", newUseDirection=").append(newUseDirection);
        sb.append(", invalidTime=").append(invalidTime);
        sb.append(", useDirection=").append(useDirection);
        sb.append(", priceUnit=").append(priceUnit);
        sb.append(", feeUnit=").append(feeUnit);
        sb.append(", feeAmount=").append(feeAmount);
        sb.append(", chargeId=").append(chargeId);
        sb.append(", chargeName=").append(chargeName);
        sb.append(", feePrice=").append(feePrice);
        sb.append(", cycle=").append(cycle);
        sb.append(", rentCost=").append(rentCost);
        sb.append(", effectTime=").append(effectTime);
        sb.append(", buildId=").append(buildId);
        sb.append(", buildName=").append(buildName);
        sb.append(", unitId=").append(unitId);
        sb.append(", unitName=").append(unitName);
        sb.append(", floorId=").append(floorId);
        sb.append(", floorName=").append(floorName);
        sb.append(", sellStatus=").append(sellStatus);
        sb.append(", sellDate=").append(sellDate);
        sb.append(", purchasera=").append(purchasera);
        sb.append(", keepOrganId=").append(keepOrganId);
        sb.append(", keepOrganName=").append(keepOrganName);
        sb.append(", quitCause=").append(quitCause);
        sb.append(", soilType=").append(soilType);
        sb.append(", soilMaxType=").append(soilMaxType);
        sb.append(", soilMinType=").append(soilMinType);
        sb.append(", approvalStatus=").append(approvalStatus);
        sb.append(", applyId=").append(applyId);
        sb.append(", houseType=").append(houseType);
        sb.append(", liveNumber=").append(liveNumber);
        sb.append(", liveSex=").append(liveSex);
        sb.append(", allotStatus=").append(allotStatus);
        sb.append(", contractId=").append(contractId);
        sb.append(", saleStatus=").append(saleStatus);
        sb.append(", parkName=").append(parkName);
        sb.append(", parkNameCode=").append(parkNameCode);
        sb.append(", parkDistrict=").append(parkDistrict);
        sb.append(", parkDistrictCode=").append(parkDistrictCode);
        sb.append(", objType=").append(objType);
        sb.append(", objTypeCode=").append(objTypeCode);
        sb.append(", parkLocalCode=").append(parkLocalCode);
        sb.append(", firstId=").append(firstId);
        sb.append(", firstGroupId=").append(firstGroupId);
        sb.append(", firstName=").append(firstName);
        sb.append(", area=").append(area);
        sb.append(", useArea=").append(useArea);
        sb.append(", optStatus=").append(optStatus);
        sb.append(", lockReason=").append(lockReason);
        sb.append(", landArea=").append(landArea);
        sb.append(", oldManagementType=").append(oldManagementType);
        sb.append(", roomType=").append(roomType);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}