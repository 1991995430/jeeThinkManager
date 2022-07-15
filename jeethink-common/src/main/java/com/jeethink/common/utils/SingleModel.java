package com.jeethink.common.utils;

public class SingleModel {

    private String name;

    private String age;

    private static SingleModel singleModel;

    private SingleModel() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public static SingleModel getInstance() {
        if (singleModel == null) {
            synchronized (SingleModel.class) {
                if (singleModel == null) {
                    singleModel = new SingleModel();
                }
            }
        }

        return singleModel;
    }
}
