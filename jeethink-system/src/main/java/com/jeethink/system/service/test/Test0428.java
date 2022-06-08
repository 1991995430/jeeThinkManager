package com.jeethink.system.service.test;

import org.apache.commons.lang3.StringUtils;
import org.springframework.cglib.core.internal.Function;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Test0428 {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("ss", 18));
        studentList.add(new Student("ss1", 11));
        studentList.add(new Student("ss29", 11));
        studentList.add(new Student("ss2", 15));
        studentList.add(new Student("ss3", 18));
        studentList.add(new Student("ss12", 32));
        studentList.add(new Student("ss23", 11));
        /*System.out.println("---------1-----------");
        for (Student s : studentList) {
            System.out.println(s.customShow(a -> a.getName() + "," + a.getAge()));
        }
        Function<Student, String> styleOne = s -> {
          String result = s.getName() + "," + s.getAge();
          return result;
        };
        System.out.println("---------2-----------");
        Function<Student, String> styleTwo = s -> s.getName() + "," + s.getAge();
        for (Student s : studentList) {
            System.out.println(s.customShow(styleOne));
        }
        System.out.println("---------3-----------");
        for (Student s : studentList) {
            System.out.println(s.customShow(styleTwo));
        }
        long startTime = System.currentTimeMillis();
        Integer sum1 = 0;
        for (int i = 0; i < 1000000 ; i++) {
            sum1 += i;
        }
        System.out.println(System.currentTimeMillis() - startTime);
        System.out.println("----------我是分割线-------------");
        long startTime1 = System.currentTimeMillis();
        int sum2 = 0;
        for (int i = 0; i < 1000000 ; i++) {
            sum2 += i;
        }
        System.out.println(System.currentTimeMillis() - startTime1);*/


        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()){
            Student next = iterator.next();
            if(11 == next.getAge()){
                studentList.remove(next);
            }}

        System.out.println(studentList);

    }



}
