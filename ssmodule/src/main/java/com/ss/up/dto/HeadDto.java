package com.ss.up.dto;

import java.io.Serializable;

/**
 * @author Jay
 */
public class HeadDto implements Serializable {
    private String colId;

    private String colName;

    public HeadDto(String colId, String colName) {
        this.colId = colId;
        this.colName = colName;
    }

    public String getColId() {
        return colId;
    }

    public void setColId(String colId) {
        this.colId = colId;
    }

    public String getColName() {
        return colName;
    }

    public void setColName(String colName) {
        this.colName = colName;
    }
}