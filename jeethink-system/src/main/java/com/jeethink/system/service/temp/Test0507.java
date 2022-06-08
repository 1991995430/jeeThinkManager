package com.jeethink.system.service.temp;

import java.lang.reflect.Field;

public class Test0507 {

    public static void main(String[] args) throws NoSuchFieldException {

        Student student = new Student();
        Human human = new Human();
        Class<? extends Human> aClass = human.getClass();
        Field getAge = aClass.getField("name");
        System.out.println(getAge.getName());
        student.setStuId(1234L);
        student.setClassNo("002");

    }

}
