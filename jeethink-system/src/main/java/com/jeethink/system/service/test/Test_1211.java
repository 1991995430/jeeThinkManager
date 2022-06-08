package com.jeethink.system.service.test;

import org.springframework.beans.factory.annotation.Autowired;

import java.sql.*;
import java.util.*;
import java.util.stream.Collectors;

public class Test_1211 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        List<ResProportion> list = new ArrayList<>();
        list.add(new ResProportion("未定义类型", "23.92", "265382.8700"));
        list.add(new ResProportion("未定>义类型", "1.15", "12777.1700"));
        list.add(new ResProportion("商业街铺", "6.85", "12777.1700"));
        list.add(new ResProportion("厂房", "5.97", "12777.1700"));
        list.add(new ResProportion("写字楼", "16.84", "12777.1700"));
        list.add(new ResProportion("仓库", "6.84", "12777.1700"));
        list.add(new ResProportion("公寓", "3.37", "12777.1700"));
        list.add(new ResProportion("住宅", "0.07", "12777.1700"));
        list.add(new ResProportion("场地", "0.49", "12777.1700"));
        list.add(new ResProportion("产业办公", "32.55", "12777.1700"));

        // List<ResProportion> list1 = orderList(list);

        // System.out.println(String.format("%.2f", 100 * (661524.0 / 1000000 / 1.011)));


        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "199551");
        // Statement statement = connection.createStatement();
        PreparedStatement ps = connection.prepareStatement("select * from mysql.ai_bill_apply where bill_id = ?");
        // ResultSet resultSet = statement.executeQuery("select * from mysql.ai_bill_apply");
        ps.setInt(1, 122);
        ResultSet resultSet = ps.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getString("organ_name"));
        }

    }

    public static List<ResProportion> orderList(List<ResProportion> list) {
        List<ResProportion> result = new ArrayList<>();
        // List<ResProportion> temp = list.stream().sorted(Comparator.comparing(ResProportion::getProportion).reversed()).collect(Collectors.toList());
        List<ResProportion> temp = list.stream().sorted((o1, o2) -> Double.compare(Double.parseDouble(o2.getProportion()), Double.parseDouble(o1.getProportion()))).collect(Collectors.toList());

        int i = 0;
        ResProportion qt = new ResProportion();
        qt.setResourceType("其他");
        Double proportion = 0.00;
        Double resourceArea = 0.00;
        // 超过5个就放到"其他"里
        for (ResProportion rpDto : temp) {
            if (i < 5) {
                result.add(rpDto);
            } else {
                proportion = NumberUtils.add(proportion, Double.parseDouble(rpDto.getProportion()));
                resourceArea = NumberUtils.add(resourceArea, Double.parseDouble(rpDto.getResourceArea()));
            }
            i++;
        }
        if (i >= 5) {
            qt.setProportion(String.format("%.2f", proportion));
            qt.setResourceArea(String.format("%.4f", resourceArea));
            result.add(qt);
        }
        return result;
    }

}
