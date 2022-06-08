package com.jeethink.system.service.test;

import org.springframework.cglib.core.internal.Function;

public class Student {

    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String customShow(Function<Student, String> function){
        return function.apply(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
