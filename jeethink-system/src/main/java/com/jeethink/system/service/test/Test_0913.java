package com.jeethink.system.service.test;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Test_0913 {

    public static void main(String[] args) {
        /*List<ApiInvokeInfo> list1 = new ArrayList<>();
        list1.add(new ApiInvokeInfo("1", "1995", 123));
        list1.add(new ApiInvokeInfo("2", "1996", 213));
        list1.add(new ApiInvokeInfo("3", "1996", 155));
        list1.add(new ApiInvokeInfo("3", "1996", 1423));
        list1.add(new ApiInvokeInfo("5", "2015", 1));
        *//*List<ApiInvokeInfos> list2 = new ArrayList<>();
        list2.add(new ApiInvokeInfos("1", "1995", 123, 5));
        list2.add(new ApiInvokeInfos("5", "32454", 213, 6));
        list2.add(new ApiInvokeInfos("3", "43234", 1423, 7));*//*

        ApiInvokeInfo apiInvokeInfo = null;
        ApiInvokeInfo apiInvokeInfo1 = new ApiInvokeInfo();
        apiInvokeInfo1.setApiEndpoint(apiInvokeInfo.getApiEndpoint());


        list1 = list1.stream().sorted(Comparator.comparing(ApiInvokeInfo::getInvokeDate).thenComparing(ApiInvokeInfo::getInvokeTimes).reversed()).collect(Collectors.toList());

        System.out.println(list1);*/
    }

    /**
     * 通过遍历两个List中按id属性相等的归结到resultList中
     *
     * @param oneList
     * @param twoList
     */
    public static List<Map<Object, Object>> compareListHitData(List<Map<Object, Object>> oneList, List<Map<Object, Object>> twoList) {

        List<Map<Object, Object>> resultList = oneList.stream().map(map -> twoList.stream()
                        .filter(m -> Objects.equals(m.get("id"), map.get("id")))
                        .findFirst().map(m -> {
                            map.putAll(m);
                            return map;
                        }).orElse(null))
                .filter(Objects::nonNull).collect(Collectors.toList());
        return resultList;
    }


}
