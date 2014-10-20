package com.student.registration.util;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static junit.framework.TestCase.assertNotNull;

/**
 * Created by haluomao on 14/10/19.
 */
public class DBTester {
    //连接数据库MYSQL
    public static Connection conn = null;
    public static Statement stmt = null;
    private static String driver = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://192.168.1.135:3306/demoTest";
    private static String user = "root";
    private static String pwd = "mysqlpwd";

    public static Connection getDBConnection() {
        try {
            Class.forName(driver);// 装载驱动类
            conn = DriverManager.getConnection(url, user, pwd);// 连接数据库
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return conn;
        }
        return conn;
    }

    public static Statement getStatement() {
        // 创建Statement对像
        try {
            stmt = DBTester.getDBConnection().createStatement();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return stmt;
        }
        return stmt;
    }

    public void closeCon() {
        if (stmt != null) {
            try {
                stmt.close();
                stmt = null;
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();    }
            if (conn != null) {
                try {
                    conn.close();
                    conn = null;
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();    }
            }// end closeCon
        }
    }

    @Test
    public void testGetDBConnection() {
        Connection conn2 = DBTester.getDBConnection();
        assertNotNull(conn2);
    }
}
