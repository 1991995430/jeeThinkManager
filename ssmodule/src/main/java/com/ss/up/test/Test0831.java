package com.ss.up.test;

import com.segi.uhomecp.utils.ASCUtil;
import com.ss.up.mapper.UserMapper;
import com.ss.up.model.User;
import com.ss.up.model.UserCriteria;
import com.ss.up.utils.ExcelUtil;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Test0831 {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test1() {
        try {
            System.out.println(ASCUtil.decryption("8QREmOGffek="));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*@Test
    public void test2() {
        String str = "aa";
        StringBuilder convert = new StringBuilder();
        for (int j = 0; j < str.length(); j++) {
            char word = str.charAt(j);
            String[] pinyinArray = PinyinHelper.toHanyuPinyinStringArray(word);
            if (pinyinArray != null) {
                convert.append(pinyinArray[0], 0, pinyinArray[0].length() - 1);
            } else {
                convert.append(word);
            }
        }

        System.out.println(convert);
    }*/

    @Test
    public void test3() {
        ExcelUtil<User> util = new ExcelUtil<>(User.class);
        UserCriteria userCriteria = new UserCriteria();
        userCriteria.createCriteria().andIdBetween(1, 8);
        List<User> userList = userMapper.selectByExample(userCriteria);
        util.exportExcel(userList);
    }
}