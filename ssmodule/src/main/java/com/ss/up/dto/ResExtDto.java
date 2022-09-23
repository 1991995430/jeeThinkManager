package com.ss.up.dto;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class ResExtDto implements Serializable {
    private Integer id;

    private Long resId;

    private Integer createUserId;

    private String createUserName;

    private String organName;

    private String resCode;

    private String resName;

    private String buildName;

    private String parkName;

    private static final long serialVersionUID = 1L;
}