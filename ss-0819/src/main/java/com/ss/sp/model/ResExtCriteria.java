package com.ss.sp.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ResExtCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResExtCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andResIdIsNull() {
            addCriterion("RES_ID is null");
            return (Criteria) this;
        }

        public Criteria andResIdIsNotNull() {
            addCriterion("RES_ID is not null");
            return (Criteria) this;
        }

        public Criteria andResIdEqualTo(Long value) {
            addCriterion("RES_ID =", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdNotEqualTo(Long value) {
            addCriterion("RES_ID <>", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdGreaterThan(Long value) {
            addCriterion("RES_ID >", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdGreaterThanOrEqualTo(Long value) {
            addCriterion("RES_ID >=", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdLessThan(Long value) {
            addCriterion("RES_ID <", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdLessThanOrEqualTo(Long value) {
            addCriterion("RES_ID <=", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdIn(List<Long> values) {
            addCriterion("RES_ID in", values, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdNotIn(List<Long> values) {
            addCriterion("RES_ID not in", values, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdBetween(Long value1, Long value2) {
            addCriterion("RES_ID between", value1, value2, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdNotBetween(Long value1, Long value2) {
            addCriterion("RES_ID not between", value1, value2, "resId");
            return (Criteria) this;
        }

        public Criteria andResTypeIsNull() {
            addCriterion("RES_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andResTypeIsNotNull() {
            addCriterion("RES_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andResTypeEqualTo(Integer value) {
            addCriterion("RES_TYPE =", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeNotEqualTo(Integer value) {
            addCriterion("RES_TYPE <>", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeGreaterThan(Integer value) {
            addCriterion("RES_TYPE >", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("RES_TYPE >=", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeLessThan(Integer value) {
            addCriterion("RES_TYPE <", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeLessThanOrEqualTo(Integer value) {
            addCriterion("RES_TYPE <=", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeIn(List<Integer> values) {
            addCriterion("RES_TYPE in", values, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeNotIn(List<Integer> values) {
            addCriterion("RES_TYPE not in", values, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeBetween(Integer value1, Integer value2) {
            addCriterion("RES_TYPE between", value1, value2, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("RES_TYPE not between", value1, value2, "resType");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNull() {
            addCriterion("GROUP_ID is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("GROUP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(Long value) {
            addCriterion("GROUP_ID =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(Long value) {
            addCriterion("GROUP_ID <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(Long value) {
            addCriterion("GROUP_ID >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(Long value) {
            addCriterion("GROUP_ID >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(Long value) {
            addCriterion("GROUP_ID <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(Long value) {
            addCriterion("GROUP_ID <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<Long> values) {
            addCriterion("GROUP_ID in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<Long> values) {
            addCriterion("GROUP_ID not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(Long value1, Long value2) {
            addCriterion("GROUP_ID between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(Long value1, Long value2) {
            addCriterion("GROUP_ID not between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdIsNull() {
            addCriterion("COMMUNITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCommunityIdIsNotNull() {
            addCriterion("COMMUNITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCommunityIdEqualTo(Long value) {
            addCriterion("COMMUNITY_ID =", value, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdNotEqualTo(Long value) {
            addCriterion("COMMUNITY_ID <>", value, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdGreaterThan(Long value) {
            addCriterion("COMMUNITY_ID >", value, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("COMMUNITY_ID >=", value, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdLessThan(Long value) {
            addCriterion("COMMUNITY_ID <", value, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdLessThanOrEqualTo(Long value) {
            addCriterion("COMMUNITY_ID <=", value, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdIn(List<Long> values) {
            addCriterion("COMMUNITY_ID in", values, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdNotIn(List<Long> values) {
            addCriterion("COMMUNITY_ID not in", values, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdBetween(Long value1, Long value2) {
            addCriterion("COMMUNITY_ID between", value1, value2, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdNotBetween(Long value1, Long value2) {
            addCriterion("COMMUNITY_ID not between", value1, value2, "communityId");
            return (Criteria) this;
        }

        public Criteria andResStyleIsNull() {
            addCriterion("RES_STYLE is null");
            return (Criteria) this;
        }

        public Criteria andResStyleIsNotNull() {
            addCriterion("RES_STYLE is not null");
            return (Criteria) this;
        }

        public Criteria andResStyleEqualTo(Integer value) {
            addCriterion("RES_STYLE =", value, "resStyle");
            return (Criteria) this;
        }

        public Criteria andResStyleNotEqualTo(Integer value) {
            addCriterion("RES_STYLE <>", value, "resStyle");
            return (Criteria) this;
        }

        public Criteria andResStyleGreaterThan(Integer value) {
            addCriterion("RES_STYLE >", value, "resStyle");
            return (Criteria) this;
        }

        public Criteria andResStyleGreaterThanOrEqualTo(Integer value) {
            addCriterion("RES_STYLE >=", value, "resStyle");
            return (Criteria) this;
        }

        public Criteria andResStyleLessThan(Integer value) {
            addCriterion("RES_STYLE <", value, "resStyle");
            return (Criteria) this;
        }

        public Criteria andResStyleLessThanOrEqualTo(Integer value) {
            addCriterion("RES_STYLE <=", value, "resStyle");
            return (Criteria) this;
        }

        public Criteria andResStyleIn(List<Integer> values) {
            addCriterion("RES_STYLE in", values, "resStyle");
            return (Criteria) this;
        }

        public Criteria andResStyleNotIn(List<Integer> values) {
            addCriterion("RES_STYLE not in", values, "resStyle");
            return (Criteria) this;
        }

        public Criteria andResStyleBetween(Integer value1, Integer value2) {
            addCriterion("RES_STYLE between", value1, value2, "resStyle");
            return (Criteria) this;
        }

        public Criteria andResStyleNotBetween(Integer value1, Integer value2) {
            addCriterion("RES_STYLE not between", value1, value2, "resStyle");
            return (Criteria) this;
        }

        public Criteria andBillAreaIsNull() {
            addCriterion("BILL_AREA is null");
            return (Criteria) this;
        }

        public Criteria andBillAreaIsNotNull() {
            addCriterion("BILL_AREA is not null");
            return (Criteria) this;
        }

        public Criteria andBillAreaEqualTo(BigDecimal value) {
            addCriterion("BILL_AREA =", value, "billArea");
            return (Criteria) this;
        }

        public Criteria andBillAreaNotEqualTo(BigDecimal value) {
            addCriterion("BILL_AREA <>", value, "billArea");
            return (Criteria) this;
        }

        public Criteria andBillAreaGreaterThan(BigDecimal value) {
            addCriterion("BILL_AREA >", value, "billArea");
            return (Criteria) this;
        }

        public Criteria andBillAreaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BILL_AREA >=", value, "billArea");
            return (Criteria) this;
        }

        public Criteria andBillAreaLessThan(BigDecimal value) {
            addCriterion("BILL_AREA <", value, "billArea");
            return (Criteria) this;
        }

        public Criteria andBillAreaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BILL_AREA <=", value, "billArea");
            return (Criteria) this;
        }

        public Criteria andBillAreaIn(List<BigDecimal> values) {
            addCriterion("BILL_AREA in", values, "billArea");
            return (Criteria) this;
        }

        public Criteria andBillAreaNotIn(List<BigDecimal> values) {
            addCriterion("BILL_AREA not in", values, "billArea");
            return (Criteria) this;
        }

        public Criteria andBillAreaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BILL_AREA between", value1, value2, "billArea");
            return (Criteria) this;
        }

        public Criteria andBillAreaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BILL_AREA not between", value1, value2, "billArea");
            return (Criteria) this;
        }

        public Criteria andBillModeIsNull() {
            addCriterion("BILL_MODE is null");
            return (Criteria) this;
        }

        public Criteria andBillModeIsNotNull() {
            addCriterion("BILL_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andBillModeEqualTo(Integer value) {
            addCriterion("BILL_MODE =", value, "billMode");
            return (Criteria) this;
        }

        public Criteria andBillModeNotEqualTo(Integer value) {
            addCriterion("BILL_MODE <>", value, "billMode");
            return (Criteria) this;
        }

        public Criteria andBillModeGreaterThan(Integer value) {
            addCriterion("BILL_MODE >", value, "billMode");
            return (Criteria) this;
        }

        public Criteria andBillModeGreaterThanOrEqualTo(Integer value) {
            addCriterion("BILL_MODE >=", value, "billMode");
            return (Criteria) this;
        }

        public Criteria andBillModeLessThan(Integer value) {
            addCriterion("BILL_MODE <", value, "billMode");
            return (Criteria) this;
        }

        public Criteria andBillModeLessThanOrEqualTo(Integer value) {
            addCriterion("BILL_MODE <=", value, "billMode");
            return (Criteria) this;
        }

        public Criteria andBillModeIn(List<Integer> values) {
            addCriterion("BILL_MODE in", values, "billMode");
            return (Criteria) this;
        }

        public Criteria andBillModeNotIn(List<Integer> values) {
            addCriterion("BILL_MODE not in", values, "billMode");
            return (Criteria) this;
        }

        public Criteria andBillModeBetween(Integer value1, Integer value2) {
            addCriterion("BILL_MODE between", value1, value2, "billMode");
            return (Criteria) this;
        }

        public Criteria andBillModeNotBetween(Integer value1, Integer value2) {
            addCriterion("BILL_MODE not between", value1, value2, "billMode");
            return (Criteria) this;
        }

        public Criteria andLeaseModeIsNull() {
            addCriterion("LEASE_MODE is null");
            return (Criteria) this;
        }

        public Criteria andLeaseModeIsNotNull() {
            addCriterion("LEASE_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andLeaseModeEqualTo(Integer value) {
            addCriterion("LEASE_MODE =", value, "leaseMode");
            return (Criteria) this;
        }

        public Criteria andLeaseModeNotEqualTo(Integer value) {
            addCriterion("LEASE_MODE <>", value, "leaseMode");
            return (Criteria) this;
        }

        public Criteria andLeaseModeGreaterThan(Integer value) {
            addCriterion("LEASE_MODE >", value, "leaseMode");
            return (Criteria) this;
        }

        public Criteria andLeaseModeGreaterThanOrEqualTo(Integer value) {
            addCriterion("LEASE_MODE >=", value, "leaseMode");
            return (Criteria) this;
        }

        public Criteria andLeaseModeLessThan(Integer value) {
            addCriterion("LEASE_MODE <", value, "leaseMode");
            return (Criteria) this;
        }

        public Criteria andLeaseModeLessThanOrEqualTo(Integer value) {
            addCriterion("LEASE_MODE <=", value, "leaseMode");
            return (Criteria) this;
        }

        public Criteria andLeaseModeIn(List<Integer> values) {
            addCriterion("LEASE_MODE in", values, "leaseMode");
            return (Criteria) this;
        }

        public Criteria andLeaseModeNotIn(List<Integer> values) {
            addCriterion("LEASE_MODE not in", values, "leaseMode");
            return (Criteria) this;
        }

        public Criteria andLeaseModeBetween(Integer value1, Integer value2) {
            addCriterion("LEASE_MODE between", value1, value2, "leaseMode");
            return (Criteria) this;
        }

        public Criteria andLeaseModeNotBetween(Integer value1, Integer value2) {
            addCriterion("LEASE_MODE not between", value1, value2, "leaseMode");
            return (Criteria) this;
        }

        public Criteria andResPurposeIsNull() {
            addCriterion("RES_PURPOSE is null");
            return (Criteria) this;
        }

        public Criteria andResPurposeIsNotNull() {
            addCriterion("RES_PURPOSE is not null");
            return (Criteria) this;
        }

        public Criteria andResPurposeEqualTo(Integer value) {
            addCriterion("RES_PURPOSE =", value, "resPurpose");
            return (Criteria) this;
        }

        public Criteria andResPurposeNotEqualTo(Integer value) {
            addCriterion("RES_PURPOSE <>", value, "resPurpose");
            return (Criteria) this;
        }

        public Criteria andResPurposeGreaterThan(Integer value) {
            addCriterion("RES_PURPOSE >", value, "resPurpose");
            return (Criteria) this;
        }

        public Criteria andResPurposeGreaterThanOrEqualTo(Integer value) {
            addCriterion("RES_PURPOSE >=", value, "resPurpose");
            return (Criteria) this;
        }

        public Criteria andResPurposeLessThan(Integer value) {
            addCriterion("RES_PURPOSE <", value, "resPurpose");
            return (Criteria) this;
        }

        public Criteria andResPurposeLessThanOrEqualTo(Integer value) {
            addCriterion("RES_PURPOSE <=", value, "resPurpose");
            return (Criteria) this;
        }

        public Criteria andResPurposeIn(List<Integer> values) {
            addCriterion("RES_PURPOSE in", values, "resPurpose");
            return (Criteria) this;
        }

        public Criteria andResPurposeNotIn(List<Integer> values) {
            addCriterion("RES_PURPOSE not in", values, "resPurpose");
            return (Criteria) this;
        }

        public Criteria andResPurposeBetween(Integer value1, Integer value2) {
            addCriterion("RES_PURPOSE between", value1, value2, "resPurpose");
            return (Criteria) this;
        }

        public Criteria andResPurposeNotBetween(Integer value1, Integer value2) {
            addCriterion("RES_PURPOSE not between", value1, value2, "resPurpose");
            return (Criteria) this;
        }

        public Criteria andResDescIsNull() {
            addCriterion("RES_DESC is null");
            return (Criteria) this;
        }

        public Criteria andResDescIsNotNull() {
            addCriterion("RES_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andResDescEqualTo(String value) {
            addCriterion("RES_DESC =", value, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescNotEqualTo(String value) {
            addCriterion("RES_DESC <>", value, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescGreaterThan(String value) {
            addCriterion("RES_DESC >", value, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescGreaterThanOrEqualTo(String value) {
            addCriterion("RES_DESC >=", value, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescLessThan(String value) {
            addCriterion("RES_DESC <", value, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescLessThanOrEqualTo(String value) {
            addCriterion("RES_DESC <=", value, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescLike(String value) {
            addCriterion("RES_DESC like", value, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescNotLike(String value) {
            addCriterion("RES_DESC not like", value, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescIn(List<String> values) {
            addCriterion("RES_DESC in", values, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescNotIn(List<String> values) {
            addCriterion("RES_DESC not in", values, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescBetween(String value1, String value2) {
            addCriterion("RES_DESC between", value1, value2, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescNotBetween(String value1, String value2) {
            addCriterion("RES_DESC not between", value1, value2, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResSourceIsNull() {
            addCriterion("RES_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andResSourceIsNotNull() {
            addCriterion("RES_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andResSourceEqualTo(Integer value) {
            addCriterion("RES_SOURCE =", value, "resSource");
            return (Criteria) this;
        }

        public Criteria andResSourceNotEqualTo(Integer value) {
            addCriterion("RES_SOURCE <>", value, "resSource");
            return (Criteria) this;
        }

        public Criteria andResSourceGreaterThan(Integer value) {
            addCriterion("RES_SOURCE >", value, "resSource");
            return (Criteria) this;
        }

        public Criteria andResSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("RES_SOURCE >=", value, "resSource");
            return (Criteria) this;
        }

        public Criteria andResSourceLessThan(Integer value) {
            addCriterion("RES_SOURCE <", value, "resSource");
            return (Criteria) this;
        }

        public Criteria andResSourceLessThanOrEqualTo(Integer value) {
            addCriterion("RES_SOURCE <=", value, "resSource");
            return (Criteria) this;
        }

        public Criteria andResSourceIn(List<Integer> values) {
            addCriterion("RES_SOURCE in", values, "resSource");
            return (Criteria) this;
        }

        public Criteria andResSourceNotIn(List<Integer> values) {
            addCriterion("RES_SOURCE not in", values, "resSource");
            return (Criteria) this;
        }

        public Criteria andResSourceBetween(Integer value1, Integer value2) {
            addCriterion("RES_SOURCE between", value1, value2, "resSource");
            return (Criteria) this;
        }

        public Criteria andResSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("RES_SOURCE not between", value1, value2, "resSource");
            return (Criteria) this;
        }

        public Criteria andBusiStatusIsNull() {
            addCriterion("BUSI_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andBusiStatusIsNotNull() {
            addCriterion("BUSI_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andBusiStatusEqualTo(Integer value) {
            addCriterion("BUSI_STATUS =", value, "busiStatus");
            return (Criteria) this;
        }

        public Criteria andBusiStatusNotEqualTo(Integer value) {
            addCriterion("BUSI_STATUS <>", value, "busiStatus");
            return (Criteria) this;
        }

        public Criteria andBusiStatusGreaterThan(Integer value) {
            addCriterion("BUSI_STATUS >", value, "busiStatus");
            return (Criteria) this;
        }

        public Criteria andBusiStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("BUSI_STATUS >=", value, "busiStatus");
            return (Criteria) this;
        }

        public Criteria andBusiStatusLessThan(Integer value) {
            addCriterion("BUSI_STATUS <", value, "busiStatus");
            return (Criteria) this;
        }

        public Criteria andBusiStatusLessThanOrEqualTo(Integer value) {
            addCriterion("BUSI_STATUS <=", value, "busiStatus");
            return (Criteria) this;
        }

        public Criteria andBusiStatusIn(List<Integer> values) {
            addCriterion("BUSI_STATUS in", values, "busiStatus");
            return (Criteria) this;
        }

        public Criteria andBusiStatusNotIn(List<Integer> values) {
            addCriterion("BUSI_STATUS not in", values, "busiStatus");
            return (Criteria) this;
        }

        public Criteria andBusiStatusBetween(Integer value1, Integer value2) {
            addCriterion("BUSI_STATUS between", value1, value2, "busiStatus");
            return (Criteria) this;
        }

        public Criteria andBusiStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("BUSI_STATUS not between", value1, value2, "busiStatus");
            return (Criteria) this;
        }

        public Criteria andResStatusIsNull() {
            addCriterion("RES_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andResStatusIsNotNull() {
            addCriterion("RES_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andResStatusEqualTo(Integer value) {
            addCriterion("RES_STATUS =", value, "resStatus");
            return (Criteria) this;
        }

        public Criteria andResStatusNotEqualTo(Integer value) {
            addCriterion("RES_STATUS <>", value, "resStatus");
            return (Criteria) this;
        }

        public Criteria andResStatusGreaterThan(Integer value) {
            addCriterion("RES_STATUS >", value, "resStatus");
            return (Criteria) this;
        }

        public Criteria andResStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("RES_STATUS >=", value, "resStatus");
            return (Criteria) this;
        }

        public Criteria andResStatusLessThan(Integer value) {
            addCriterion("RES_STATUS <", value, "resStatus");
            return (Criteria) this;
        }

        public Criteria andResStatusLessThanOrEqualTo(Integer value) {
            addCriterion("RES_STATUS <=", value, "resStatus");
            return (Criteria) this;
        }

        public Criteria andResStatusIn(List<Integer> values) {
            addCriterion("RES_STATUS in", values, "resStatus");
            return (Criteria) this;
        }

        public Criteria andResStatusNotIn(List<Integer> values) {
            addCriterion("RES_STATUS not in", values, "resStatus");
            return (Criteria) this;
        }

        public Criteria andResStatusBetween(Integer value1, Integer value2) {
            addCriterion("RES_STATUS between", value1, value2, "resStatus");
            return (Criteria) this;
        }

        public Criteria andResStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("RES_STATUS not between", value1, value2, "resStatus");
            return (Criteria) this;
        }

        public Criteria andLeaseStatusIsNull() {
            addCriterion("LEASE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andLeaseStatusIsNotNull() {
            addCriterion("LEASE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andLeaseStatusEqualTo(Integer value) {
            addCriterion("LEASE_STATUS =", value, "leaseStatus");
            return (Criteria) this;
        }

        public Criteria andLeaseStatusNotEqualTo(Integer value) {
            addCriterion("LEASE_STATUS <>", value, "leaseStatus");
            return (Criteria) this;
        }

        public Criteria andLeaseStatusGreaterThan(Integer value) {
            addCriterion("LEASE_STATUS >", value, "leaseStatus");
            return (Criteria) this;
        }

        public Criteria andLeaseStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("LEASE_STATUS >=", value, "leaseStatus");
            return (Criteria) this;
        }

        public Criteria andLeaseStatusLessThan(Integer value) {
            addCriterion("LEASE_STATUS <", value, "leaseStatus");
            return (Criteria) this;
        }

        public Criteria andLeaseStatusLessThanOrEqualTo(Integer value) {
            addCriterion("LEASE_STATUS <=", value, "leaseStatus");
            return (Criteria) this;
        }

        public Criteria andLeaseStatusIn(List<Integer> values) {
            addCriterion("LEASE_STATUS in", values, "leaseStatus");
            return (Criteria) this;
        }

        public Criteria andLeaseStatusNotIn(List<Integer> values) {
            addCriterion("LEASE_STATUS not in", values, "leaseStatus");
            return (Criteria) this;
        }

        public Criteria andLeaseStatusBetween(Integer value1, Integer value2) {
            addCriterion("LEASE_STATUS between", value1, value2, "leaseStatus");
            return (Criteria) this;
        }

        public Criteria andLeaseStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("LEASE_STATUS not between", value1, value2, "leaseStatus");
            return (Criteria) this;
        }

        public Criteria andPrepDateIsNull() {
            addCriterion("PREP_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPrepDateIsNotNull() {
            addCriterion("PREP_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPrepDateEqualTo(Long value) {
            addCriterion("PREP_DATE =", value, "prepDate");
            return (Criteria) this;
        }

        public Criteria andPrepDateNotEqualTo(Long value) {
            addCriterion("PREP_DATE <>", value, "prepDate");
            return (Criteria) this;
        }

        public Criteria andPrepDateGreaterThan(Long value) {
            addCriterion("PREP_DATE >", value, "prepDate");
            return (Criteria) this;
        }

        public Criteria andPrepDateGreaterThanOrEqualTo(Long value) {
            addCriterion("PREP_DATE >=", value, "prepDate");
            return (Criteria) this;
        }

        public Criteria andPrepDateLessThan(Long value) {
            addCriterion("PREP_DATE <", value, "prepDate");
            return (Criteria) this;
        }

        public Criteria andPrepDateLessThanOrEqualTo(Long value) {
            addCriterion("PREP_DATE <=", value, "prepDate");
            return (Criteria) this;
        }

        public Criteria andPrepDateIn(List<Long> values) {
            addCriterion("PREP_DATE in", values, "prepDate");
            return (Criteria) this;
        }

        public Criteria andPrepDateNotIn(List<Long> values) {
            addCriterion("PREP_DATE not in", values, "prepDate");
            return (Criteria) this;
        }

        public Criteria andPrepDateBetween(Long value1, Long value2) {
            addCriterion("PREP_DATE between", value1, value2, "prepDate");
            return (Criteria) this;
        }

        public Criteria andPrepDateNotBetween(Long value1, Long value2) {
            addCriterion("PREP_DATE not between", value1, value2, "prepDate");
            return (Criteria) this;
        }

        public Criteria andXpointIsNull() {
            addCriterion("XPOINT is null");
            return (Criteria) this;
        }

        public Criteria andXpointIsNotNull() {
            addCriterion("XPOINT is not null");
            return (Criteria) this;
        }

        public Criteria andXpointEqualTo(String value) {
            addCriterion("XPOINT =", value, "xpoint");
            return (Criteria) this;
        }

        public Criteria andXpointNotEqualTo(String value) {
            addCriterion("XPOINT <>", value, "xpoint");
            return (Criteria) this;
        }

        public Criteria andXpointGreaterThan(String value) {
            addCriterion("XPOINT >", value, "xpoint");
            return (Criteria) this;
        }

        public Criteria andXpointGreaterThanOrEqualTo(String value) {
            addCriterion("XPOINT >=", value, "xpoint");
            return (Criteria) this;
        }

        public Criteria andXpointLessThan(String value) {
            addCriterion("XPOINT <", value, "xpoint");
            return (Criteria) this;
        }

        public Criteria andXpointLessThanOrEqualTo(String value) {
            addCriterion("XPOINT <=", value, "xpoint");
            return (Criteria) this;
        }

        public Criteria andXpointLike(String value) {
            addCriterion("XPOINT like", value, "xpoint");
            return (Criteria) this;
        }

        public Criteria andXpointNotLike(String value) {
            addCriterion("XPOINT not like", value, "xpoint");
            return (Criteria) this;
        }

        public Criteria andXpointIn(List<String> values) {
            addCriterion("XPOINT in", values, "xpoint");
            return (Criteria) this;
        }

        public Criteria andXpointNotIn(List<String> values) {
            addCriterion("XPOINT not in", values, "xpoint");
            return (Criteria) this;
        }

        public Criteria andXpointBetween(String value1, String value2) {
            addCriterion("XPOINT between", value1, value2, "xpoint");
            return (Criteria) this;
        }

        public Criteria andXpointNotBetween(String value1, String value2) {
            addCriterion("XPOINT not between", value1, value2, "xpoint");
            return (Criteria) this;
        }

        public Criteria andYpointIsNull() {
            addCriterion("YPOINT is null");
            return (Criteria) this;
        }

        public Criteria andYpointIsNotNull() {
            addCriterion("YPOINT is not null");
            return (Criteria) this;
        }

        public Criteria andYpointEqualTo(String value) {
            addCriterion("YPOINT =", value, "ypoint");
            return (Criteria) this;
        }

        public Criteria andYpointNotEqualTo(String value) {
            addCriterion("YPOINT <>", value, "ypoint");
            return (Criteria) this;
        }

        public Criteria andYpointGreaterThan(String value) {
            addCriterion("YPOINT >", value, "ypoint");
            return (Criteria) this;
        }

        public Criteria andYpointGreaterThanOrEqualTo(String value) {
            addCriterion("YPOINT >=", value, "ypoint");
            return (Criteria) this;
        }

        public Criteria andYpointLessThan(String value) {
            addCriterion("YPOINT <", value, "ypoint");
            return (Criteria) this;
        }

        public Criteria andYpointLessThanOrEqualTo(String value) {
            addCriterion("YPOINT <=", value, "ypoint");
            return (Criteria) this;
        }

        public Criteria andYpointLike(String value) {
            addCriterion("YPOINT like", value, "ypoint");
            return (Criteria) this;
        }

        public Criteria andYpointNotLike(String value) {
            addCriterion("YPOINT not like", value, "ypoint");
            return (Criteria) this;
        }

        public Criteria andYpointIn(List<String> values) {
            addCriterion("YPOINT in", values, "ypoint");
            return (Criteria) this;
        }

        public Criteria andYpointNotIn(List<String> values) {
            addCriterion("YPOINT not in", values, "ypoint");
            return (Criteria) this;
        }

        public Criteria andYpointBetween(String value1, String value2) {
            addCriterion("YPOINT between", value1, value2, "ypoint");
            return (Criteria) this;
        }

        public Criteria andYpointNotBetween(String value1, String value2) {
            addCriterion("YPOINT not between", value1, value2, "ypoint");
            return (Criteria) this;
        }

        public Criteria andColorIsNull() {
            addCriterion("COLOR is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("COLOR is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("COLOR =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("COLOR <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("COLOR >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("COLOR >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("COLOR <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("COLOR <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("COLOR like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("COLOR not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("COLOR in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("COLOR not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("COLOR between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("COLOR not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andProductLineIsNull() {
            addCriterion("PRODUCT_LINE is null");
            return (Criteria) this;
        }

        public Criteria andProductLineIsNotNull() {
            addCriterion("PRODUCT_LINE is not null");
            return (Criteria) this;
        }

        public Criteria andProductLineEqualTo(Integer value) {
            addCriterion("PRODUCT_LINE =", value, "productLine");
            return (Criteria) this;
        }

        public Criteria andProductLineNotEqualTo(Integer value) {
            addCriterion("PRODUCT_LINE <>", value, "productLine");
            return (Criteria) this;
        }

        public Criteria andProductLineGreaterThan(Integer value) {
            addCriterion("PRODUCT_LINE >", value, "productLine");
            return (Criteria) this;
        }

        public Criteria andProductLineGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_LINE >=", value, "productLine");
            return (Criteria) this;
        }

        public Criteria andProductLineLessThan(Integer value) {
            addCriterion("PRODUCT_LINE <", value, "productLine");
            return (Criteria) this;
        }

        public Criteria andProductLineLessThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_LINE <=", value, "productLine");
            return (Criteria) this;
        }

        public Criteria andProductLineIn(List<Integer> values) {
            addCriterion("PRODUCT_LINE in", values, "productLine");
            return (Criteria) this;
        }

        public Criteria andProductLineNotIn(List<Integer> values) {
            addCriterion("PRODUCT_LINE not in", values, "productLine");
            return (Criteria) this;
        }

        public Criteria andProductLineBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_LINE between", value1, value2, "productLine");
            return (Criteria) this;
        }

        public Criteria andProductLineNotBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_LINE not between", value1, value2, "productLine");
            return (Criteria) this;
        }

        public Criteria andManagementTypeIsNull() {
            addCriterion("MANAGEMENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andManagementTypeIsNotNull() {
            addCriterion("MANAGEMENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andManagementTypeEqualTo(Integer value) {
            addCriterion("MANAGEMENT_TYPE =", value, "managementType");
            return (Criteria) this;
        }

        public Criteria andManagementTypeNotEqualTo(Integer value) {
            addCriterion("MANAGEMENT_TYPE <>", value, "managementType");
            return (Criteria) this;
        }

        public Criteria andManagementTypeGreaterThan(Integer value) {
            addCriterion("MANAGEMENT_TYPE >", value, "managementType");
            return (Criteria) this;
        }

        public Criteria andManagementTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("MANAGEMENT_TYPE >=", value, "managementType");
            return (Criteria) this;
        }

        public Criteria andManagementTypeLessThan(Integer value) {
            addCriterion("MANAGEMENT_TYPE <", value, "managementType");
            return (Criteria) this;
        }

        public Criteria andManagementTypeLessThanOrEqualTo(Integer value) {
            addCriterion("MANAGEMENT_TYPE <=", value, "managementType");
            return (Criteria) this;
        }

        public Criteria andManagementTypeIn(List<Integer> values) {
            addCriterion("MANAGEMENT_TYPE in", values, "managementType");
            return (Criteria) this;
        }

        public Criteria andManagementTypeNotIn(List<Integer> values) {
            addCriterion("MANAGEMENT_TYPE not in", values, "managementType");
            return (Criteria) this;
        }

        public Criteria andManagementTypeBetween(Integer value1, Integer value2) {
            addCriterion("MANAGEMENT_TYPE between", value1, value2, "managementType");
            return (Criteria) this;
        }

        public Criteria andManagementTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("MANAGEMENT_TYPE not between", value1, value2, "managementType");
            return (Criteria) this;
        }

        public Criteria andIsWorkflowIsNull() {
            addCriterion("IS_WORKFLOW is null");
            return (Criteria) this;
        }

        public Criteria andIsWorkflowIsNotNull() {
            addCriterion("IS_WORKFLOW is not null");
            return (Criteria) this;
        }

        public Criteria andIsWorkflowEqualTo(Integer value) {
            addCriterion("IS_WORKFLOW =", value, "isWorkflow");
            return (Criteria) this;
        }

        public Criteria andIsWorkflowNotEqualTo(Integer value) {
            addCriterion("IS_WORKFLOW <>", value, "isWorkflow");
            return (Criteria) this;
        }

        public Criteria andIsWorkflowGreaterThan(Integer value) {
            addCriterion("IS_WORKFLOW >", value, "isWorkflow");
            return (Criteria) this;
        }

        public Criteria andIsWorkflowGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_WORKFLOW >=", value, "isWorkflow");
            return (Criteria) this;
        }

        public Criteria andIsWorkflowLessThan(Integer value) {
            addCriterion("IS_WORKFLOW <", value, "isWorkflow");
            return (Criteria) this;
        }

        public Criteria andIsWorkflowLessThanOrEqualTo(Integer value) {
            addCriterion("IS_WORKFLOW <=", value, "isWorkflow");
            return (Criteria) this;
        }

        public Criteria andIsWorkflowIn(List<Integer> values) {
            addCriterion("IS_WORKFLOW in", values, "isWorkflow");
            return (Criteria) this;
        }

        public Criteria andIsWorkflowNotIn(List<Integer> values) {
            addCriterion("IS_WORKFLOW not in", values, "isWorkflow");
            return (Criteria) this;
        }

        public Criteria andIsWorkflowBetween(Integer value1, Integer value2) {
            addCriterion("IS_WORKFLOW between", value1, value2, "isWorkflow");
            return (Criteria) this;
        }

        public Criteria andIsWorkflowNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_WORKFLOW not between", value1, value2, "isWorkflow");
            return (Criteria) this;
        }

        public Criteria andBrandTypeMainIsNull() {
            addCriterion("brand_type_main is null");
            return (Criteria) this;
        }

        public Criteria andBrandTypeMainIsNotNull() {
            addCriterion("brand_type_main is not null");
            return (Criteria) this;
        }

        public Criteria andBrandTypeMainEqualTo(String value) {
            addCriterion("brand_type_main =", value, "brandTypeMain");
            return (Criteria) this;
        }

        public Criteria andBrandTypeMainNotEqualTo(String value) {
            addCriterion("brand_type_main <>", value, "brandTypeMain");
            return (Criteria) this;
        }

        public Criteria andBrandTypeMainGreaterThan(String value) {
            addCriterion("brand_type_main >", value, "brandTypeMain");
            return (Criteria) this;
        }

        public Criteria andBrandTypeMainGreaterThanOrEqualTo(String value) {
            addCriterion("brand_type_main >=", value, "brandTypeMain");
            return (Criteria) this;
        }

        public Criteria andBrandTypeMainLessThan(String value) {
            addCriterion("brand_type_main <", value, "brandTypeMain");
            return (Criteria) this;
        }

        public Criteria andBrandTypeMainLessThanOrEqualTo(String value) {
            addCriterion("brand_type_main <=", value, "brandTypeMain");
            return (Criteria) this;
        }

        public Criteria andBrandTypeMainLike(String value) {
            addCriterion("brand_type_main like", value, "brandTypeMain");
            return (Criteria) this;
        }

        public Criteria andBrandTypeMainNotLike(String value) {
            addCriterion("brand_type_main not like", value, "brandTypeMain");
            return (Criteria) this;
        }

        public Criteria andBrandTypeMainIn(List<String> values) {
            addCriterion("brand_type_main in", values, "brandTypeMain");
            return (Criteria) this;
        }

        public Criteria andBrandTypeMainNotIn(List<String> values) {
            addCriterion("brand_type_main not in", values, "brandTypeMain");
            return (Criteria) this;
        }

        public Criteria andBrandTypeMainBetween(String value1, String value2) {
            addCriterion("brand_type_main between", value1, value2, "brandTypeMain");
            return (Criteria) this;
        }

        public Criteria andBrandTypeMainNotBetween(String value1, String value2) {
            addCriterion("brand_type_main not between", value1, value2, "brandTypeMain");
            return (Criteria) this;
        }

        public Criteria andBrandTypeSubIsNull() {
            addCriterion("brand_type_sub is null");
            return (Criteria) this;
        }

        public Criteria andBrandTypeSubIsNotNull() {
            addCriterion("brand_type_sub is not null");
            return (Criteria) this;
        }

        public Criteria andBrandTypeSubEqualTo(String value) {
            addCriterion("brand_type_sub =", value, "brandTypeSub");
            return (Criteria) this;
        }

        public Criteria andBrandTypeSubNotEqualTo(String value) {
            addCriterion("brand_type_sub <>", value, "brandTypeSub");
            return (Criteria) this;
        }

        public Criteria andBrandTypeSubGreaterThan(String value) {
            addCriterion("brand_type_sub >", value, "brandTypeSub");
            return (Criteria) this;
        }

        public Criteria andBrandTypeSubGreaterThanOrEqualTo(String value) {
            addCriterion("brand_type_sub >=", value, "brandTypeSub");
            return (Criteria) this;
        }

        public Criteria andBrandTypeSubLessThan(String value) {
            addCriterion("brand_type_sub <", value, "brandTypeSub");
            return (Criteria) this;
        }

        public Criteria andBrandTypeSubLessThanOrEqualTo(String value) {
            addCriterion("brand_type_sub <=", value, "brandTypeSub");
            return (Criteria) this;
        }

        public Criteria andBrandTypeSubLike(String value) {
            addCriterion("brand_type_sub like", value, "brandTypeSub");
            return (Criteria) this;
        }

        public Criteria andBrandTypeSubNotLike(String value) {
            addCriterion("brand_type_sub not like", value, "brandTypeSub");
            return (Criteria) this;
        }

        public Criteria andBrandTypeSubIn(List<String> values) {
            addCriterion("brand_type_sub in", values, "brandTypeSub");
            return (Criteria) this;
        }

        public Criteria andBrandTypeSubNotIn(List<String> values) {
            addCriterion("brand_type_sub not in", values, "brandTypeSub");
            return (Criteria) this;
        }

        public Criteria andBrandTypeSubBetween(String value1, String value2) {
            addCriterion("brand_type_sub between", value1, value2, "brandTypeSub");
            return (Criteria) this;
        }

        public Criteria andBrandTypeSubNotBetween(String value1, String value2) {
            addCriterion("brand_type_sub not between", value1, value2, "brandTypeSub");
            return (Criteria) this;
        }

        public Criteria andSubLeaseAreaIsNull() {
            addCriterion("sub_lease_area is null");
            return (Criteria) this;
        }

        public Criteria andSubLeaseAreaIsNotNull() {
            addCriterion("sub_lease_area is not null");
            return (Criteria) this;
        }

        public Criteria andSubLeaseAreaEqualTo(BigDecimal value) {
            addCriterion("sub_lease_area =", value, "subLeaseArea");
            return (Criteria) this;
        }

        public Criteria andSubLeaseAreaNotEqualTo(BigDecimal value) {
            addCriterion("sub_lease_area <>", value, "subLeaseArea");
            return (Criteria) this;
        }

        public Criteria andSubLeaseAreaGreaterThan(BigDecimal value) {
            addCriterion("sub_lease_area >", value, "subLeaseArea");
            return (Criteria) this;
        }

        public Criteria andSubLeaseAreaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sub_lease_area >=", value, "subLeaseArea");
            return (Criteria) this;
        }

        public Criteria andSubLeaseAreaLessThan(BigDecimal value) {
            addCriterion("sub_lease_area <", value, "subLeaseArea");
            return (Criteria) this;
        }

        public Criteria andSubLeaseAreaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sub_lease_area <=", value, "subLeaseArea");
            return (Criteria) this;
        }

        public Criteria andSubLeaseAreaIn(List<BigDecimal> values) {
            addCriterion("sub_lease_area in", values, "subLeaseArea");
            return (Criteria) this;
        }

        public Criteria andSubLeaseAreaNotIn(List<BigDecimal> values) {
            addCriterion("sub_lease_area not in", values, "subLeaseArea");
            return (Criteria) this;
        }

        public Criteria andSubLeaseAreaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sub_lease_area between", value1, value2, "subLeaseArea");
            return (Criteria) this;
        }

        public Criteria andSubLeaseAreaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sub_lease_area not between", value1, value2, "subLeaseArea");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Long value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Long value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Long value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Long value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Long value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Long> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Long> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Long value1, Long value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Long value1, Long value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNull() {
            addCriterion("CREATE_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNotNull() {
            addCriterion("CREATE_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualTo(Integer value) {
            addCriterion("CREATE_USER_ID =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(Integer value) {
            addCriterion("CREATE_USER_ID <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(Integer value) {
            addCriterion("CREATE_USER_ID >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CREATE_USER_ID >=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(Integer value) {
            addCriterion("CREATE_USER_ID <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("CREATE_USER_ID <=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIn(List<Integer> values) {
            addCriterion("CREATE_USER_ID in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<Integer> values) {
            addCriterion("CREATE_USER_ID not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(Integer value1, Integer value2) {
            addCriterion("CREATE_USER_ID between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CREATE_USER_ID not between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameIsNull() {
            addCriterion("CREATE_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameIsNotNull() {
            addCriterion("CREATE_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameEqualTo(String value) {
            addCriterion("CREATE_USER_NAME =", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameNotEqualTo(String value) {
            addCriterion("CREATE_USER_NAME <>", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameGreaterThan(String value) {
            addCriterion("CREATE_USER_NAME >", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_USER_NAME >=", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameLessThan(String value) {
            addCriterion("CREATE_USER_NAME <", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameLessThanOrEqualTo(String value) {
            addCriterion("CREATE_USER_NAME <=", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameLike(String value) {
            addCriterion("CREATE_USER_NAME like", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameNotLike(String value) {
            addCriterion("CREATE_USER_NAME not like", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameIn(List<String> values) {
            addCriterion("CREATE_USER_NAME in", values, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameNotIn(List<String> values) {
            addCriterion("CREATE_USER_NAME not in", values, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameBetween(String value1, String value2) {
            addCriterion("CREATE_USER_NAME between", value1, value2, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameNotBetween(String value1, String value2) {
            addCriterion("CREATE_USER_NAME not between", value1, value2, "createUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Long value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Long value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Long value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Long value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Long value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Long> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Long> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Long value1, Long value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Long value1, Long value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIsNull() {
            addCriterion("UPDATE_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIsNotNull() {
            addCriterion("UPDATE_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdEqualTo(Integer value) {
            addCriterion("UPDATE_USER_ID =", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotEqualTo(Integer value) {
            addCriterion("UPDATE_USER_ID <>", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdGreaterThan(Integer value) {
            addCriterion("UPDATE_USER_ID >", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("UPDATE_USER_ID >=", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLessThan(Integer value) {
            addCriterion("UPDATE_USER_ID <", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("UPDATE_USER_ID <=", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIn(List<Integer> values) {
            addCriterion("UPDATE_USER_ID in", values, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotIn(List<Integer> values) {
            addCriterion("UPDATE_USER_ID not in", values, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdBetween(Integer value1, Integer value2) {
            addCriterion("UPDATE_USER_ID between", value1, value2, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("UPDATE_USER_ID not between", value1, value2, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameIsNull() {
            addCriterion("UPDATE_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameIsNotNull() {
            addCriterion("UPDATE_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameEqualTo(String value) {
            addCriterion("UPDATE_USER_NAME =", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameNotEqualTo(String value) {
            addCriterion("UPDATE_USER_NAME <>", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameGreaterThan(String value) {
            addCriterion("UPDATE_USER_NAME >", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_USER_NAME >=", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameLessThan(String value) {
            addCriterion("UPDATE_USER_NAME <", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_USER_NAME <=", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameLike(String value) {
            addCriterion("UPDATE_USER_NAME like", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameNotLike(String value) {
            addCriterion("UPDATE_USER_NAME not like", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameIn(List<String> values) {
            addCriterion("UPDATE_USER_NAME in", values, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameNotIn(List<String> values) {
            addCriterion("UPDATE_USER_NAME not in", values, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameBetween(String value1, String value2) {
            addCriterion("UPDATE_USER_NAME between", value1, value2, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameNotBetween(String value1, String value2) {
            addCriterion("UPDATE_USER_NAME not between", value1, value2, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andOrganIdIsNull() {
            addCriterion("organ_id is null");
            return (Criteria) this;
        }

        public Criteria andOrganIdIsNotNull() {
            addCriterion("organ_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrganIdEqualTo(Integer value) {
            addCriterion("organ_id =", value, "organId");
            return (Criteria) this;
        }

        public Criteria andOrganIdNotEqualTo(Integer value) {
            addCriterion("organ_id <>", value, "organId");
            return (Criteria) this;
        }

        public Criteria andOrganIdGreaterThan(Integer value) {
            addCriterion("organ_id >", value, "organId");
            return (Criteria) this;
        }

        public Criteria andOrganIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("organ_id >=", value, "organId");
            return (Criteria) this;
        }

        public Criteria andOrganIdLessThan(Integer value) {
            addCriterion("organ_id <", value, "organId");
            return (Criteria) this;
        }

        public Criteria andOrganIdLessThanOrEqualTo(Integer value) {
            addCriterion("organ_id <=", value, "organId");
            return (Criteria) this;
        }

        public Criteria andOrganIdIn(List<Integer> values) {
            addCriterion("organ_id in", values, "organId");
            return (Criteria) this;
        }

        public Criteria andOrganIdNotIn(List<Integer> values) {
            addCriterion("organ_id not in", values, "organId");
            return (Criteria) this;
        }

        public Criteria andOrganIdBetween(Integer value1, Integer value2) {
            addCriterion("organ_id between", value1, value2, "organId");
            return (Criteria) this;
        }

        public Criteria andOrganIdNotBetween(Integer value1, Integer value2) {
            addCriterion("organ_id not between", value1, value2, "organId");
            return (Criteria) this;
        }

        public Criteria andOrganNameIsNull() {
            addCriterion("organ_name is null");
            return (Criteria) this;
        }

        public Criteria andOrganNameIsNotNull() {
            addCriterion("organ_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrganNameEqualTo(String value) {
            addCriterion("organ_name =", value, "organName");
            return (Criteria) this;
        }

        public Criteria andOrganNameNotEqualTo(String value) {
            addCriterion("organ_name <>", value, "organName");
            return (Criteria) this;
        }

        public Criteria andOrganNameGreaterThan(String value) {
            addCriterion("organ_name >", value, "organName");
            return (Criteria) this;
        }

        public Criteria andOrganNameGreaterThanOrEqualTo(String value) {
            addCriterion("organ_name >=", value, "organName");
            return (Criteria) this;
        }

        public Criteria andOrganNameLessThan(String value) {
            addCriterion("organ_name <", value, "organName");
            return (Criteria) this;
        }

        public Criteria andOrganNameLessThanOrEqualTo(String value) {
            addCriterion("organ_name <=", value, "organName");
            return (Criteria) this;
        }

        public Criteria andOrganNameLike(String value) {
            addCriterion("organ_name like", value, "organName");
            return (Criteria) this;
        }

        public Criteria andOrganNameNotLike(String value) {
            addCriterion("organ_name not like", value, "organName");
            return (Criteria) this;
        }

        public Criteria andOrganNameIn(List<String> values) {
            addCriterion("organ_name in", values, "organName");
            return (Criteria) this;
        }

        public Criteria andOrganNameNotIn(List<String> values) {
            addCriterion("organ_name not in", values, "organName");
            return (Criteria) this;
        }

        public Criteria andOrganNameBetween(String value1, String value2) {
            addCriterion("organ_name between", value1, value2, "organName");
            return (Criteria) this;
        }

        public Criteria andOrganNameNotBetween(String value1, String value2) {
            addCriterion("organ_name not between", value1, value2, "organName");
            return (Criteria) this;
        }

        public Criteria andPositionIdIsNull() {
            addCriterion("position_id is null");
            return (Criteria) this;
        }

        public Criteria andPositionIdIsNotNull() {
            addCriterion("position_id is not null");
            return (Criteria) this;
        }

        public Criteria andPositionIdEqualTo(Integer value) {
            addCriterion("position_id =", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotEqualTo(Integer value) {
            addCriterion("position_id <>", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdGreaterThan(Integer value) {
            addCriterion("position_id >", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("position_id >=", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdLessThan(Integer value) {
            addCriterion("position_id <", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdLessThanOrEqualTo(Integer value) {
            addCriterion("position_id <=", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdIn(List<Integer> values) {
            addCriterion("position_id in", values, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotIn(List<Integer> values) {
            addCriterion("position_id not in", values, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdBetween(Integer value1, Integer value2) {
            addCriterion("position_id between", value1, value2, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("position_id not between", value1, value2, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionNameIsNull() {
            addCriterion("position_name is null");
            return (Criteria) this;
        }

        public Criteria andPositionNameIsNotNull() {
            addCriterion("position_name is not null");
            return (Criteria) this;
        }

        public Criteria andPositionNameEqualTo(String value) {
            addCriterion("position_name =", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameNotEqualTo(String value) {
            addCriterion("position_name <>", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameGreaterThan(String value) {
            addCriterion("position_name >", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameGreaterThanOrEqualTo(String value) {
            addCriterion("position_name >=", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameLessThan(String value) {
            addCriterion("position_name <", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameLessThanOrEqualTo(String value) {
            addCriterion("position_name <=", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameLike(String value) {
            addCriterion("position_name like", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameNotLike(String value) {
            addCriterion("position_name not like", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameIn(List<String> values) {
            addCriterion("position_name in", values, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameNotIn(List<String> values) {
            addCriterion("position_name not in", values, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameBetween(String value1, String value2) {
            addCriterion("position_name between", value1, value2, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameNotBetween(String value1, String value2) {
            addCriterion("position_name not between", value1, value2, "positionName");
            return (Criteria) this;
        }

        public Criteria andResCodeIsNull() {
            addCriterion("res_code is null");
            return (Criteria) this;
        }

        public Criteria andResCodeIsNotNull() {
            addCriterion("res_code is not null");
            return (Criteria) this;
        }

        public Criteria andResCodeEqualTo(String value) {
            addCriterion("res_code =", value, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeNotEqualTo(String value) {
            addCriterion("res_code <>", value, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeGreaterThan(String value) {
            addCriterion("res_code >", value, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeGreaterThanOrEqualTo(String value) {
            addCriterion("res_code >=", value, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeLessThan(String value) {
            addCriterion("res_code <", value, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeLessThanOrEqualTo(String value) {
            addCriterion("res_code <=", value, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeLike(String value) {
            addCriterion("res_code like", value, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeNotLike(String value) {
            addCriterion("res_code not like", value, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeIn(List<String> values) {
            addCriterion("res_code in", values, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeNotIn(List<String> values) {
            addCriterion("res_code not in", values, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeBetween(String value1, String value2) {
            addCriterion("res_code between", value1, value2, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeNotBetween(String value1, String value2) {
            addCriterion("res_code not between", value1, value2, "resCode");
            return (Criteria) this;
        }

        public Criteria andResNameIsNull() {
            addCriterion("res_name is null");
            return (Criteria) this;
        }

        public Criteria andResNameIsNotNull() {
            addCriterion("res_name is not null");
            return (Criteria) this;
        }

        public Criteria andResNameEqualTo(String value) {
            addCriterion("res_name =", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameNotEqualTo(String value) {
            addCriterion("res_name <>", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameGreaterThan(String value) {
            addCriterion("res_name >", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameGreaterThanOrEqualTo(String value) {
            addCriterion("res_name >=", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameLessThan(String value) {
            addCriterion("res_name <", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameLessThanOrEqualTo(String value) {
            addCriterion("res_name <=", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameLike(String value) {
            addCriterion("res_name like", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameNotLike(String value) {
            addCriterion("res_name not like", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameIn(List<String> values) {
            addCriterion("res_name in", values, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameNotIn(List<String> values) {
            addCriterion("res_name not in", values, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameBetween(String value1, String value2) {
            addCriterion("res_name between", value1, value2, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameNotBetween(String value1, String value2) {
            addCriterion("res_name not between", value1, value2, "resName");
            return (Criteria) this;
        }

        public Criteria andPointTypeIsNull() {
            addCriterion("point_type is null");
            return (Criteria) this;
        }

        public Criteria andPointTypeIsNotNull() {
            addCriterion("point_type is not null");
            return (Criteria) this;
        }

        public Criteria andPointTypeEqualTo(Integer value) {
            addCriterion("point_type =", value, "pointType");
            return (Criteria) this;
        }

        public Criteria andPointTypeNotEqualTo(Integer value) {
            addCriterion("point_type <>", value, "pointType");
            return (Criteria) this;
        }

        public Criteria andPointTypeGreaterThan(Integer value) {
            addCriterion("point_type >", value, "pointType");
            return (Criteria) this;
        }

        public Criteria andPointTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("point_type >=", value, "pointType");
            return (Criteria) this;
        }

        public Criteria andPointTypeLessThan(Integer value) {
            addCriterion("point_type <", value, "pointType");
            return (Criteria) this;
        }

        public Criteria andPointTypeLessThanOrEqualTo(Integer value) {
            addCriterion("point_type <=", value, "pointType");
            return (Criteria) this;
        }

        public Criteria andPointTypeIn(List<Integer> values) {
            addCriterion("point_type in", values, "pointType");
            return (Criteria) this;
        }

        public Criteria andPointTypeNotIn(List<Integer> values) {
            addCriterion("point_type not in", values, "pointType");
            return (Criteria) this;
        }

        public Criteria andPointTypeBetween(Integer value1, Integer value2) {
            addCriterion("point_type between", value1, value2, "pointType");
            return (Criteria) this;
        }

        public Criteria andPointTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("point_type not between", value1, value2, "pointType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNull() {
            addCriterion("business_type is null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNotNull() {
            addCriterion("business_type is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeEqualTo(Integer value) {
            addCriterion("business_type =", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotEqualTo(Integer value) {
            addCriterion("business_type <>", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThan(Integer value) {
            addCriterion("business_type >", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("business_type >=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThan(Integer value) {
            addCriterion("business_type <", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThanOrEqualTo(Integer value) {
            addCriterion("business_type <=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIn(List<Integer> values) {
            addCriterion("business_type in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotIn(List<Integer> values) {
            addCriterion("business_type not in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeBetween(Integer value1, Integer value2) {
            addCriterion("business_type between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("business_type not between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andNewUseDirectionIsNull() {
            addCriterion("new_use_direction is null");
            return (Criteria) this;
        }

        public Criteria andNewUseDirectionIsNotNull() {
            addCriterion("new_use_direction is not null");
            return (Criteria) this;
        }

        public Criteria andNewUseDirectionEqualTo(Integer value) {
            addCriterion("new_use_direction =", value, "newUseDirection");
            return (Criteria) this;
        }

        public Criteria andNewUseDirectionNotEqualTo(Integer value) {
            addCriterion("new_use_direction <>", value, "newUseDirection");
            return (Criteria) this;
        }

        public Criteria andNewUseDirectionGreaterThan(Integer value) {
            addCriterion("new_use_direction >", value, "newUseDirection");
            return (Criteria) this;
        }

        public Criteria andNewUseDirectionGreaterThanOrEqualTo(Integer value) {
            addCriterion("new_use_direction >=", value, "newUseDirection");
            return (Criteria) this;
        }

        public Criteria andNewUseDirectionLessThan(Integer value) {
            addCriterion("new_use_direction <", value, "newUseDirection");
            return (Criteria) this;
        }

        public Criteria andNewUseDirectionLessThanOrEqualTo(Integer value) {
            addCriterion("new_use_direction <=", value, "newUseDirection");
            return (Criteria) this;
        }

        public Criteria andNewUseDirectionIn(List<Integer> values) {
            addCriterion("new_use_direction in", values, "newUseDirection");
            return (Criteria) this;
        }

        public Criteria andNewUseDirectionNotIn(List<Integer> values) {
            addCriterion("new_use_direction not in", values, "newUseDirection");
            return (Criteria) this;
        }

        public Criteria andNewUseDirectionBetween(Integer value1, Integer value2) {
            addCriterion("new_use_direction between", value1, value2, "newUseDirection");
            return (Criteria) this;
        }

        public Criteria andNewUseDirectionNotBetween(Integer value1, Integer value2) {
            addCriterion("new_use_direction not between", value1, value2, "newUseDirection");
            return (Criteria) this;
        }

        public Criteria andInvalidTimeIsNull() {
            addCriterion("invalid_time is null");
            return (Criteria) this;
        }

        public Criteria andInvalidTimeIsNotNull() {
            addCriterion("invalid_time is not null");
            return (Criteria) this;
        }

        public Criteria andInvalidTimeEqualTo(Long value) {
            addCriterion("invalid_time =", value, "invalidTime");
            return (Criteria) this;
        }

        public Criteria andInvalidTimeNotEqualTo(Long value) {
            addCriterion("invalid_time <>", value, "invalidTime");
            return (Criteria) this;
        }

        public Criteria andInvalidTimeGreaterThan(Long value) {
            addCriterion("invalid_time >", value, "invalidTime");
            return (Criteria) this;
        }

        public Criteria andInvalidTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("invalid_time >=", value, "invalidTime");
            return (Criteria) this;
        }

        public Criteria andInvalidTimeLessThan(Long value) {
            addCriterion("invalid_time <", value, "invalidTime");
            return (Criteria) this;
        }

        public Criteria andInvalidTimeLessThanOrEqualTo(Long value) {
            addCriterion("invalid_time <=", value, "invalidTime");
            return (Criteria) this;
        }

        public Criteria andInvalidTimeIn(List<Long> values) {
            addCriterion("invalid_time in", values, "invalidTime");
            return (Criteria) this;
        }

        public Criteria andInvalidTimeNotIn(List<Long> values) {
            addCriterion("invalid_time not in", values, "invalidTime");
            return (Criteria) this;
        }

        public Criteria andInvalidTimeBetween(Long value1, Long value2) {
            addCriterion("invalid_time between", value1, value2, "invalidTime");
            return (Criteria) this;
        }

        public Criteria andInvalidTimeNotBetween(Long value1, Long value2) {
            addCriterion("invalid_time not between", value1, value2, "invalidTime");
            return (Criteria) this;
        }

        public Criteria andUseDirectionIsNull() {
            addCriterion("use_direction is null");
            return (Criteria) this;
        }

        public Criteria andUseDirectionIsNotNull() {
            addCriterion("use_direction is not null");
            return (Criteria) this;
        }

        public Criteria andUseDirectionEqualTo(Integer value) {
            addCriterion("use_direction =", value, "useDirection");
            return (Criteria) this;
        }

        public Criteria andUseDirectionNotEqualTo(Integer value) {
            addCriterion("use_direction <>", value, "useDirection");
            return (Criteria) this;
        }

        public Criteria andUseDirectionGreaterThan(Integer value) {
            addCriterion("use_direction >", value, "useDirection");
            return (Criteria) this;
        }

        public Criteria andUseDirectionGreaterThanOrEqualTo(Integer value) {
            addCriterion("use_direction >=", value, "useDirection");
            return (Criteria) this;
        }

        public Criteria andUseDirectionLessThan(Integer value) {
            addCriterion("use_direction <", value, "useDirection");
            return (Criteria) this;
        }

        public Criteria andUseDirectionLessThanOrEqualTo(Integer value) {
            addCriterion("use_direction <=", value, "useDirection");
            return (Criteria) this;
        }

        public Criteria andUseDirectionIn(List<Integer> values) {
            addCriterion("use_direction in", values, "useDirection");
            return (Criteria) this;
        }

        public Criteria andUseDirectionNotIn(List<Integer> values) {
            addCriterion("use_direction not in", values, "useDirection");
            return (Criteria) this;
        }

        public Criteria andUseDirectionBetween(Integer value1, Integer value2) {
            addCriterion("use_direction between", value1, value2, "useDirection");
            return (Criteria) this;
        }

        public Criteria andUseDirectionNotBetween(Integer value1, Integer value2) {
            addCriterion("use_direction not between", value1, value2, "useDirection");
            return (Criteria) this;
        }

        public Criteria andPriceUnitIsNull() {
            addCriterion("price_unit is null");
            return (Criteria) this;
        }

        public Criteria andPriceUnitIsNotNull() {
            addCriterion("price_unit is not null");
            return (Criteria) this;
        }

        public Criteria andPriceUnitEqualTo(String value) {
            addCriterion("price_unit =", value, "priceUnit");
            return (Criteria) this;
        }

        public Criteria andPriceUnitNotEqualTo(String value) {
            addCriterion("price_unit <>", value, "priceUnit");
            return (Criteria) this;
        }

        public Criteria andPriceUnitGreaterThan(String value) {
            addCriterion("price_unit >", value, "priceUnit");
            return (Criteria) this;
        }

        public Criteria andPriceUnitGreaterThanOrEqualTo(String value) {
            addCriterion("price_unit >=", value, "priceUnit");
            return (Criteria) this;
        }

        public Criteria andPriceUnitLessThan(String value) {
            addCriterion("price_unit <", value, "priceUnit");
            return (Criteria) this;
        }

        public Criteria andPriceUnitLessThanOrEqualTo(String value) {
            addCriterion("price_unit <=", value, "priceUnit");
            return (Criteria) this;
        }

        public Criteria andPriceUnitLike(String value) {
            addCriterion("price_unit like", value, "priceUnit");
            return (Criteria) this;
        }

        public Criteria andPriceUnitNotLike(String value) {
            addCriterion("price_unit not like", value, "priceUnit");
            return (Criteria) this;
        }

        public Criteria andPriceUnitIn(List<String> values) {
            addCriterion("price_unit in", values, "priceUnit");
            return (Criteria) this;
        }

        public Criteria andPriceUnitNotIn(List<String> values) {
            addCriterion("price_unit not in", values, "priceUnit");
            return (Criteria) this;
        }

        public Criteria andPriceUnitBetween(String value1, String value2) {
            addCriterion("price_unit between", value1, value2, "priceUnit");
            return (Criteria) this;
        }

        public Criteria andPriceUnitNotBetween(String value1, String value2) {
            addCriterion("price_unit not between", value1, value2, "priceUnit");
            return (Criteria) this;
        }

        public Criteria andFeeUnitIsNull() {
            addCriterion("fee_unit is null");
            return (Criteria) this;
        }

        public Criteria andFeeUnitIsNotNull() {
            addCriterion("fee_unit is not null");
            return (Criteria) this;
        }

        public Criteria andFeeUnitEqualTo(String value) {
            addCriterion("fee_unit =", value, "feeUnit");
            return (Criteria) this;
        }

        public Criteria andFeeUnitNotEqualTo(String value) {
            addCriterion("fee_unit <>", value, "feeUnit");
            return (Criteria) this;
        }

        public Criteria andFeeUnitGreaterThan(String value) {
            addCriterion("fee_unit >", value, "feeUnit");
            return (Criteria) this;
        }

        public Criteria andFeeUnitGreaterThanOrEqualTo(String value) {
            addCriterion("fee_unit >=", value, "feeUnit");
            return (Criteria) this;
        }

        public Criteria andFeeUnitLessThan(String value) {
            addCriterion("fee_unit <", value, "feeUnit");
            return (Criteria) this;
        }

        public Criteria andFeeUnitLessThanOrEqualTo(String value) {
            addCriterion("fee_unit <=", value, "feeUnit");
            return (Criteria) this;
        }

        public Criteria andFeeUnitLike(String value) {
            addCriterion("fee_unit like", value, "feeUnit");
            return (Criteria) this;
        }

        public Criteria andFeeUnitNotLike(String value) {
            addCriterion("fee_unit not like", value, "feeUnit");
            return (Criteria) this;
        }

        public Criteria andFeeUnitIn(List<String> values) {
            addCriterion("fee_unit in", values, "feeUnit");
            return (Criteria) this;
        }

        public Criteria andFeeUnitNotIn(List<String> values) {
            addCriterion("fee_unit not in", values, "feeUnit");
            return (Criteria) this;
        }

        public Criteria andFeeUnitBetween(String value1, String value2) {
            addCriterion("fee_unit between", value1, value2, "feeUnit");
            return (Criteria) this;
        }

        public Criteria andFeeUnitNotBetween(String value1, String value2) {
            addCriterion("fee_unit not between", value1, value2, "feeUnit");
            return (Criteria) this;
        }

        public Criteria andFeeAmountIsNull() {
            addCriterion("fee_amount is null");
            return (Criteria) this;
        }

        public Criteria andFeeAmountIsNotNull() {
            addCriterion("fee_amount is not null");
            return (Criteria) this;
        }

        public Criteria andFeeAmountEqualTo(Integer value) {
            addCriterion("fee_amount =", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountNotEqualTo(Integer value) {
            addCriterion("fee_amount <>", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountGreaterThan(Integer value) {
            addCriterion("fee_amount >", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("fee_amount >=", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountLessThan(Integer value) {
            addCriterion("fee_amount <", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountLessThanOrEqualTo(Integer value) {
            addCriterion("fee_amount <=", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountIn(List<Integer> values) {
            addCriterion("fee_amount in", values, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountNotIn(List<Integer> values) {
            addCriterion("fee_amount not in", values, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountBetween(Integer value1, Integer value2) {
            addCriterion("fee_amount between", value1, value2, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("fee_amount not between", value1, value2, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andChargeIdIsNull() {
            addCriterion("charge_id is null");
            return (Criteria) this;
        }

        public Criteria andChargeIdIsNotNull() {
            addCriterion("charge_id is not null");
            return (Criteria) this;
        }

        public Criteria andChargeIdEqualTo(Integer value) {
            addCriterion("charge_id =", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdNotEqualTo(Integer value) {
            addCriterion("charge_id <>", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdGreaterThan(Integer value) {
            addCriterion("charge_id >", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("charge_id >=", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdLessThan(Integer value) {
            addCriterion("charge_id <", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdLessThanOrEqualTo(Integer value) {
            addCriterion("charge_id <=", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdIn(List<Integer> values) {
            addCriterion("charge_id in", values, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdNotIn(List<Integer> values) {
            addCriterion("charge_id not in", values, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdBetween(Integer value1, Integer value2) {
            addCriterion("charge_id between", value1, value2, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("charge_id not between", value1, value2, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeNameIsNull() {
            addCriterion("charge_name is null");
            return (Criteria) this;
        }

        public Criteria andChargeNameIsNotNull() {
            addCriterion("charge_name is not null");
            return (Criteria) this;
        }

        public Criteria andChargeNameEqualTo(String value) {
            addCriterion("charge_name =", value, "chargeName");
            return (Criteria) this;
        }

        public Criteria andChargeNameNotEqualTo(String value) {
            addCriterion("charge_name <>", value, "chargeName");
            return (Criteria) this;
        }

        public Criteria andChargeNameGreaterThan(String value) {
            addCriterion("charge_name >", value, "chargeName");
            return (Criteria) this;
        }

        public Criteria andChargeNameGreaterThanOrEqualTo(String value) {
            addCriterion("charge_name >=", value, "chargeName");
            return (Criteria) this;
        }

        public Criteria andChargeNameLessThan(String value) {
            addCriterion("charge_name <", value, "chargeName");
            return (Criteria) this;
        }

        public Criteria andChargeNameLessThanOrEqualTo(String value) {
            addCriterion("charge_name <=", value, "chargeName");
            return (Criteria) this;
        }

        public Criteria andChargeNameLike(String value) {
            addCriterion("charge_name like", value, "chargeName");
            return (Criteria) this;
        }

        public Criteria andChargeNameNotLike(String value) {
            addCriterion("charge_name not like", value, "chargeName");
            return (Criteria) this;
        }

        public Criteria andChargeNameIn(List<String> values) {
            addCriterion("charge_name in", values, "chargeName");
            return (Criteria) this;
        }

        public Criteria andChargeNameNotIn(List<String> values) {
            addCriterion("charge_name not in", values, "chargeName");
            return (Criteria) this;
        }

        public Criteria andChargeNameBetween(String value1, String value2) {
            addCriterion("charge_name between", value1, value2, "chargeName");
            return (Criteria) this;
        }

        public Criteria andChargeNameNotBetween(String value1, String value2) {
            addCriterion("charge_name not between", value1, value2, "chargeName");
            return (Criteria) this;
        }

        public Criteria andFeePriceIsNull() {
            addCriterion("fee_price is null");
            return (Criteria) this;
        }

        public Criteria andFeePriceIsNotNull() {
            addCriterion("fee_price is not null");
            return (Criteria) this;
        }

        public Criteria andFeePriceEqualTo(Long value) {
            addCriterion("fee_price =", value, "feePrice");
            return (Criteria) this;
        }

        public Criteria andFeePriceNotEqualTo(Long value) {
            addCriterion("fee_price <>", value, "feePrice");
            return (Criteria) this;
        }

        public Criteria andFeePriceGreaterThan(Long value) {
            addCriterion("fee_price >", value, "feePrice");
            return (Criteria) this;
        }

        public Criteria andFeePriceGreaterThanOrEqualTo(Long value) {
            addCriterion("fee_price >=", value, "feePrice");
            return (Criteria) this;
        }

        public Criteria andFeePriceLessThan(Long value) {
            addCriterion("fee_price <", value, "feePrice");
            return (Criteria) this;
        }

        public Criteria andFeePriceLessThanOrEqualTo(Long value) {
            addCriterion("fee_price <=", value, "feePrice");
            return (Criteria) this;
        }

        public Criteria andFeePriceIn(List<Long> values) {
            addCriterion("fee_price in", values, "feePrice");
            return (Criteria) this;
        }

        public Criteria andFeePriceNotIn(List<Long> values) {
            addCriterion("fee_price not in", values, "feePrice");
            return (Criteria) this;
        }

        public Criteria andFeePriceBetween(Long value1, Long value2) {
            addCriterion("fee_price between", value1, value2, "feePrice");
            return (Criteria) this;
        }

        public Criteria andFeePriceNotBetween(Long value1, Long value2) {
            addCriterion("fee_price not between", value1, value2, "feePrice");
            return (Criteria) this;
        }

        public Criteria andCycleIsNull() {
            addCriterion("cycle is null");
            return (Criteria) this;
        }

        public Criteria andCycleIsNotNull() {
            addCriterion("cycle is not null");
            return (Criteria) this;
        }

        public Criteria andCycleEqualTo(String value) {
            addCriterion("cycle =", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleNotEqualTo(String value) {
            addCriterion("cycle <>", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleGreaterThan(String value) {
            addCriterion("cycle >", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleGreaterThanOrEqualTo(String value) {
            addCriterion("cycle >=", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleLessThan(String value) {
            addCriterion("cycle <", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleLessThanOrEqualTo(String value) {
            addCriterion("cycle <=", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleLike(String value) {
            addCriterion("cycle like", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleNotLike(String value) {
            addCriterion("cycle not like", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleIn(List<String> values) {
            addCriterion("cycle in", values, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleNotIn(List<String> values) {
            addCriterion("cycle not in", values, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleBetween(String value1, String value2) {
            addCriterion("cycle between", value1, value2, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleNotBetween(String value1, String value2) {
            addCriterion("cycle not between", value1, value2, "cycle");
            return (Criteria) this;
        }

        public Criteria andRentCostIsNull() {
            addCriterion("rent_cost is null");
            return (Criteria) this;
        }

        public Criteria andRentCostIsNotNull() {
            addCriterion("rent_cost is not null");
            return (Criteria) this;
        }

        public Criteria andRentCostEqualTo(Long value) {
            addCriterion("rent_cost =", value, "rentCost");
            return (Criteria) this;
        }

        public Criteria andRentCostNotEqualTo(Long value) {
            addCriterion("rent_cost <>", value, "rentCost");
            return (Criteria) this;
        }

        public Criteria andRentCostGreaterThan(Long value) {
            addCriterion("rent_cost >", value, "rentCost");
            return (Criteria) this;
        }

        public Criteria andRentCostGreaterThanOrEqualTo(Long value) {
            addCriterion("rent_cost >=", value, "rentCost");
            return (Criteria) this;
        }

        public Criteria andRentCostLessThan(Long value) {
            addCriterion("rent_cost <", value, "rentCost");
            return (Criteria) this;
        }

        public Criteria andRentCostLessThanOrEqualTo(Long value) {
            addCriterion("rent_cost <=", value, "rentCost");
            return (Criteria) this;
        }

        public Criteria andRentCostIn(List<Long> values) {
            addCriterion("rent_cost in", values, "rentCost");
            return (Criteria) this;
        }

        public Criteria andRentCostNotIn(List<Long> values) {
            addCriterion("rent_cost not in", values, "rentCost");
            return (Criteria) this;
        }

        public Criteria andRentCostBetween(Long value1, Long value2) {
            addCriterion("rent_cost between", value1, value2, "rentCost");
            return (Criteria) this;
        }

        public Criteria andRentCostNotBetween(Long value1, Long value2) {
            addCriterion("rent_cost not between", value1, value2, "rentCost");
            return (Criteria) this;
        }

        public Criteria andEffectTimeIsNull() {
            addCriterion("effect_time is null");
            return (Criteria) this;
        }

        public Criteria andEffectTimeIsNotNull() {
            addCriterion("effect_time is not null");
            return (Criteria) this;
        }

        public Criteria andEffectTimeEqualTo(Long value) {
            addCriterion("effect_time =", value, "effectTime");
            return (Criteria) this;
        }

        public Criteria andEffectTimeNotEqualTo(Long value) {
            addCriterion("effect_time <>", value, "effectTime");
            return (Criteria) this;
        }

        public Criteria andEffectTimeGreaterThan(Long value) {
            addCriterion("effect_time >", value, "effectTime");
            return (Criteria) this;
        }

        public Criteria andEffectTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("effect_time >=", value, "effectTime");
            return (Criteria) this;
        }

        public Criteria andEffectTimeLessThan(Long value) {
            addCriterion("effect_time <", value, "effectTime");
            return (Criteria) this;
        }

        public Criteria andEffectTimeLessThanOrEqualTo(Long value) {
            addCriterion("effect_time <=", value, "effectTime");
            return (Criteria) this;
        }

        public Criteria andEffectTimeIn(List<Long> values) {
            addCriterion("effect_time in", values, "effectTime");
            return (Criteria) this;
        }

        public Criteria andEffectTimeNotIn(List<Long> values) {
            addCriterion("effect_time not in", values, "effectTime");
            return (Criteria) this;
        }

        public Criteria andEffectTimeBetween(Long value1, Long value2) {
            addCriterion("effect_time between", value1, value2, "effectTime");
            return (Criteria) this;
        }

        public Criteria andEffectTimeNotBetween(Long value1, Long value2) {
            addCriterion("effect_time not between", value1, value2, "effectTime");
            return (Criteria) this;
        }

        public Criteria andBuildIdIsNull() {
            addCriterion("build_id is null");
            return (Criteria) this;
        }

        public Criteria andBuildIdIsNotNull() {
            addCriterion("build_id is not null");
            return (Criteria) this;
        }

        public Criteria andBuildIdEqualTo(Integer value) {
            addCriterion("build_id =", value, "buildId");
            return (Criteria) this;
        }

        public Criteria andBuildIdNotEqualTo(Integer value) {
            addCriterion("build_id <>", value, "buildId");
            return (Criteria) this;
        }

        public Criteria andBuildIdGreaterThan(Integer value) {
            addCriterion("build_id >", value, "buildId");
            return (Criteria) this;
        }

        public Criteria andBuildIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("build_id >=", value, "buildId");
            return (Criteria) this;
        }

        public Criteria andBuildIdLessThan(Integer value) {
            addCriterion("build_id <", value, "buildId");
            return (Criteria) this;
        }

        public Criteria andBuildIdLessThanOrEqualTo(Integer value) {
            addCriterion("build_id <=", value, "buildId");
            return (Criteria) this;
        }

        public Criteria andBuildIdIn(List<Integer> values) {
            addCriterion("build_id in", values, "buildId");
            return (Criteria) this;
        }

        public Criteria andBuildIdNotIn(List<Integer> values) {
            addCriterion("build_id not in", values, "buildId");
            return (Criteria) this;
        }

        public Criteria andBuildIdBetween(Integer value1, Integer value2) {
            addCriterion("build_id between", value1, value2, "buildId");
            return (Criteria) this;
        }

        public Criteria andBuildIdNotBetween(Integer value1, Integer value2) {
            addCriterion("build_id not between", value1, value2, "buildId");
            return (Criteria) this;
        }

        public Criteria andBuildNameIsNull() {
            addCriterion("build_name is null");
            return (Criteria) this;
        }

        public Criteria andBuildNameIsNotNull() {
            addCriterion("build_name is not null");
            return (Criteria) this;
        }

        public Criteria andBuildNameEqualTo(String value) {
            addCriterion("build_name =", value, "buildName");
            return (Criteria) this;
        }

        public Criteria andBuildNameNotEqualTo(String value) {
            addCriterion("build_name <>", value, "buildName");
            return (Criteria) this;
        }

        public Criteria andBuildNameGreaterThan(String value) {
            addCriterion("build_name >", value, "buildName");
            return (Criteria) this;
        }

        public Criteria andBuildNameGreaterThanOrEqualTo(String value) {
            addCriterion("build_name >=", value, "buildName");
            return (Criteria) this;
        }

        public Criteria andBuildNameLessThan(String value) {
            addCriterion("build_name <", value, "buildName");
            return (Criteria) this;
        }

        public Criteria andBuildNameLessThanOrEqualTo(String value) {
            addCriterion("build_name <=", value, "buildName");
            return (Criteria) this;
        }

        public Criteria andBuildNameLike(String value) {
            addCriterion("build_name like", value, "buildName");
            return (Criteria) this;
        }

        public Criteria andBuildNameNotLike(String value) {
            addCriterion("build_name not like", value, "buildName");
            return (Criteria) this;
        }

        public Criteria andBuildNameIn(List<String> values) {
            addCriterion("build_name in", values, "buildName");
            return (Criteria) this;
        }

        public Criteria andBuildNameNotIn(List<String> values) {
            addCriterion("build_name not in", values, "buildName");
            return (Criteria) this;
        }

        public Criteria andBuildNameBetween(String value1, String value2) {
            addCriterion("build_name between", value1, value2, "buildName");
            return (Criteria) this;
        }

        public Criteria andBuildNameNotBetween(String value1, String value2) {
            addCriterion("build_name not between", value1, value2, "buildName");
            return (Criteria) this;
        }

        public Criteria andUnitIdIsNull() {
            addCriterion("unit_id is null");
            return (Criteria) this;
        }

        public Criteria andUnitIdIsNotNull() {
            addCriterion("unit_id is not null");
            return (Criteria) this;
        }

        public Criteria andUnitIdEqualTo(Integer value) {
            addCriterion("unit_id =", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotEqualTo(Integer value) {
            addCriterion("unit_id <>", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdGreaterThan(Integer value) {
            addCriterion("unit_id >", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("unit_id >=", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLessThan(Integer value) {
            addCriterion("unit_id <", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLessThanOrEqualTo(Integer value) {
            addCriterion("unit_id <=", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdIn(List<Integer> values) {
            addCriterion("unit_id in", values, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotIn(List<Integer> values) {
            addCriterion("unit_id not in", values, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdBetween(Integer value1, Integer value2) {
            addCriterion("unit_id between", value1, value2, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotBetween(Integer value1, Integer value2) {
            addCriterion("unit_id not between", value1, value2, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitNameIsNull() {
            addCriterion("unit_name is null");
            return (Criteria) this;
        }

        public Criteria andUnitNameIsNotNull() {
            addCriterion("unit_name is not null");
            return (Criteria) this;
        }

        public Criteria andUnitNameEqualTo(String value) {
            addCriterion("unit_name =", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotEqualTo(String value) {
            addCriterion("unit_name <>", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameGreaterThan(String value) {
            addCriterion("unit_name >", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameGreaterThanOrEqualTo(String value) {
            addCriterion("unit_name >=", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLessThan(String value) {
            addCriterion("unit_name <", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLessThanOrEqualTo(String value) {
            addCriterion("unit_name <=", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLike(String value) {
            addCriterion("unit_name like", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotLike(String value) {
            addCriterion("unit_name not like", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameIn(List<String> values) {
            addCriterion("unit_name in", values, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotIn(List<String> values) {
            addCriterion("unit_name not in", values, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameBetween(String value1, String value2) {
            addCriterion("unit_name between", value1, value2, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotBetween(String value1, String value2) {
            addCriterion("unit_name not between", value1, value2, "unitName");
            return (Criteria) this;
        }

        public Criteria andFloorIdIsNull() {
            addCriterion("floor_id is null");
            return (Criteria) this;
        }

        public Criteria andFloorIdIsNotNull() {
            addCriterion("floor_id is not null");
            return (Criteria) this;
        }

        public Criteria andFloorIdEqualTo(Integer value) {
            addCriterion("floor_id =", value, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdNotEqualTo(Integer value) {
            addCriterion("floor_id <>", value, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdGreaterThan(Integer value) {
            addCriterion("floor_id >", value, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("floor_id >=", value, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdLessThan(Integer value) {
            addCriterion("floor_id <", value, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdLessThanOrEqualTo(Integer value) {
            addCriterion("floor_id <=", value, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdIn(List<Integer> values) {
            addCriterion("floor_id in", values, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdNotIn(List<Integer> values) {
            addCriterion("floor_id not in", values, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdBetween(Integer value1, Integer value2) {
            addCriterion("floor_id between", value1, value2, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("floor_id not between", value1, value2, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorNameIsNull() {
            addCriterion("floor_name is null");
            return (Criteria) this;
        }

        public Criteria andFloorNameIsNotNull() {
            addCriterion("floor_name is not null");
            return (Criteria) this;
        }

        public Criteria andFloorNameEqualTo(String value) {
            addCriterion("floor_name =", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameNotEqualTo(String value) {
            addCriterion("floor_name <>", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameGreaterThan(String value) {
            addCriterion("floor_name >", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameGreaterThanOrEqualTo(String value) {
            addCriterion("floor_name >=", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameLessThan(String value) {
            addCriterion("floor_name <", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameLessThanOrEqualTo(String value) {
            addCriterion("floor_name <=", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameLike(String value) {
            addCriterion("floor_name like", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameNotLike(String value) {
            addCriterion("floor_name not like", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameIn(List<String> values) {
            addCriterion("floor_name in", values, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameNotIn(List<String> values) {
            addCriterion("floor_name not in", values, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameBetween(String value1, String value2) {
            addCriterion("floor_name between", value1, value2, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameNotBetween(String value1, String value2) {
            addCriterion("floor_name not between", value1, value2, "floorName");
            return (Criteria) this;
        }

        public Criteria andSellStatusIsNull() {
            addCriterion("sell_status is null");
            return (Criteria) this;
        }

        public Criteria andSellStatusIsNotNull() {
            addCriterion("sell_status is not null");
            return (Criteria) this;
        }

        public Criteria andSellStatusEqualTo(Integer value) {
            addCriterion("sell_status =", value, "sellStatus");
            return (Criteria) this;
        }

        public Criteria andSellStatusNotEqualTo(Integer value) {
            addCriterion("sell_status <>", value, "sellStatus");
            return (Criteria) this;
        }

        public Criteria andSellStatusGreaterThan(Integer value) {
            addCriterion("sell_status >", value, "sellStatus");
            return (Criteria) this;
        }

        public Criteria andSellStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("sell_status >=", value, "sellStatus");
            return (Criteria) this;
        }

        public Criteria andSellStatusLessThan(Integer value) {
            addCriterion("sell_status <", value, "sellStatus");
            return (Criteria) this;
        }

        public Criteria andSellStatusLessThanOrEqualTo(Integer value) {
            addCriterion("sell_status <=", value, "sellStatus");
            return (Criteria) this;
        }

        public Criteria andSellStatusIn(List<Integer> values) {
            addCriterion("sell_status in", values, "sellStatus");
            return (Criteria) this;
        }

        public Criteria andSellStatusNotIn(List<Integer> values) {
            addCriterion("sell_status not in", values, "sellStatus");
            return (Criteria) this;
        }

        public Criteria andSellStatusBetween(Integer value1, Integer value2) {
            addCriterion("sell_status between", value1, value2, "sellStatus");
            return (Criteria) this;
        }

        public Criteria andSellStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("sell_status not between", value1, value2, "sellStatus");
            return (Criteria) this;
        }

        public Criteria andSellDateIsNull() {
            addCriterion("sell_date is null");
            return (Criteria) this;
        }

        public Criteria andSellDateIsNotNull() {
            addCriterion("sell_date is not null");
            return (Criteria) this;
        }

        public Criteria andSellDateEqualTo(Long value) {
            addCriterion("sell_date =", value, "sellDate");
            return (Criteria) this;
        }

        public Criteria andSellDateNotEqualTo(Long value) {
            addCriterion("sell_date <>", value, "sellDate");
            return (Criteria) this;
        }

        public Criteria andSellDateGreaterThan(Long value) {
            addCriterion("sell_date >", value, "sellDate");
            return (Criteria) this;
        }

        public Criteria andSellDateGreaterThanOrEqualTo(Long value) {
            addCriterion("sell_date >=", value, "sellDate");
            return (Criteria) this;
        }

        public Criteria andSellDateLessThan(Long value) {
            addCriterion("sell_date <", value, "sellDate");
            return (Criteria) this;
        }

        public Criteria andSellDateLessThanOrEqualTo(Long value) {
            addCriterion("sell_date <=", value, "sellDate");
            return (Criteria) this;
        }

        public Criteria andSellDateIn(List<Long> values) {
            addCriterion("sell_date in", values, "sellDate");
            return (Criteria) this;
        }

        public Criteria andSellDateNotIn(List<Long> values) {
            addCriterion("sell_date not in", values, "sellDate");
            return (Criteria) this;
        }

        public Criteria andSellDateBetween(Long value1, Long value2) {
            addCriterion("sell_date between", value1, value2, "sellDate");
            return (Criteria) this;
        }

        public Criteria andSellDateNotBetween(Long value1, Long value2) {
            addCriterion("sell_date not between", value1, value2, "sellDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseraIsNull() {
            addCriterion("purchasera is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseraIsNotNull() {
            addCriterion("purchasera is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseraEqualTo(String value) {
            addCriterion("purchasera =", value, "purchasera");
            return (Criteria) this;
        }

        public Criteria andPurchaseraNotEqualTo(String value) {
            addCriterion("purchasera <>", value, "purchasera");
            return (Criteria) this;
        }

        public Criteria andPurchaseraGreaterThan(String value) {
            addCriterion("purchasera >", value, "purchasera");
            return (Criteria) this;
        }

        public Criteria andPurchaseraGreaterThanOrEqualTo(String value) {
            addCriterion("purchasera >=", value, "purchasera");
            return (Criteria) this;
        }

        public Criteria andPurchaseraLessThan(String value) {
            addCriterion("purchasera <", value, "purchasera");
            return (Criteria) this;
        }

        public Criteria andPurchaseraLessThanOrEqualTo(String value) {
            addCriterion("purchasera <=", value, "purchasera");
            return (Criteria) this;
        }

        public Criteria andPurchaseraLike(String value) {
            addCriterion("purchasera like", value, "purchasera");
            return (Criteria) this;
        }

        public Criteria andPurchaseraNotLike(String value) {
            addCriterion("purchasera not like", value, "purchasera");
            return (Criteria) this;
        }

        public Criteria andPurchaseraIn(List<String> values) {
            addCriterion("purchasera in", values, "purchasera");
            return (Criteria) this;
        }

        public Criteria andPurchaseraNotIn(List<String> values) {
            addCriterion("purchasera not in", values, "purchasera");
            return (Criteria) this;
        }

        public Criteria andPurchaseraBetween(String value1, String value2) {
            addCriterion("purchasera between", value1, value2, "purchasera");
            return (Criteria) this;
        }

        public Criteria andPurchaseraNotBetween(String value1, String value2) {
            addCriterion("purchasera not between", value1, value2, "purchasera");
            return (Criteria) this;
        }

        public Criteria andKeepOrganIdIsNull() {
            addCriterion("keep_organ_id is null");
            return (Criteria) this;
        }

        public Criteria andKeepOrganIdIsNotNull() {
            addCriterion("keep_organ_id is not null");
            return (Criteria) this;
        }

        public Criteria andKeepOrganIdEqualTo(Integer value) {
            addCriterion("keep_organ_id =", value, "keepOrganId");
            return (Criteria) this;
        }

        public Criteria andKeepOrganIdNotEqualTo(Integer value) {
            addCriterion("keep_organ_id <>", value, "keepOrganId");
            return (Criteria) this;
        }

        public Criteria andKeepOrganIdGreaterThan(Integer value) {
            addCriterion("keep_organ_id >", value, "keepOrganId");
            return (Criteria) this;
        }

        public Criteria andKeepOrganIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("keep_organ_id >=", value, "keepOrganId");
            return (Criteria) this;
        }

        public Criteria andKeepOrganIdLessThan(Integer value) {
            addCriterion("keep_organ_id <", value, "keepOrganId");
            return (Criteria) this;
        }

        public Criteria andKeepOrganIdLessThanOrEqualTo(Integer value) {
            addCriterion("keep_organ_id <=", value, "keepOrganId");
            return (Criteria) this;
        }

        public Criteria andKeepOrganIdIn(List<Integer> values) {
            addCriterion("keep_organ_id in", values, "keepOrganId");
            return (Criteria) this;
        }

        public Criteria andKeepOrganIdNotIn(List<Integer> values) {
            addCriterion("keep_organ_id not in", values, "keepOrganId");
            return (Criteria) this;
        }

        public Criteria andKeepOrganIdBetween(Integer value1, Integer value2) {
            addCriterion("keep_organ_id between", value1, value2, "keepOrganId");
            return (Criteria) this;
        }

        public Criteria andKeepOrganIdNotBetween(Integer value1, Integer value2) {
            addCriterion("keep_organ_id not between", value1, value2, "keepOrganId");
            return (Criteria) this;
        }

        public Criteria andKeepOrganNameIsNull() {
            addCriterion("keep_organ_name is null");
            return (Criteria) this;
        }

        public Criteria andKeepOrganNameIsNotNull() {
            addCriterion("keep_organ_name is not null");
            return (Criteria) this;
        }

        public Criteria andKeepOrganNameEqualTo(String value) {
            addCriterion("keep_organ_name =", value, "keepOrganName");
            return (Criteria) this;
        }

        public Criteria andKeepOrganNameNotEqualTo(String value) {
            addCriterion("keep_organ_name <>", value, "keepOrganName");
            return (Criteria) this;
        }

        public Criteria andKeepOrganNameGreaterThan(String value) {
            addCriterion("keep_organ_name >", value, "keepOrganName");
            return (Criteria) this;
        }

        public Criteria andKeepOrganNameGreaterThanOrEqualTo(String value) {
            addCriterion("keep_organ_name >=", value, "keepOrganName");
            return (Criteria) this;
        }

        public Criteria andKeepOrganNameLessThan(String value) {
            addCriterion("keep_organ_name <", value, "keepOrganName");
            return (Criteria) this;
        }

        public Criteria andKeepOrganNameLessThanOrEqualTo(String value) {
            addCriterion("keep_organ_name <=", value, "keepOrganName");
            return (Criteria) this;
        }

        public Criteria andKeepOrganNameLike(String value) {
            addCriterion("keep_organ_name like", value, "keepOrganName");
            return (Criteria) this;
        }

        public Criteria andKeepOrganNameNotLike(String value) {
            addCriterion("keep_organ_name not like", value, "keepOrganName");
            return (Criteria) this;
        }

        public Criteria andKeepOrganNameIn(List<String> values) {
            addCriterion("keep_organ_name in", values, "keepOrganName");
            return (Criteria) this;
        }

        public Criteria andKeepOrganNameNotIn(List<String> values) {
            addCriterion("keep_organ_name not in", values, "keepOrganName");
            return (Criteria) this;
        }

        public Criteria andKeepOrganNameBetween(String value1, String value2) {
            addCriterion("keep_organ_name between", value1, value2, "keepOrganName");
            return (Criteria) this;
        }

        public Criteria andKeepOrganNameNotBetween(String value1, String value2) {
            addCriterion("keep_organ_name not between", value1, value2, "keepOrganName");
            return (Criteria) this;
        }

        public Criteria andQuitCauseIsNull() {
            addCriterion("quit_cause is null");
            return (Criteria) this;
        }

        public Criteria andQuitCauseIsNotNull() {
            addCriterion("quit_cause is not null");
            return (Criteria) this;
        }

        public Criteria andQuitCauseEqualTo(String value) {
            addCriterion("quit_cause =", value, "quitCause");
            return (Criteria) this;
        }

        public Criteria andQuitCauseNotEqualTo(String value) {
            addCriterion("quit_cause <>", value, "quitCause");
            return (Criteria) this;
        }

        public Criteria andQuitCauseGreaterThan(String value) {
            addCriterion("quit_cause >", value, "quitCause");
            return (Criteria) this;
        }

        public Criteria andQuitCauseGreaterThanOrEqualTo(String value) {
            addCriterion("quit_cause >=", value, "quitCause");
            return (Criteria) this;
        }

        public Criteria andQuitCauseLessThan(String value) {
            addCriterion("quit_cause <", value, "quitCause");
            return (Criteria) this;
        }

        public Criteria andQuitCauseLessThanOrEqualTo(String value) {
            addCriterion("quit_cause <=", value, "quitCause");
            return (Criteria) this;
        }

        public Criteria andQuitCauseLike(String value) {
            addCriterion("quit_cause like", value, "quitCause");
            return (Criteria) this;
        }

        public Criteria andQuitCauseNotLike(String value) {
            addCriterion("quit_cause not like", value, "quitCause");
            return (Criteria) this;
        }

        public Criteria andQuitCauseIn(List<String> values) {
            addCriterion("quit_cause in", values, "quitCause");
            return (Criteria) this;
        }

        public Criteria andQuitCauseNotIn(List<String> values) {
            addCriterion("quit_cause not in", values, "quitCause");
            return (Criteria) this;
        }

        public Criteria andQuitCauseBetween(String value1, String value2) {
            addCriterion("quit_cause between", value1, value2, "quitCause");
            return (Criteria) this;
        }

        public Criteria andQuitCauseNotBetween(String value1, String value2) {
            addCriterion("quit_cause not between", value1, value2, "quitCause");
            return (Criteria) this;
        }

        public Criteria andSoilTypeIsNull() {
            addCriterion("soil_type is null");
            return (Criteria) this;
        }

        public Criteria andSoilTypeIsNotNull() {
            addCriterion("soil_type is not null");
            return (Criteria) this;
        }

        public Criteria andSoilTypeEqualTo(Integer value) {
            addCriterion("soil_type =", value, "soilType");
            return (Criteria) this;
        }

        public Criteria andSoilTypeNotEqualTo(Integer value) {
            addCriterion("soil_type <>", value, "soilType");
            return (Criteria) this;
        }

        public Criteria andSoilTypeGreaterThan(Integer value) {
            addCriterion("soil_type >", value, "soilType");
            return (Criteria) this;
        }

        public Criteria andSoilTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("soil_type >=", value, "soilType");
            return (Criteria) this;
        }

        public Criteria andSoilTypeLessThan(Integer value) {
            addCriterion("soil_type <", value, "soilType");
            return (Criteria) this;
        }

        public Criteria andSoilTypeLessThanOrEqualTo(Integer value) {
            addCriterion("soil_type <=", value, "soilType");
            return (Criteria) this;
        }

        public Criteria andSoilTypeIn(List<Integer> values) {
            addCriterion("soil_type in", values, "soilType");
            return (Criteria) this;
        }

        public Criteria andSoilTypeNotIn(List<Integer> values) {
            addCriterion("soil_type not in", values, "soilType");
            return (Criteria) this;
        }

        public Criteria andSoilTypeBetween(Integer value1, Integer value2) {
            addCriterion("soil_type between", value1, value2, "soilType");
            return (Criteria) this;
        }

        public Criteria andSoilTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("soil_type not between", value1, value2, "soilType");
            return (Criteria) this;
        }

        public Criteria andSoilMaxTypeIsNull() {
            addCriterion("soil_max_type is null");
            return (Criteria) this;
        }

        public Criteria andSoilMaxTypeIsNotNull() {
            addCriterion("soil_max_type is not null");
            return (Criteria) this;
        }

        public Criteria andSoilMaxTypeEqualTo(Integer value) {
            addCriterion("soil_max_type =", value, "soilMaxType");
            return (Criteria) this;
        }

        public Criteria andSoilMaxTypeNotEqualTo(Integer value) {
            addCriterion("soil_max_type <>", value, "soilMaxType");
            return (Criteria) this;
        }

        public Criteria andSoilMaxTypeGreaterThan(Integer value) {
            addCriterion("soil_max_type >", value, "soilMaxType");
            return (Criteria) this;
        }

        public Criteria andSoilMaxTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("soil_max_type >=", value, "soilMaxType");
            return (Criteria) this;
        }

        public Criteria andSoilMaxTypeLessThan(Integer value) {
            addCriterion("soil_max_type <", value, "soilMaxType");
            return (Criteria) this;
        }

        public Criteria andSoilMaxTypeLessThanOrEqualTo(Integer value) {
            addCriterion("soil_max_type <=", value, "soilMaxType");
            return (Criteria) this;
        }

        public Criteria andSoilMaxTypeIn(List<Integer> values) {
            addCriterion("soil_max_type in", values, "soilMaxType");
            return (Criteria) this;
        }

        public Criteria andSoilMaxTypeNotIn(List<Integer> values) {
            addCriterion("soil_max_type not in", values, "soilMaxType");
            return (Criteria) this;
        }

        public Criteria andSoilMaxTypeBetween(Integer value1, Integer value2) {
            addCriterion("soil_max_type between", value1, value2, "soilMaxType");
            return (Criteria) this;
        }

        public Criteria andSoilMaxTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("soil_max_type not between", value1, value2, "soilMaxType");
            return (Criteria) this;
        }

        public Criteria andSoilMinTypeIsNull() {
            addCriterion("soil_min_type is null");
            return (Criteria) this;
        }

        public Criteria andSoilMinTypeIsNotNull() {
            addCriterion("soil_min_type is not null");
            return (Criteria) this;
        }

        public Criteria andSoilMinTypeEqualTo(Integer value) {
            addCriterion("soil_min_type =", value, "soilMinType");
            return (Criteria) this;
        }

        public Criteria andSoilMinTypeNotEqualTo(Integer value) {
            addCriterion("soil_min_type <>", value, "soilMinType");
            return (Criteria) this;
        }

        public Criteria andSoilMinTypeGreaterThan(Integer value) {
            addCriterion("soil_min_type >", value, "soilMinType");
            return (Criteria) this;
        }

        public Criteria andSoilMinTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("soil_min_type >=", value, "soilMinType");
            return (Criteria) this;
        }

        public Criteria andSoilMinTypeLessThan(Integer value) {
            addCriterion("soil_min_type <", value, "soilMinType");
            return (Criteria) this;
        }

        public Criteria andSoilMinTypeLessThanOrEqualTo(Integer value) {
            addCriterion("soil_min_type <=", value, "soilMinType");
            return (Criteria) this;
        }

        public Criteria andSoilMinTypeIn(List<Integer> values) {
            addCriterion("soil_min_type in", values, "soilMinType");
            return (Criteria) this;
        }

        public Criteria andSoilMinTypeNotIn(List<Integer> values) {
            addCriterion("soil_min_type not in", values, "soilMinType");
            return (Criteria) this;
        }

        public Criteria andSoilMinTypeBetween(Integer value1, Integer value2) {
            addCriterion("soil_min_type between", value1, value2, "soilMinType");
            return (Criteria) this;
        }

        public Criteria andSoilMinTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("soil_min_type not between", value1, value2, "soilMinType");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusIsNull() {
            addCriterion("approval_status is null");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusIsNotNull() {
            addCriterion("approval_status is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusEqualTo(Integer value) {
            addCriterion("approval_status =", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusNotEqualTo(Integer value) {
            addCriterion("approval_status <>", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusGreaterThan(Integer value) {
            addCriterion("approval_status >", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("approval_status >=", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusLessThan(Integer value) {
            addCriterion("approval_status <", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusLessThanOrEqualTo(Integer value) {
            addCriterion("approval_status <=", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusIn(List<Integer> values) {
            addCriterion("approval_status in", values, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusNotIn(List<Integer> values) {
            addCriterion("approval_status not in", values, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusBetween(Integer value1, Integer value2) {
            addCriterion("approval_status between", value1, value2, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("approval_status not between", value1, value2, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApplyIdIsNull() {
            addCriterion("apply_id is null");
            return (Criteria) this;
        }

        public Criteria andApplyIdIsNotNull() {
            addCriterion("apply_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplyIdEqualTo(Integer value) {
            addCriterion("apply_id =", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotEqualTo(Integer value) {
            addCriterion("apply_id <>", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdGreaterThan(Integer value) {
            addCriterion("apply_id >", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("apply_id >=", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdLessThan(Integer value) {
            addCriterion("apply_id <", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdLessThanOrEqualTo(Integer value) {
            addCriterion("apply_id <=", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdIn(List<Integer> values) {
            addCriterion("apply_id in", values, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotIn(List<Integer> values) {
            addCriterion("apply_id not in", values, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdBetween(Integer value1, Integer value2) {
            addCriterion("apply_id between", value1, value2, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("apply_id not between", value1, value2, "applyId");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIsNull() {
            addCriterion("house_type is null");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIsNotNull() {
            addCriterion("house_type is not null");
            return (Criteria) this;
        }

        public Criteria andHouseTypeEqualTo(String value) {
            addCriterion("house_type =", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotEqualTo(String value) {
            addCriterion("house_type <>", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeGreaterThan(String value) {
            addCriterion("house_type >", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("house_type >=", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeLessThan(String value) {
            addCriterion("house_type <", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeLessThanOrEqualTo(String value) {
            addCriterion("house_type <=", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeLike(String value) {
            addCriterion("house_type like", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotLike(String value) {
            addCriterion("house_type not like", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIn(List<String> values) {
            addCriterion("house_type in", values, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotIn(List<String> values) {
            addCriterion("house_type not in", values, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeBetween(String value1, String value2) {
            addCriterion("house_type between", value1, value2, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotBetween(String value1, String value2) {
            addCriterion("house_type not between", value1, value2, "houseType");
            return (Criteria) this;
        }

        public Criteria andLiveNumberIsNull() {
            addCriterion("live_number is null");
            return (Criteria) this;
        }

        public Criteria andLiveNumberIsNotNull() {
            addCriterion("live_number is not null");
            return (Criteria) this;
        }

        public Criteria andLiveNumberEqualTo(Integer value) {
            addCriterion("live_number =", value, "liveNumber");
            return (Criteria) this;
        }

        public Criteria andLiveNumberNotEqualTo(Integer value) {
            addCriterion("live_number <>", value, "liveNumber");
            return (Criteria) this;
        }

        public Criteria andLiveNumberGreaterThan(Integer value) {
            addCriterion("live_number >", value, "liveNumber");
            return (Criteria) this;
        }

        public Criteria andLiveNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("live_number >=", value, "liveNumber");
            return (Criteria) this;
        }

        public Criteria andLiveNumberLessThan(Integer value) {
            addCriterion("live_number <", value, "liveNumber");
            return (Criteria) this;
        }

        public Criteria andLiveNumberLessThanOrEqualTo(Integer value) {
            addCriterion("live_number <=", value, "liveNumber");
            return (Criteria) this;
        }

        public Criteria andLiveNumberIn(List<Integer> values) {
            addCriterion("live_number in", values, "liveNumber");
            return (Criteria) this;
        }

        public Criteria andLiveNumberNotIn(List<Integer> values) {
            addCriterion("live_number not in", values, "liveNumber");
            return (Criteria) this;
        }

        public Criteria andLiveNumberBetween(Integer value1, Integer value2) {
            addCriterion("live_number between", value1, value2, "liveNumber");
            return (Criteria) this;
        }

        public Criteria andLiveNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("live_number not between", value1, value2, "liveNumber");
            return (Criteria) this;
        }

        public Criteria andLiveSexIsNull() {
            addCriterion("live_sex is null");
            return (Criteria) this;
        }

        public Criteria andLiveSexIsNotNull() {
            addCriterion("live_sex is not null");
            return (Criteria) this;
        }

        public Criteria andLiveSexEqualTo(Integer value) {
            addCriterion("live_sex =", value, "liveSex");
            return (Criteria) this;
        }

        public Criteria andLiveSexNotEqualTo(Integer value) {
            addCriterion("live_sex <>", value, "liveSex");
            return (Criteria) this;
        }

        public Criteria andLiveSexGreaterThan(Integer value) {
            addCriterion("live_sex >", value, "liveSex");
            return (Criteria) this;
        }

        public Criteria andLiveSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("live_sex >=", value, "liveSex");
            return (Criteria) this;
        }

        public Criteria andLiveSexLessThan(Integer value) {
            addCriterion("live_sex <", value, "liveSex");
            return (Criteria) this;
        }

        public Criteria andLiveSexLessThanOrEqualTo(Integer value) {
            addCriterion("live_sex <=", value, "liveSex");
            return (Criteria) this;
        }

        public Criteria andLiveSexIn(List<Integer> values) {
            addCriterion("live_sex in", values, "liveSex");
            return (Criteria) this;
        }

        public Criteria andLiveSexNotIn(List<Integer> values) {
            addCriterion("live_sex not in", values, "liveSex");
            return (Criteria) this;
        }

        public Criteria andLiveSexBetween(Integer value1, Integer value2) {
            addCriterion("live_sex between", value1, value2, "liveSex");
            return (Criteria) this;
        }

        public Criteria andLiveSexNotBetween(Integer value1, Integer value2) {
            addCriterion("live_sex not between", value1, value2, "liveSex");
            return (Criteria) this;
        }

        public Criteria andAllotStatusIsNull() {
            addCriterion("allot_status is null");
            return (Criteria) this;
        }

        public Criteria andAllotStatusIsNotNull() {
            addCriterion("allot_status is not null");
            return (Criteria) this;
        }

        public Criteria andAllotStatusEqualTo(Byte value) {
            addCriterion("allot_status =", value, "allotStatus");
            return (Criteria) this;
        }

        public Criteria andAllotStatusNotEqualTo(Byte value) {
            addCriterion("allot_status <>", value, "allotStatus");
            return (Criteria) this;
        }

        public Criteria andAllotStatusGreaterThan(Byte value) {
            addCriterion("allot_status >", value, "allotStatus");
            return (Criteria) this;
        }

        public Criteria andAllotStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("allot_status >=", value, "allotStatus");
            return (Criteria) this;
        }

        public Criteria andAllotStatusLessThan(Byte value) {
            addCriterion("allot_status <", value, "allotStatus");
            return (Criteria) this;
        }

        public Criteria andAllotStatusLessThanOrEqualTo(Byte value) {
            addCriterion("allot_status <=", value, "allotStatus");
            return (Criteria) this;
        }

        public Criteria andAllotStatusIn(List<Byte> values) {
            addCriterion("allot_status in", values, "allotStatus");
            return (Criteria) this;
        }

        public Criteria andAllotStatusNotIn(List<Byte> values) {
            addCriterion("allot_status not in", values, "allotStatus");
            return (Criteria) this;
        }

        public Criteria andAllotStatusBetween(Byte value1, Byte value2) {
            addCriterion("allot_status between", value1, value2, "allotStatus");
            return (Criteria) this;
        }

        public Criteria andAllotStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("allot_status not between", value1, value2, "allotStatus");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNull() {
            addCriterion("contract_id is null");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNotNull() {
            addCriterion("contract_id is not null");
            return (Criteria) this;
        }

        public Criteria andContractIdEqualTo(Integer value) {
            addCriterion("contract_id =", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotEqualTo(Integer value) {
            addCriterion("contract_id <>", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThan(Integer value) {
            addCriterion("contract_id >", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("contract_id >=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThan(Integer value) {
            addCriterion("contract_id <", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThanOrEqualTo(Integer value) {
            addCriterion("contract_id <=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdIn(List<Integer> values) {
            addCriterion("contract_id in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotIn(List<Integer> values) {
            addCriterion("contract_id not in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdBetween(Integer value1, Integer value2) {
            addCriterion("contract_id between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotBetween(Integer value1, Integer value2) {
            addCriterion("contract_id not between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andSaleStatusIsNull() {
            addCriterion("sale_status is null");
            return (Criteria) this;
        }

        public Criteria andSaleStatusIsNotNull() {
            addCriterion("sale_status is not null");
            return (Criteria) this;
        }

        public Criteria andSaleStatusEqualTo(Integer value) {
            addCriterion("sale_status =", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusNotEqualTo(Integer value) {
            addCriterion("sale_status <>", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusGreaterThan(Integer value) {
            addCriterion("sale_status >", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_status >=", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusLessThan(Integer value) {
            addCriterion("sale_status <", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusLessThanOrEqualTo(Integer value) {
            addCriterion("sale_status <=", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusIn(List<Integer> values) {
            addCriterion("sale_status in", values, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusNotIn(List<Integer> values) {
            addCriterion("sale_status not in", values, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusBetween(Integer value1, Integer value2) {
            addCriterion("sale_status between", value1, value2, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_status not between", value1, value2, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andParkNameIsNull() {
            addCriterion("park_name is null");
            return (Criteria) this;
        }

        public Criteria andParkNameIsNotNull() {
            addCriterion("park_name is not null");
            return (Criteria) this;
        }

        public Criteria andParkNameEqualTo(String value) {
            addCriterion("park_name =", value, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameNotEqualTo(String value) {
            addCriterion("park_name <>", value, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameGreaterThan(String value) {
            addCriterion("park_name >", value, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameGreaterThanOrEqualTo(String value) {
            addCriterion("park_name >=", value, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameLessThan(String value) {
            addCriterion("park_name <", value, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameLessThanOrEqualTo(String value) {
            addCriterion("park_name <=", value, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameLike(String value) {
            addCriterion("park_name like", value, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameNotLike(String value) {
            addCriterion("park_name not like", value, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameIn(List<String> values) {
            addCriterion("park_name in", values, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameNotIn(List<String> values) {
            addCriterion("park_name not in", values, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameBetween(String value1, String value2) {
            addCriterion("park_name between", value1, value2, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameNotBetween(String value1, String value2) {
            addCriterion("park_name not between", value1, value2, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameCodeIsNull() {
            addCriterion("park_name_code is null");
            return (Criteria) this;
        }

        public Criteria andParkNameCodeIsNotNull() {
            addCriterion("park_name_code is not null");
            return (Criteria) this;
        }

        public Criteria andParkNameCodeEqualTo(Integer value) {
            addCriterion("park_name_code =", value, "parkNameCode");
            return (Criteria) this;
        }

        public Criteria andParkNameCodeNotEqualTo(Integer value) {
            addCriterion("park_name_code <>", value, "parkNameCode");
            return (Criteria) this;
        }

        public Criteria andParkNameCodeGreaterThan(Integer value) {
            addCriterion("park_name_code >", value, "parkNameCode");
            return (Criteria) this;
        }

        public Criteria andParkNameCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("park_name_code >=", value, "parkNameCode");
            return (Criteria) this;
        }

        public Criteria andParkNameCodeLessThan(Integer value) {
            addCriterion("park_name_code <", value, "parkNameCode");
            return (Criteria) this;
        }

        public Criteria andParkNameCodeLessThanOrEqualTo(Integer value) {
            addCriterion("park_name_code <=", value, "parkNameCode");
            return (Criteria) this;
        }

        public Criteria andParkNameCodeIn(List<Integer> values) {
            addCriterion("park_name_code in", values, "parkNameCode");
            return (Criteria) this;
        }

        public Criteria andParkNameCodeNotIn(List<Integer> values) {
            addCriterion("park_name_code not in", values, "parkNameCode");
            return (Criteria) this;
        }

        public Criteria andParkNameCodeBetween(Integer value1, Integer value2) {
            addCriterion("park_name_code between", value1, value2, "parkNameCode");
            return (Criteria) this;
        }

        public Criteria andParkNameCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("park_name_code not between", value1, value2, "parkNameCode");
            return (Criteria) this;
        }

        public Criteria andParkDistrictIsNull() {
            addCriterion("park_district is null");
            return (Criteria) this;
        }

        public Criteria andParkDistrictIsNotNull() {
            addCriterion("park_district is not null");
            return (Criteria) this;
        }

        public Criteria andParkDistrictEqualTo(String value) {
            addCriterion("park_district =", value, "parkDistrict");
            return (Criteria) this;
        }

        public Criteria andParkDistrictNotEqualTo(String value) {
            addCriterion("park_district <>", value, "parkDistrict");
            return (Criteria) this;
        }

        public Criteria andParkDistrictGreaterThan(String value) {
            addCriterion("park_district >", value, "parkDistrict");
            return (Criteria) this;
        }

        public Criteria andParkDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("park_district >=", value, "parkDistrict");
            return (Criteria) this;
        }

        public Criteria andParkDistrictLessThan(String value) {
            addCriterion("park_district <", value, "parkDistrict");
            return (Criteria) this;
        }

        public Criteria andParkDistrictLessThanOrEqualTo(String value) {
            addCriterion("park_district <=", value, "parkDistrict");
            return (Criteria) this;
        }

        public Criteria andParkDistrictLike(String value) {
            addCriterion("park_district like", value, "parkDistrict");
            return (Criteria) this;
        }

        public Criteria andParkDistrictNotLike(String value) {
            addCriterion("park_district not like", value, "parkDistrict");
            return (Criteria) this;
        }

        public Criteria andParkDistrictIn(List<String> values) {
            addCriterion("park_district in", values, "parkDistrict");
            return (Criteria) this;
        }

        public Criteria andParkDistrictNotIn(List<String> values) {
            addCriterion("park_district not in", values, "parkDistrict");
            return (Criteria) this;
        }

        public Criteria andParkDistrictBetween(String value1, String value2) {
            addCriterion("park_district between", value1, value2, "parkDistrict");
            return (Criteria) this;
        }

        public Criteria andParkDistrictNotBetween(String value1, String value2) {
            addCriterion("park_district not between", value1, value2, "parkDistrict");
            return (Criteria) this;
        }

        public Criteria andParkDistrictCodeIsNull() {
            addCriterion("park_district_code is null");
            return (Criteria) this;
        }

        public Criteria andParkDistrictCodeIsNotNull() {
            addCriterion("park_district_code is not null");
            return (Criteria) this;
        }

        public Criteria andParkDistrictCodeEqualTo(Integer value) {
            addCriterion("park_district_code =", value, "parkDistrictCode");
            return (Criteria) this;
        }

        public Criteria andParkDistrictCodeNotEqualTo(Integer value) {
            addCriterion("park_district_code <>", value, "parkDistrictCode");
            return (Criteria) this;
        }

        public Criteria andParkDistrictCodeGreaterThan(Integer value) {
            addCriterion("park_district_code >", value, "parkDistrictCode");
            return (Criteria) this;
        }

        public Criteria andParkDistrictCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("park_district_code >=", value, "parkDistrictCode");
            return (Criteria) this;
        }

        public Criteria andParkDistrictCodeLessThan(Integer value) {
            addCriterion("park_district_code <", value, "parkDistrictCode");
            return (Criteria) this;
        }

        public Criteria andParkDistrictCodeLessThanOrEqualTo(Integer value) {
            addCriterion("park_district_code <=", value, "parkDistrictCode");
            return (Criteria) this;
        }

        public Criteria andParkDistrictCodeIn(List<Integer> values) {
            addCriterion("park_district_code in", values, "parkDistrictCode");
            return (Criteria) this;
        }

        public Criteria andParkDistrictCodeNotIn(List<Integer> values) {
            addCriterion("park_district_code not in", values, "parkDistrictCode");
            return (Criteria) this;
        }

        public Criteria andParkDistrictCodeBetween(Integer value1, Integer value2) {
            addCriterion("park_district_code between", value1, value2, "parkDistrictCode");
            return (Criteria) this;
        }

        public Criteria andParkDistrictCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("park_district_code not between", value1, value2, "parkDistrictCode");
            return (Criteria) this;
        }

        public Criteria andObjTypeIsNull() {
            addCriterion("obj_type is null");
            return (Criteria) this;
        }

        public Criteria andObjTypeIsNotNull() {
            addCriterion("obj_type is not null");
            return (Criteria) this;
        }

        public Criteria andObjTypeEqualTo(String value) {
            addCriterion("obj_type =", value, "objType");
            return (Criteria) this;
        }

        public Criteria andObjTypeNotEqualTo(String value) {
            addCriterion("obj_type <>", value, "objType");
            return (Criteria) this;
        }

        public Criteria andObjTypeGreaterThan(String value) {
            addCriterion("obj_type >", value, "objType");
            return (Criteria) this;
        }

        public Criteria andObjTypeGreaterThanOrEqualTo(String value) {
            addCriterion("obj_type >=", value, "objType");
            return (Criteria) this;
        }

        public Criteria andObjTypeLessThan(String value) {
            addCriterion("obj_type <", value, "objType");
            return (Criteria) this;
        }

        public Criteria andObjTypeLessThanOrEqualTo(String value) {
            addCriterion("obj_type <=", value, "objType");
            return (Criteria) this;
        }

        public Criteria andObjTypeLike(String value) {
            addCriterion("obj_type like", value, "objType");
            return (Criteria) this;
        }

        public Criteria andObjTypeNotLike(String value) {
            addCriterion("obj_type not like", value, "objType");
            return (Criteria) this;
        }

        public Criteria andObjTypeIn(List<String> values) {
            addCriterion("obj_type in", values, "objType");
            return (Criteria) this;
        }

        public Criteria andObjTypeNotIn(List<String> values) {
            addCriterion("obj_type not in", values, "objType");
            return (Criteria) this;
        }

        public Criteria andObjTypeBetween(String value1, String value2) {
            addCriterion("obj_type between", value1, value2, "objType");
            return (Criteria) this;
        }

        public Criteria andObjTypeNotBetween(String value1, String value2) {
            addCriterion("obj_type not between", value1, value2, "objType");
            return (Criteria) this;
        }

        public Criteria andObjTypeCodeIsNull() {
            addCriterion("obj_type_code is null");
            return (Criteria) this;
        }

        public Criteria andObjTypeCodeIsNotNull() {
            addCriterion("obj_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andObjTypeCodeEqualTo(Integer value) {
            addCriterion("obj_type_code =", value, "objTypeCode");
            return (Criteria) this;
        }

        public Criteria andObjTypeCodeNotEqualTo(Integer value) {
            addCriterion("obj_type_code <>", value, "objTypeCode");
            return (Criteria) this;
        }

        public Criteria andObjTypeCodeGreaterThan(Integer value) {
            addCriterion("obj_type_code >", value, "objTypeCode");
            return (Criteria) this;
        }

        public Criteria andObjTypeCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("obj_type_code >=", value, "objTypeCode");
            return (Criteria) this;
        }

        public Criteria andObjTypeCodeLessThan(Integer value) {
            addCriterion("obj_type_code <", value, "objTypeCode");
            return (Criteria) this;
        }

        public Criteria andObjTypeCodeLessThanOrEqualTo(Integer value) {
            addCriterion("obj_type_code <=", value, "objTypeCode");
            return (Criteria) this;
        }

        public Criteria andObjTypeCodeIn(List<Integer> values) {
            addCriterion("obj_type_code in", values, "objTypeCode");
            return (Criteria) this;
        }

        public Criteria andObjTypeCodeNotIn(List<Integer> values) {
            addCriterion("obj_type_code not in", values, "objTypeCode");
            return (Criteria) this;
        }

        public Criteria andObjTypeCodeBetween(Integer value1, Integer value2) {
            addCriterion("obj_type_code between", value1, value2, "objTypeCode");
            return (Criteria) this;
        }

        public Criteria andObjTypeCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("obj_type_code not between", value1, value2, "objTypeCode");
            return (Criteria) this;
        }

        public Criteria andParkLocalCodeIsNull() {
            addCriterion("park_local_code is null");
            return (Criteria) this;
        }

        public Criteria andParkLocalCodeIsNotNull() {
            addCriterion("park_local_code is not null");
            return (Criteria) this;
        }

        public Criteria andParkLocalCodeEqualTo(String value) {
            addCriterion("park_local_code =", value, "parkLocalCode");
            return (Criteria) this;
        }

        public Criteria andParkLocalCodeNotEqualTo(String value) {
            addCriterion("park_local_code <>", value, "parkLocalCode");
            return (Criteria) this;
        }

        public Criteria andParkLocalCodeGreaterThan(String value) {
            addCriterion("park_local_code >", value, "parkLocalCode");
            return (Criteria) this;
        }

        public Criteria andParkLocalCodeGreaterThanOrEqualTo(String value) {
            addCriterion("park_local_code >=", value, "parkLocalCode");
            return (Criteria) this;
        }

        public Criteria andParkLocalCodeLessThan(String value) {
            addCriterion("park_local_code <", value, "parkLocalCode");
            return (Criteria) this;
        }

        public Criteria andParkLocalCodeLessThanOrEqualTo(String value) {
            addCriterion("park_local_code <=", value, "parkLocalCode");
            return (Criteria) this;
        }

        public Criteria andParkLocalCodeLike(String value) {
            addCriterion("park_local_code like", value, "parkLocalCode");
            return (Criteria) this;
        }

        public Criteria andParkLocalCodeNotLike(String value) {
            addCriterion("park_local_code not like", value, "parkLocalCode");
            return (Criteria) this;
        }

        public Criteria andParkLocalCodeIn(List<String> values) {
            addCriterion("park_local_code in", values, "parkLocalCode");
            return (Criteria) this;
        }

        public Criteria andParkLocalCodeNotIn(List<String> values) {
            addCriterion("park_local_code not in", values, "parkLocalCode");
            return (Criteria) this;
        }

        public Criteria andParkLocalCodeBetween(String value1, String value2) {
            addCriterion("park_local_code between", value1, value2, "parkLocalCode");
            return (Criteria) this;
        }

        public Criteria andParkLocalCodeNotBetween(String value1, String value2) {
            addCriterion("park_local_code not between", value1, value2, "parkLocalCode");
            return (Criteria) this;
        }

        public Criteria andFirstIdIsNull() {
            addCriterion("first_id is null");
            return (Criteria) this;
        }

        public Criteria andFirstIdIsNotNull() {
            addCriterion("first_id is not null");
            return (Criteria) this;
        }

        public Criteria andFirstIdEqualTo(Integer value) {
            addCriterion("first_id =", value, "firstId");
            return (Criteria) this;
        }

        public Criteria andFirstIdNotEqualTo(Integer value) {
            addCriterion("first_id <>", value, "firstId");
            return (Criteria) this;
        }

        public Criteria andFirstIdGreaterThan(Integer value) {
            addCriterion("first_id >", value, "firstId");
            return (Criteria) this;
        }

        public Criteria andFirstIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("first_id >=", value, "firstId");
            return (Criteria) this;
        }

        public Criteria andFirstIdLessThan(Integer value) {
            addCriterion("first_id <", value, "firstId");
            return (Criteria) this;
        }

        public Criteria andFirstIdLessThanOrEqualTo(Integer value) {
            addCriterion("first_id <=", value, "firstId");
            return (Criteria) this;
        }

        public Criteria andFirstIdIn(List<Integer> values) {
            addCriterion("first_id in", values, "firstId");
            return (Criteria) this;
        }

        public Criteria andFirstIdNotIn(List<Integer> values) {
            addCriterion("first_id not in", values, "firstId");
            return (Criteria) this;
        }

        public Criteria andFirstIdBetween(Integer value1, Integer value2) {
            addCriterion("first_id between", value1, value2, "firstId");
            return (Criteria) this;
        }

        public Criteria andFirstIdNotBetween(Integer value1, Integer value2) {
            addCriterion("first_id not between", value1, value2, "firstId");
            return (Criteria) this;
        }

        public Criteria andFirstGroupIdIsNull() {
            addCriterion("first_group_id is null");
            return (Criteria) this;
        }

        public Criteria andFirstGroupIdIsNotNull() {
            addCriterion("first_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andFirstGroupIdEqualTo(Integer value) {
            addCriterion("first_group_id =", value, "firstGroupId");
            return (Criteria) this;
        }

        public Criteria andFirstGroupIdNotEqualTo(Integer value) {
            addCriterion("first_group_id <>", value, "firstGroupId");
            return (Criteria) this;
        }

        public Criteria andFirstGroupIdGreaterThan(Integer value) {
            addCriterion("first_group_id >", value, "firstGroupId");
            return (Criteria) this;
        }

        public Criteria andFirstGroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("first_group_id >=", value, "firstGroupId");
            return (Criteria) this;
        }

        public Criteria andFirstGroupIdLessThan(Integer value) {
            addCriterion("first_group_id <", value, "firstGroupId");
            return (Criteria) this;
        }

        public Criteria andFirstGroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("first_group_id <=", value, "firstGroupId");
            return (Criteria) this;
        }

        public Criteria andFirstGroupIdIn(List<Integer> values) {
            addCriterion("first_group_id in", values, "firstGroupId");
            return (Criteria) this;
        }

        public Criteria andFirstGroupIdNotIn(List<Integer> values) {
            addCriterion("first_group_id not in", values, "firstGroupId");
            return (Criteria) this;
        }

        public Criteria andFirstGroupIdBetween(Integer value1, Integer value2) {
            addCriterion("first_group_id between", value1, value2, "firstGroupId");
            return (Criteria) this;
        }

        public Criteria andFirstGroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("first_group_id not between", value1, value2, "firstGroupId");
            return (Criteria) this;
        }

        public Criteria andFirstNameIsNull() {
            addCriterion("first_name is null");
            return (Criteria) this;
        }

        public Criteria andFirstNameIsNotNull() {
            addCriterion("first_name is not null");
            return (Criteria) this;
        }

        public Criteria andFirstNameEqualTo(String value) {
            addCriterion("first_name =", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotEqualTo(String value) {
            addCriterion("first_name <>", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameGreaterThan(String value) {
            addCriterion("first_name >", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameGreaterThanOrEqualTo(String value) {
            addCriterion("first_name >=", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameLessThan(String value) {
            addCriterion("first_name <", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameLessThanOrEqualTo(String value) {
            addCriterion("first_name <=", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameLike(String value) {
            addCriterion("first_name like", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotLike(String value) {
            addCriterion("first_name not like", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameIn(List<String> values) {
            addCriterion("first_name in", values, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotIn(List<String> values) {
            addCriterion("first_name not in", values, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameBetween(String value1, String value2) {
            addCriterion("first_name between", value1, value2, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotBetween(String value1, String value2) {
            addCriterion("first_name not between", value1, value2, "firstName");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(BigDecimal value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(BigDecimal value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(BigDecimal value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(BigDecimal value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<BigDecimal> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<BigDecimal> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andUseAreaIsNull() {
            addCriterion("use_area is null");
            return (Criteria) this;
        }

        public Criteria andUseAreaIsNotNull() {
            addCriterion("use_area is not null");
            return (Criteria) this;
        }

        public Criteria andUseAreaEqualTo(BigDecimal value) {
            addCriterion("use_area =", value, "useArea");
            return (Criteria) this;
        }

        public Criteria andUseAreaNotEqualTo(BigDecimal value) {
            addCriterion("use_area <>", value, "useArea");
            return (Criteria) this;
        }

        public Criteria andUseAreaGreaterThan(BigDecimal value) {
            addCriterion("use_area >", value, "useArea");
            return (Criteria) this;
        }

        public Criteria andUseAreaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("use_area >=", value, "useArea");
            return (Criteria) this;
        }

        public Criteria andUseAreaLessThan(BigDecimal value) {
            addCriterion("use_area <", value, "useArea");
            return (Criteria) this;
        }

        public Criteria andUseAreaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("use_area <=", value, "useArea");
            return (Criteria) this;
        }

        public Criteria andUseAreaIn(List<BigDecimal> values) {
            addCriterion("use_area in", values, "useArea");
            return (Criteria) this;
        }

        public Criteria andUseAreaNotIn(List<BigDecimal> values) {
            addCriterion("use_area not in", values, "useArea");
            return (Criteria) this;
        }

        public Criteria andUseAreaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("use_area between", value1, value2, "useArea");
            return (Criteria) this;
        }

        public Criteria andUseAreaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("use_area not between", value1, value2, "useArea");
            return (Criteria) this;
        }

        public Criteria andOptStatusIsNull() {
            addCriterion("opt_status is null");
            return (Criteria) this;
        }

        public Criteria andOptStatusIsNotNull() {
            addCriterion("opt_status is not null");
            return (Criteria) this;
        }

        public Criteria andOptStatusEqualTo(Byte value) {
            addCriterion("opt_status =", value, "optStatus");
            return (Criteria) this;
        }

        public Criteria andOptStatusNotEqualTo(Byte value) {
            addCriterion("opt_status <>", value, "optStatus");
            return (Criteria) this;
        }

        public Criteria andOptStatusGreaterThan(Byte value) {
            addCriterion("opt_status >", value, "optStatus");
            return (Criteria) this;
        }

        public Criteria andOptStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("opt_status >=", value, "optStatus");
            return (Criteria) this;
        }

        public Criteria andOptStatusLessThan(Byte value) {
            addCriterion("opt_status <", value, "optStatus");
            return (Criteria) this;
        }

        public Criteria andOptStatusLessThanOrEqualTo(Byte value) {
            addCriterion("opt_status <=", value, "optStatus");
            return (Criteria) this;
        }

        public Criteria andOptStatusIn(List<Byte> values) {
            addCriterion("opt_status in", values, "optStatus");
            return (Criteria) this;
        }

        public Criteria andOptStatusNotIn(List<Byte> values) {
            addCriterion("opt_status not in", values, "optStatus");
            return (Criteria) this;
        }

        public Criteria andOptStatusBetween(Byte value1, Byte value2) {
            addCriterion("opt_status between", value1, value2, "optStatus");
            return (Criteria) this;
        }

        public Criteria andOptStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("opt_status not between", value1, value2, "optStatus");
            return (Criteria) this;
        }

        public Criteria andLockReasonIsNull() {
            addCriterion("lock_reason is null");
            return (Criteria) this;
        }

        public Criteria andLockReasonIsNotNull() {
            addCriterion("lock_reason is not null");
            return (Criteria) this;
        }

        public Criteria andLockReasonEqualTo(Integer value) {
            addCriterion("lock_reason =", value, "lockReason");
            return (Criteria) this;
        }

        public Criteria andLockReasonNotEqualTo(Integer value) {
            addCriterion("lock_reason <>", value, "lockReason");
            return (Criteria) this;
        }

        public Criteria andLockReasonGreaterThan(Integer value) {
            addCriterion("lock_reason >", value, "lockReason");
            return (Criteria) this;
        }

        public Criteria andLockReasonGreaterThanOrEqualTo(Integer value) {
            addCriterion("lock_reason >=", value, "lockReason");
            return (Criteria) this;
        }

        public Criteria andLockReasonLessThan(Integer value) {
            addCriterion("lock_reason <", value, "lockReason");
            return (Criteria) this;
        }

        public Criteria andLockReasonLessThanOrEqualTo(Integer value) {
            addCriterion("lock_reason <=", value, "lockReason");
            return (Criteria) this;
        }

        public Criteria andLockReasonIn(List<Integer> values) {
            addCriterion("lock_reason in", values, "lockReason");
            return (Criteria) this;
        }

        public Criteria andLockReasonNotIn(List<Integer> values) {
            addCriterion("lock_reason not in", values, "lockReason");
            return (Criteria) this;
        }

        public Criteria andLockReasonBetween(Integer value1, Integer value2) {
            addCriterion("lock_reason between", value1, value2, "lockReason");
            return (Criteria) this;
        }

        public Criteria andLockReasonNotBetween(Integer value1, Integer value2) {
            addCriterion("lock_reason not between", value1, value2, "lockReason");
            return (Criteria) this;
        }

        public Criteria andLandAreaIsNull() {
            addCriterion("land_area is null");
            return (Criteria) this;
        }

        public Criteria andLandAreaIsNotNull() {
            addCriterion("land_area is not null");
            return (Criteria) this;
        }

        public Criteria andLandAreaEqualTo(BigDecimal value) {
            addCriterion("land_area =", value, "landArea");
            return (Criteria) this;
        }

        public Criteria andLandAreaNotEqualTo(BigDecimal value) {
            addCriterion("land_area <>", value, "landArea");
            return (Criteria) this;
        }

        public Criteria andLandAreaGreaterThan(BigDecimal value) {
            addCriterion("land_area >", value, "landArea");
            return (Criteria) this;
        }

        public Criteria andLandAreaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("land_area >=", value, "landArea");
            return (Criteria) this;
        }

        public Criteria andLandAreaLessThan(BigDecimal value) {
            addCriterion("land_area <", value, "landArea");
            return (Criteria) this;
        }

        public Criteria andLandAreaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("land_area <=", value, "landArea");
            return (Criteria) this;
        }

        public Criteria andLandAreaIn(List<BigDecimal> values) {
            addCriterion("land_area in", values, "landArea");
            return (Criteria) this;
        }

        public Criteria andLandAreaNotIn(List<BigDecimal> values) {
            addCriterion("land_area not in", values, "landArea");
            return (Criteria) this;
        }

        public Criteria andLandAreaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("land_area between", value1, value2, "landArea");
            return (Criteria) this;
        }

        public Criteria andLandAreaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("land_area not between", value1, value2, "landArea");
            return (Criteria) this;
        }

        public Criteria andOldManagementTypeIsNull() {
            addCriterion("OLD_MANAGEMENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOldManagementTypeIsNotNull() {
            addCriterion("OLD_MANAGEMENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOldManagementTypeEqualTo(Integer value) {
            addCriterion("OLD_MANAGEMENT_TYPE =", value, "oldManagementType");
            return (Criteria) this;
        }

        public Criteria andOldManagementTypeNotEqualTo(Integer value) {
            addCriterion("OLD_MANAGEMENT_TYPE <>", value, "oldManagementType");
            return (Criteria) this;
        }

        public Criteria andOldManagementTypeGreaterThan(Integer value) {
            addCriterion("OLD_MANAGEMENT_TYPE >", value, "oldManagementType");
            return (Criteria) this;
        }

        public Criteria andOldManagementTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("OLD_MANAGEMENT_TYPE >=", value, "oldManagementType");
            return (Criteria) this;
        }

        public Criteria andOldManagementTypeLessThan(Integer value) {
            addCriterion("OLD_MANAGEMENT_TYPE <", value, "oldManagementType");
            return (Criteria) this;
        }

        public Criteria andOldManagementTypeLessThanOrEqualTo(Integer value) {
            addCriterion("OLD_MANAGEMENT_TYPE <=", value, "oldManagementType");
            return (Criteria) this;
        }

        public Criteria andOldManagementTypeIn(List<Integer> values) {
            addCriterion("OLD_MANAGEMENT_TYPE in", values, "oldManagementType");
            return (Criteria) this;
        }

        public Criteria andOldManagementTypeNotIn(List<Integer> values) {
            addCriterion("OLD_MANAGEMENT_TYPE not in", values, "oldManagementType");
            return (Criteria) this;
        }

        public Criteria andOldManagementTypeBetween(Integer value1, Integer value2) {
            addCriterion("OLD_MANAGEMENT_TYPE between", value1, value2, "oldManagementType");
            return (Criteria) this;
        }

        public Criteria andOldManagementTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("OLD_MANAGEMENT_TYPE not between", value1, value2, "oldManagementType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIsNull() {
            addCriterion("room_type is null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIsNotNull() {
            addCriterion("room_type is not null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeEqualTo(Integer value) {
            addCriterion("room_type =", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotEqualTo(Integer value) {
            addCriterion("room_type <>", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeGreaterThan(Integer value) {
            addCriterion("room_type >", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("room_type >=", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeLessThan(Integer value) {
            addCriterion("room_type <", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeLessThanOrEqualTo(Integer value) {
            addCriterion("room_type <=", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIn(List<Integer> values) {
            addCriterion("room_type in", values, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotIn(List<Integer> values) {
            addCriterion("room_type not in", values, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeBetween(Integer value1, Integer value2) {
            addCriterion("room_type between", value1, value2, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("room_type not between", value1, value2, "roomType");
            return (Criteria) this;
        }

        public Criteria andResDescLikeInsensitive(String value) {
            addCriterion("upper(RES_DESC) like", value.toUpperCase(), "resDesc");
            return (Criteria) this;
        }

        public Criteria andXpointLikeInsensitive(String value) {
            addCriterion("upper(XPOINT) like", value.toUpperCase(), "xpoint");
            return (Criteria) this;
        }

        public Criteria andYpointLikeInsensitive(String value) {
            addCriterion("upper(YPOINT) like", value.toUpperCase(), "ypoint");
            return (Criteria) this;
        }

        public Criteria andColorLikeInsensitive(String value) {
            addCriterion("upper(COLOR) like", value.toUpperCase(), "color");
            return (Criteria) this;
        }

        public Criteria andBrandTypeMainLikeInsensitive(String value) {
            addCriterion("upper(brand_type_main) like", value.toUpperCase(), "brandTypeMain");
            return (Criteria) this;
        }

        public Criteria andBrandTypeSubLikeInsensitive(String value) {
            addCriterion("upper(brand_type_sub) like", value.toUpperCase(), "brandTypeSub");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameLikeInsensitive(String value) {
            addCriterion("upper(CREATE_USER_NAME) like", value.toUpperCase(), "createUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameLikeInsensitive(String value) {
            addCriterion("upper(UPDATE_USER_NAME) like", value.toUpperCase(), "updateUserName");
            return (Criteria) this;
        }

        public Criteria andOrganNameLikeInsensitive(String value) {
            addCriterion("upper(organ_name) like", value.toUpperCase(), "organName");
            return (Criteria) this;
        }

        public Criteria andPositionNameLikeInsensitive(String value) {
            addCriterion("upper(position_name) like", value.toUpperCase(), "positionName");
            return (Criteria) this;
        }

        public Criteria andResCodeLikeInsensitive(String value) {
            addCriterion("upper(res_code) like", value.toUpperCase(), "resCode");
            return (Criteria) this;
        }

        public Criteria andResNameLikeInsensitive(String value) {
            addCriterion("upper(res_name) like", value.toUpperCase(), "resName");
            return (Criteria) this;
        }

        public Criteria andPriceUnitLikeInsensitive(String value) {
            addCriterion("upper(price_unit) like", value.toUpperCase(), "priceUnit");
            return (Criteria) this;
        }

        public Criteria andFeeUnitLikeInsensitive(String value) {
            addCriterion("upper(fee_unit) like", value.toUpperCase(), "feeUnit");
            return (Criteria) this;
        }

        public Criteria andChargeNameLikeInsensitive(String value) {
            addCriterion("upper(charge_name) like", value.toUpperCase(), "chargeName");
            return (Criteria) this;
        }

        public Criteria andCycleLikeInsensitive(String value) {
            addCriterion("upper(cycle) like", value.toUpperCase(), "cycle");
            return (Criteria) this;
        }

        public Criteria andBuildNameLikeInsensitive(String value) {
            addCriterion("upper(build_name) like", value.toUpperCase(), "buildName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLikeInsensitive(String value) {
            addCriterion("upper(unit_name) like", value.toUpperCase(), "unitName");
            return (Criteria) this;
        }

        public Criteria andFloorNameLikeInsensitive(String value) {
            addCriterion("upper(floor_name) like", value.toUpperCase(), "floorName");
            return (Criteria) this;
        }

        public Criteria andPurchaseraLikeInsensitive(String value) {
            addCriterion("upper(purchasera) like", value.toUpperCase(), "purchasera");
            return (Criteria) this;
        }

        public Criteria andKeepOrganNameLikeInsensitive(String value) {
            addCriterion("upper(keep_organ_name) like", value.toUpperCase(), "keepOrganName");
            return (Criteria) this;
        }

        public Criteria andQuitCauseLikeInsensitive(String value) {
            addCriterion("upper(quit_cause) like", value.toUpperCase(), "quitCause");
            return (Criteria) this;
        }

        public Criteria andHouseTypeLikeInsensitive(String value) {
            addCriterion("upper(house_type) like", value.toUpperCase(), "houseType");
            return (Criteria) this;
        }

        public Criteria andParkNameLikeInsensitive(String value) {
            addCriterion("upper(park_name) like", value.toUpperCase(), "parkName");
            return (Criteria) this;
        }

        public Criteria andParkDistrictLikeInsensitive(String value) {
            addCriterion("upper(park_district) like", value.toUpperCase(), "parkDistrict");
            return (Criteria) this;
        }

        public Criteria andObjTypeLikeInsensitive(String value) {
            addCriterion("upper(obj_type) like", value.toUpperCase(), "objType");
            return (Criteria) this;
        }

        public Criteria andParkLocalCodeLikeInsensitive(String value) {
            addCriterion("upper(park_local_code) like", value.toUpperCase(), "parkLocalCode");
            return (Criteria) this;
        }

        public Criteria andFirstNameLikeInsensitive(String value) {
            addCriterion("upper(first_name) like", value.toUpperCase(), "firstName");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}