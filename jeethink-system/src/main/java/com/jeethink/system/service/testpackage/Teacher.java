package com.jeethink.system.service.testpackage;

import com.jeethink.system.service.temp.Test0506I;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
class Teacher {
    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private String name;
    private int age;

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected class aa{
        private String address;
        private int sex;
    }
    public List<String> getList(String name) {
        List<String> list = new ArrayList<>();
        list.add(name);
        return list;
    }
    protected static class testName implements Test0506I {
        @Override
        public List<String> getList(String name) {
            List<String> list = new ArrayList<>();
            list.add("ss");
            list.add("ss2");
            list.add("ss3");
            list.add("ss4");
            return list;
        }
    }
}
