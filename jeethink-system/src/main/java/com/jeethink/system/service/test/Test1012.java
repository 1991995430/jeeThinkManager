package com.jeethink.system.service.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test1012 {

    public static void main(String[] args) {

        List<AiApplyRange> applyRangeList = new ArrayList<>();
        applyRangeList.add(new AiApplyRange(100395, 10045, "671024", 1, 1));
        applyRangeList.add(new AiApplyRange(100396, 10033, "671024", 3, 1));
        applyRangeList.add(new AiApplyRange(100397, 10045, "671024", 1, 1));
        // applyRangeList.add(new AiApplyRange(100398, 10033, "671024", 3, 1));

        List<AiApplyRange> rangeList = new ArrayList<>();

        Map<Integer, List<AiApplyRange>> collect = applyRangeList.stream().collect(Collectors.groupingBy(AiApplyRange::getRefId));

        List<String> applyRange = new ArrayList<>();
        applyRange.add("671023");

        int i = 0;
        int j = 0;
        int k = 0;
        // 每个计划的分组下面 对应一组使用范围的对象
        // 遍历
        a:for (Map.Entry<Integer, List<AiApplyRange>> m : collect.entrySet()){
            List<String> stringList = m.getValue().stream().map(AiApplyRange::getOrganId).collect(Collectors.toList());
            for (String organId : applyRange) {
                if (!stringList.contains(organId)) {
                    continue a;
                }
            }
            rangeList.addAll(m.getValue());
        }
        List<Integer> programmeIdList = rangeList.stream().map(AiApplyRange::getRefId).collect(Collectors.toList());
        System.out.println(rangeList);
        System.out.println(programmeIdList);
    }

}
