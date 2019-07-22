package database;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMySQL {
    public static Connection getMySQLConnection() throws SQLException, ClassNotFoundException {

        String hostName = "localhost";

        String dbName = "users";

        String userName = "ivan";

        String password = "1";

        return getConnectionMySQL(hostName,dbName,userName,password);
    }

    private static Connection getConnectionMySQL(String hostName, String dbName, String userName, String password) throws SQLException, ClassNotFoundException {

        Class.forName("com.mysql.jdbc.Driver");

        String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;

        java.sql.Connection conn = DriverManager.getConnection(connectionURL, userName, password);

        return conn;
    }
}
