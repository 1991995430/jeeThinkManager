package com.jeethink.common.practice;

public class Single {

    private static final Single INSTANCE = new Single();

    private String name;

    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private Single(){}

    public static Single getInstance() {
        return INSTANCE;
    }
}
