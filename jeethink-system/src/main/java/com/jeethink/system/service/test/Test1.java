package com.jeethink.system.service.test;

import com.jeethink.common.annotation.Log;

import java.sql.*;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Test1 {


    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");//加载数据库驱动
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws SQLException {

        Connection connection = getConn();
        Statement statement = getStmt(connection);
        ResultSet resultSet = statement.executeQuery("select * from jeethink.api_statistic where metrdate between DATE_SUB(CURDATE(), INTERVAL 7 DAY) and CURDATE()");

        List<ApiInvokeInfo> apiInvokeInfoList = new ArrayList<>();

        while (resultSet.next()) {
            ApiInvokeInfo apiInvokeInfo = new ApiInvokeInfo();
            apiInvokeInfo.setApiEndpoint(resultSet.getString("apiendpoint"));
            apiInvokeInfo.setInvokeTimes(resultSet.getInt(2));
            apiInvokeInfo.setInvokeDate(resultSet.getDate(3));
            apiInvokeInfoList.add(apiInvokeInfo);
        }

        List<Date> datePeriod = getDatePeriod();

        List<Date> weekDateperiod = datePeriod.subList(0, 7);

        // System.out.println(weekDateperiod.get(0).toLocalDate().toEpochDay()- weekDateperiod.get(4).toLocalDate().toEpochDay());

        // System.out.println(weekDateperiod);
        Collections.sort(weekDateperiod);

        List<String> apiEndpointList = new ArrayList<>();
        apiEndpointList.add("api1");
        apiEndpointList.add("api6");
        apiEndpointList.add("api2");
        apiEndpointList.add("api3");
        apiEndpointList.add("api4");
        apiEndpointList.add("api8");

        Map<String, int[]> finalData = new HashMap<>();

        for (String apiEndpoint : apiEndpointList) {
            finalData.put(apiEndpoint, new int[weekDateperiod.size()]);
        }

        apiInvokeInfoList.stream().forEach(apiInvokeInfo -> {
            finalData.get(apiInvokeInfo.getApiEndpoint())[(weekDateperiod.size() -1) - ((int) (weekDateperiod.get(weekDateperiod.size() - 1).toLocalDate().toEpochDay()
                    - apiInvokeInfo.getInvokeDate().toLocalDate().toEpochDay()) - 1)]
                    = apiInvokeInfo.getInvokeTimes();
        });

        System.out.println(finalData);
        resultSet.close();
        statement.close();
        connection.close();


        /*Map<String, List<Integer>> data= new HashMap<>();
        Iterator iterator;
        for (String apiEndpoint : apiEndpointList) {
            List<Integer> invokeTimes = new ArrayList<>();
            for (String date : dateList) {
                iterator = apiInvokeInfoList.iterator();
                if (!apiInvokeInfoList.stream().filter(w->String.valueOf(w.getApiEndpoint()).equals(apiEndpoint)).findAny().isPresent()){
                    invokeTimes.add(0);
                } else {
                    while (iterator.hasNext()) {
                        ApiInvokeInfo apiInvokeInfo = (ApiInvokeInfo) iterator.next();
                        if (apiInvokeInfo.getApiEndpoint().equals(apiEndpoint) && apiInvokeInfo.getInvokeDate().equals(date)) {
                            invokeTimes.add(apiInvokeInfo.getInvokeTimes());
                            iterator.remove();
                            break;
                        } else if (apiInvokeInfo.getApiEndpoint().equals(apiEndpoint) && !apiInvokeInfo.getInvokeDate().equals(date)) {
                            invokeTimes.add(0);
                            break;
                        }
                    }
                }
            }
            data.put(apiEndpoint, invokeTimes);
        }

        System.out.println(data);*/
    }

    private static List<Date> getDatePeriod() {
        Calendar c = Calendar.getInstance();
        List<Date> list = new ArrayList<>();
        Calendar terminal = Calendar.getInstance();
        terminal.setTimeInMillis(System.currentTimeMillis());
        terminal.add(Calendar.MONTH, -1);
        Date term = new Date(terminal.getTimeInMillis());
        for (; new Date(c.getTimeInMillis()).compareTo(term) > 0; ) {
            c.set(Calendar.HOUR_OF_DAY, 0);
            c.set(Calendar.MINUTE, 0);
            c.set(Calendar.SECOND, 0);
            c.set(Calendar.MILLISECOND, 0);
            list.add(new Date(c.getTimeInMillis()));
            c.add(Calendar.DAY_OF_MONTH, -1);
        }
        return list;
    }

    public static Connection getConn() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jeethink", "root", "199551");//连接数据库
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static Statement getStmt(Connection conn) {
        Statement stmt = null;
        try {
            stmt = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return stmt;
    }

    public static ResultSet executeQuery(Statement stmt, String sql) {
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

}
