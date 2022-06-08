package com.jeethink.system.service.temp;

import lombok.Data;


public class Human {

    private String name;

    private int age;

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }
}
