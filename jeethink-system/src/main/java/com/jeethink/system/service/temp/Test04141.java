package com.jeethink.system.service.temp;


import com.jeethink.system.service.test.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test04141 {

    public static void main(String[] args) {
        // System.out.println(getPinYinHeadChar("测试0505"));
        List<User> userList = new ArrayList<>();
        userList.add(new User("ss", 123));
        userList.add(new User("ss1", 345));
        userList.add(new User("ss3", 12));
        userList.add(new User("ss", 3));
        userList.add(new User("ss", 3));
        userList.add(new User("ss1", 9));
        userList.add(new User("ss3", 3));
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getName().equals("ss")) {
                userList.remove(i);
            }
        }
        String[] aa = {"ss", "ss1", "ss2", "ss", "ss","ss5"};
        Object[] remove = remove(aa, 0);
        System.out.println(remove);
        System.out.println(userList);
    }

    public static Object[] remove (Object[] arrays, int index) {
        Object[] newArrays = arrays;
        for (int i = index; i < arrays.length - index - 1; i++) {
            newArrays[i] = arrays[i+1];
        }
        newArrays[newArrays.length - 1] = null;
        return newArrays;
    }

    /*public static String getPinYinHeadChar(String str) {
        StringBuilder convert = new StringBuilder();
        for (int j = 0; j < str.length(); j++) {
            char word = str.charAt(j);
            String[] pinyinArray = PinyinHelper.toHanyuPinyinStringArray(word);
            if (pinyinArray != null) {
                convert.append(pinyinArray[0].charAt(0));
            } else {
                convert.append(word);
            }
        }
        return convert.toString().toUpperCase();
    }*/

}
