package com.ss.up.model;

import lombok.Data;

@Data
public class StudentCount {

    private String grade;

    private String classRoom;

    private Integer stuCount;

    private Integer scoreCount;

    public StudentCount(String grade, String classRoom, Integer stuCount, Integer scoreCount) {
        this.grade = grade;
        this.classRoom = classRoom;
        this.stuCount = stuCount;
        this.scoreCount = scoreCount;
    }
}
