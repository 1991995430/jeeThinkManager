package com.jeethink.system.service.test;

import com.jeethink.common.utils.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Test0331 {

    private static byte aa = 22;

    private static String url = "group1/M00/00/28/Cm8lmGJCqheAWCJWAACYAHgsRY4745.xls";

    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        userList.add(new User("ss",1));
        userList.add(new User("ss2",12));
        userList.add(new User("ss1",13));
        userList.add(new User("ss3",4));
        userList.add(new User("ss4",15));
        userList.add(new User("ss5",16));
        userList.add(new User("ss6",17));
        userList.add(new User("ss7",18));
        userList.add(new User("ss8",19));
        userList.add(new User("ss9",2));
        userList.add(new User("ss0",3));
        userList.add(new User("ss54",4));
        userList.add(new User("ss43",5));
        userList.add(new User("ss22",6));
        userList.add(new User("ss11",7));
        List<User> pageList = page(userList,2,5);
        System.out.println(pageList);

    }

    private static long sum () {
        long sum = 0L;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        return sum;
    }

    public static byte split_file_id(String file_id, String[] results) {
        int pos = file_id.indexOf("/");
        if ((pos <= 0) || (pos == file_id.length() - 1)) {
            return aa;
        }

        results[0] = file_id.substring(0, pos); //group name
        results[1] = file_id.substring(pos + 1); //file name
        return 0;
    }

    /**
     * 手动分页
     *
     * @param pageSize
     * @param
     * @param dataList
     * @return
     */
    public static <T> List<T> page(List<T> dataList, int pageNum, int pageSize) {
        List<T> currentPageList = new ArrayList<T>();
        if (dataList != null && dataList.size() > 0) {
            int currIdx = (pageNum > 1 ? (pageNum - 1) * pageSize : 0);
            int lastIndex = currIdx + pageSize;

            if (currIdx >= dataList.size()) {
                return currentPageList;
            }
            if (lastIndex > dataList.size()) {
                lastIndex = dataList.size();
            }
            //获得分页后的deviceIdList
            currentPageList = dataList.subList(currIdx, lastIndex);
        }
        return currentPageList;
    }

}
