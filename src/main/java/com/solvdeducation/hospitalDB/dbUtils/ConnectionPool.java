package com.solvdeducation.hospitalDB.dbUtils;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionPool {
    private static final Logger log = Logger.getLogger(ConnectionPool.class);
    private static String dbUrl = "url";
    private static String dbUsername = "user";
    private static String dbPassword = "password";

    public static Connection getConnection(){
     Connection connection = null;

        try {
            connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        } catch (SQLException e) {
            log.error(e);
        }
        return connection;
    }
}
