package com.ss.up.test;

import com.google.common.collect.Lists;
import com.ss.up.model.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Test0901 {

    @Test
    public void test01() {

        User user = new User();
        user.setName("ss");
        user.setAddress("南京");
        User user1 = new User();
        user1.setName("ss1");
        user1.setAddress("南京1");
        User user2 = new User();
        user2.setName("ss1");
        user2.setAddress("南京2");
        User user3 = new User();
        user3.setName("ss1");
        user3.setAddress("南京3");
        User user4 = new User();
        user4.setName("ss1");
        user4.setAddress("南京4");
        List<User> list = new ArrayList<>();
        list.add(user);
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);

        List<List<User>> partition = Lists.partition(list, 4);
        System.out.println(partition);
    }

}
