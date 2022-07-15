package com.jeethink.system.service.test;

import org.apache.commons.lang3.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

public class Test0607 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("sss");
        System.out.println(ObjectUtils.isEmpty(list));
        String s = "http://192.168.1.7:8088/web/asset-management-mobile/#/qrcodeView?id=205362&resType=2256";
        System.out.println(s.substring(s.indexOf("?id=") + 4, s.indexOf("&resType")));
    }

}
