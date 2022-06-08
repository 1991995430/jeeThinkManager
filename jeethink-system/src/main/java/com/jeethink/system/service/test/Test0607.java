package com.jeethink.system.service.test;

import org.apache.commons.lang3.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

public class Test0607 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("sss");
        System.out.println(ObjectUtils.isEmpty(list));
    }

}
