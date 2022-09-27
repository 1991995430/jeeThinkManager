package com.ss.up.dto;

import com.ss.up.model.ResExt;
import lombok.Data;

import java.util.List;

@Data
public class CircularRespDto {

    private String name;

    private String id;

    private List<ResExt> resExtList;

}
