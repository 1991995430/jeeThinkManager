package com.ss.up.test;

import com.ss.up.model.User;
import org.apache.commons.collections.CollectionUtils;
import org.junit.Test;
import org.springframework.util.StopWatch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test0907 {

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start("字符串拼接：：");
        String s = "111";
        for (int i = 0; i < 10000; i++) {
            s += i;
        }
        stopWatch.stop();

        stopWatch.start("StringBuild:::");
        StringBuilder sb = new StringBuilder("111");
        for (int i = 0; i < 10000; i++) {
            sb.append(i);
        }
        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
        System.out.println(s);
        System.out.println(sb);
    }

    @Test
    public void test001() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start("new对象：：");
        List<String> list = new ArrayList<>();
        for (int j = 0; j < 100; j++) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 10000; i++) {
                sb.append(i);
            }
            list.add(sb.toString());
        }

        stopWatch.stop();

        stopWatch.start("setLength:::");
        List<String> list1 = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < 100; j++) {
            for (int i = 0; i < 10000; i++) {
                sb.append(i);
            }
            list1.add(sb.toString());
            sb.setLength(0);
        }

        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
        System.out.println();
        System.out.println(sb);

        System.out.println();

    }

    @Test
    public void Test002() {

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        List<String> list2 = new ArrayList<>();
        list2.add("4");
        list2.add("5");
        list2.add("6");

        if (CollectionUtils.isNotEmpty(list)) {
            list = list2;
        }

        System.out.println(list);
    }

    @Test
    public void test012() {

        List<User> userList = new ArrayList<>();
        userList.add(new User(2, "ss"));
        userList.add(new User(2, "ss1"));
        userList.add(new User(3, "ss2"));
        userList.add(new User(4, "ss3"));
        userList.add(new User(4, "ss4"));

        Map<Integer, User> collect = userList.stream().collect(Collectors.toMap(User::getId, a -> a, (m, n) -> m));
        System.out.println(collect);


        Map<Integer, List<User>> map = userList.stream().collect(Collectors.groupingBy(User::getId));


        int[] arr = {3, 1, 4, 2, 7};

        StringBuilder sb = new StringBuilder();

        List<String> list = new ArrayList<>();
        for (int a : arr) {
            if (map.containsKey(a)) {
                sb.append(map.get(a).stream().map(User::getName).collect(Collectors.joining("-")));
            }
            if (sb.length() > 0) {
                list.add(sb.toString());
                sb.setLength(0);
            }
        }
        System.out.println(list);
    }
}
