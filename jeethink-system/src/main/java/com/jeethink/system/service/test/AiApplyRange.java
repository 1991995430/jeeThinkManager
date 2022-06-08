package com.jeethink.system.service.test;

import java.io.Serializable;

public class AiApplyRange implements Serializable {
    private Integer id;

    private Integer refId;

    private String organId;

    private Integer type;

    private Integer systemTag;

    private static final long serialVersionUID = 1L;

    public AiApplyRange() {
    }

    public AiApplyRange(Integer id, Integer refId, String organId, Integer type, Integer systemTag) {
        this.id = id;
        this.refId = refId;
        this.organId = organId;
        this.type = type;
        this.systemTag = systemTag;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRefId() {
        return refId;
    }

    public void setRefId(Integer refId) {
        this.refId = refId;
    }

    public String getOrganId() {
        return organId;
    }

    public void setOrganId(String organId) {
        this.organId = organId == null ? null : organId.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getSystemTag() {
        return systemTag;
    }

    public void setSystemTag(Integer systemTag) {
        this.systemTag = systemTag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", refId=").append(refId);
        sb.append(", organId=").append(organId);
        sb.append(", type=").append(type);
        sb.append(", systemTag=").append(systemTag);
        sb.append("]");
        return sb.toString();
    }
}