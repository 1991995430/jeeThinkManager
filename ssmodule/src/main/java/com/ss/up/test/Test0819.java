package com.ss.up.test;

import com.segi.uhomecp.utils.BeanCopierUtils;
import com.ss.up.model.ResExt;
import com.ss.up.model.User;
import com.ss.up.utils.OrikaUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test0819 {

    /**
     * 1.整形数组 只有一个数出现了奇数次  其它都是偶数次 find
     * 2.整形数组 两个数出现了奇数次  其它都是偶数次 find
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 2, 4, 8, 6, 4, 4, 8, 999};
        int eor = 0;
        for (int a : arr) {
            eor ^= a;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            list.add(i + 2000);
        }

        long start = System.currentTimeMillis();
        aa1();
        System.out.println(System.currentTimeMillis() - start);
    }

    public void swap() {
        int a = 3;
        int b = 4;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
    }

    public static void aa1() {

        List<User> list = new ArrayList<>();
        User user1 = new User();
        user1.setId(1);
        user1.setName("ss");
        User user2 = new User();
        user2.setId(2);
        user2.setName("ss1");
        User user3 = new User();
        user3.setId(2);
        user3.setName("ss2");
        User user4 = new User();
        user4.setId(2);
        user4.setName("ss3");
        User user5 = new User();
        user5.setId(2);
        user5.setName("ss4");
        User user6 = new User();
        user6.setId(2);
        user6.setName("ss5");
        User user7 = new User();
        user7.setId(2);
        user7.setName("ss6");
        User user8 = new User();
        user8.setId(2);
        user8.setName("ss7");
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(user5);
        list.add(user6);
        list.add(user7);
        list.add(user8);

        List<String> list1 = new ArrayList<>();

        List<User> userList = new ArrayList<>();

        /*list.parallelStream().map(var0 -> {
            String s = "测试";
            s = s + var0.getName();
            list1.add(s);
            return var0;
        }).collect(Collectors.toList());*/

        /*for (int i = 0; i < 100; i++) {
            List<User> list2 = new ArrayList<>();
            list.parallelStream().forEach(var0 -> {
                var0.setAddress("aa");
            });
            System.out.println(list.size());
        }*/

        ResExt convert = OrikaUtil.convert(user1, ResExt.class);

        for (int i = 0; i < 50; i++) {
            List<User> userList1 = new ArrayList<>();
            list.parallelStream().forEach(userList1::add);
            System.out.println(userList1.size());
        }

    }

}
