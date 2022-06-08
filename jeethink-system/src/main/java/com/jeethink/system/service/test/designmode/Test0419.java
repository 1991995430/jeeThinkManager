package com.jeethink.system.service.test.designmode;

import org.apache.commons.collections4.map.CaseInsensitiveMap;

import java.util.HashMap;
import java.util.Map;

public class Test0419 {

    public static void main(String[] args) {

        Map<String, Integer> uploadMap = new HashMap<>();
        uploadMap.put("G0001", 1);
        Map<String, String> uploadMap1 = new HashMap<>();
        uploadMap1.put("G0001", "1");
        Map<Integer, String> uploadMap2 = new HashMap<>();
        uploadMap2.put(1, "1");

        System.out.println(getCaseInsensitiveMap(uploadMap).get("g0001"));
        System.out.println(getCaseInsensitiveMap(uploadMap1).get("g0001"));
        System.out.println(getCaseInsensitiveMap(uploadMap2).get(1));

    }

    private static Map<?, ?> getCaseInsensitiveMap(Map<?, ?> originMap) {
        Map<Object, Object> caseInsensitiveMap = new CaseInsensitiveMap<>();
        caseInsensitiveMap.putAll(originMap);
        return caseInsensitiveMap;
    }

    private static Map<String, Integer> getMap(Map<String, Integer> orginMap) {
        Map<String, Integer> ignoreMap = new CaseInsensitiveMap<>();
        ignoreMap.putAll(orginMap);
        return ignoreMap;
    }

    private static Map<String, String> getMapString(Map<String, String> orginMap) {
        Map<String, String> ignoreMap = new CaseInsensitiveMap<>();
        ignoreMap.putAll(orginMap);
        return ignoreMap;
    }

    private static Map<Integer, String> getMapInteger(Map<Integer, String> orginMap) {
        Map<Integer, String> ignoreMap = new CaseInsensitiveMap<>();
        ignoreMap.putAll(orginMap);
        return ignoreMap;
    }

}
