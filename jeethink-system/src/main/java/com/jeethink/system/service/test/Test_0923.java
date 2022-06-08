package com.jeethink.system.service.test;

import org.apache.commons.collections4.map.HashedMap;
import org.apache.commons.math3.ml.neuralnet.MapUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test_0923 {
    public static void main(String[] args) {

        /*90307=20211209165134,
        90066=20211210141516,
        90306=20211209164726,
        90084=20211209173356,
        90072=20211209151147,
        90027=20211209134719,
        90076=20211209152132,
        90654=20211210140838,*//*
        List<ApiInvokeInfo> apiInvokeInfos = new ArrayList<>();
        apiInvokeInfos.add(new ApiInvokeInfo(90307, null, null));
        apiInvokeInfos.add(new ApiInvokeInfo(90066, null, null));
        apiInvokeInfos.add(new ApiInvokeInfo(90076, null, null));
        apiInvokeInfos.add(new ApiInvokeInfo(90306, null, null));
        apiInvokeInfos.add(new ApiInvokeInfo(90368, null, 123));
        apiInvokeInfos.add(new ApiInvokeInfo(90399, null, 566));
        System.out.println(apiInvokeInfos);
        Map<Integer, Long> taskMap = new HashedMap<>();
        taskMap.put(90307, 20211209165134L);
        taskMap.put(90066, 20211210141516L);
        taskMap.put(90306, 20211209164726L);
        taskMap.put(90076, 20211209152132L);
        Map<Integer, Long> map2 = new HashedMap<>();
        map2.put(123, 20211209152132L);
        map2.put(566, 20211209152132L);

        apiInvokeInfos.stream().forEach(bill -> {
            bill.setInvokeDate(taskMap.get(bill.getApiEndpoint()));
            if (bill.getInvokeTimes() != null && bill.getInvokeDate() == null) {
                bill.setInvokeDate(map2.get(bill.getInvokeTimes()));
            }
        });*/

        List<BillListResp> planList = new ArrayList<>();
        Map<Integer, Long> approvedTimeMap = new HashedMap<>();
        Map<Integer, Long> approvedTimeTaskMap = new HashedMap<>();

        approvedTimeMap.put(80006, 20211025173933L);
        approvedTimeMap.put(90121, 20211210152438L);

        approvedTimeTaskMap.put(90076, 20211209152132L);
        approvedTimeTaskMap.put(90654, 20211210140838L);

        BillListResp billListResp = new BillListResp();
        billListResp.setId(90085);
        billListResp.setTaskId(90076);
        billListResp.setDeliveryTime("20211209152015");
        billListResp.setStatus(4);
        planList.add(billListResp);
        System.out.println(planList);

        // 设置审批时间
        planList.stream().forEach(bill -> {
            if (BillStatusE.Revoked.getId().equals(bill.getStatus())) {
                bill.setApprovedTime(approvedTimeMap.get(bill.getId()) == null ? null : String.valueOf(approvedTimeMap.get(bill.getId())));
                if (bill.getTaskId() != null && bill.getApprovedTime() == null) {
                    bill.setApprovedTime(String.valueOf(approvedTimeTaskMap.get(bill.getTaskId())));
                }
            }
        });

        System.out.println(planList);
    }
}
