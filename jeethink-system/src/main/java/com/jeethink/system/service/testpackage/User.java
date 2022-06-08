package com.jeethink.system.service.testpackage;

import lombok.Data;

@Data
public class User extends SuperUser{
    private String name;

    private Integer age;

    private String address;

    private String remark;

    public String userId;

    public User() {
    }

    public User(String name, Integer age, String address, String remark) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.remark = remark;
    }

    public User(String name, Integer age, String address, String remark, String userId) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.remark = remark;
        this.userId = userId;
    }
}
