package com.jeethink.system.service.test;

import java.sql.*;

public class Test0414 {

    public static final int a = 3;

    //线程本地存储变量
    private static  ThreadLocal<Integer> THREAD_LOCAL_NUM = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };

    public static void main(String[] args) {
        /*for (int i = 0; i <3; i++) {//启动三个线程
            Thread t = new Thread() {
                @Override
                public void run() {
                    add10ByThreadLocal();
                }
            };
            t.start();
        }*/
        for (int i = 0; i <100; i++) {//启动三个线程
            int j = i;
            Thread t = new Thread() {
                @Override
                public void run() {
                    try {
                        databaseConnect(j);
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            };
            t.start();
        }
    }

    /**
     * 线程本地存储变量加 5
     */
    private static void add10ByThreadLocal() {
        for (int i = 0; i <5; i++) {
            Integer n = THREAD_LOCAL_NUM.get();
            n += 1;
            THREAD_LOCAL_NUM.set(n);
            System.out.println(Thread.currentThread().getName() + " : ThreadLocal num=" + n);
        }
    }

    public static void databaseConnect(int i) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/shangsong";
        Connection conn = DriverManager.getConnection(url, "root", "199551");
        System.out.println(conn);// com.mysql.jdbc.JDBC4Connection@10d1f30
        PreparedStatement stat = conn.prepareStatement("insert into shangsong.`user`  (name,sex) values (?,?)");
        System.out.println(stat);//com.mysql.jdbc.StatementImpl@137bc9
        // 4. 执行sql语句
        //通过执行者对象调用方法执行SQL语句,获取结果
        //int executeUpdate(String sql)  执行数据库中的SQL语句,仅限于insert,update,delete
        //返回值int,操作成功数据库的行数
        stat.setString(1, "sng"+i);
        stat.setInt(2, i);
        int row = stat.executeUpdate();
        System.out.println(row);
        // 5. 释放资源
        stat.close();
        conn.close();
    }
}
