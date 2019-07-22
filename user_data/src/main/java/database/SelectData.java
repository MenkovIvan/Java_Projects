package database;

import model.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectData {
    public static User selectUserAgeUp(int age) throws SQLException, ClassNotFoundException {

        String name;
        int age_r;
        String password;

        Connection connection = ConnectionMySQL.getMySQLConnection();

        Statement statement = connection.createStatement();

        String sql = "SELECT name, age, password FROM users WHERE age>" + age + "";

        ResultSet rs = statement.executeQuery(sql);

        if (rs.next()) {
            name = rs.getString("name");
            age_r = rs.getInt("age");
            password = rs.getString("password");
            return new User(name,age_r,password);
        } else return null;
    }

    public static User selectUserAgeDown(int age) throws SQLException, ClassNotFoundException {

        String name;
        int age_r;
        String password;

        Connection connection = ConnectionMySQL.getMySQLConnection();

        Statement statement = connection.createStatement();

        String sql = "SELECT name, age, password FROM users WHERE age<" + age + "";

        ResultSet rs = statement.executeQuery(sql);

        if (rs.next()) {
            name = rs.getString("name");
            age_r = rs.getInt("age");
            password = rs.getString("password");
            return new User(name,age_r,password);
        } else return null;
    }

    public static User selectUserName(String name) throws SQLException, ClassNotFoundException {

        int age_r;
        String password;

        Connection connection = ConnectionMySQL.getMySQLConnection();

        Statement statement = connection.createStatement();

        String sql = "SELECT age, password FROM users WHERE name='" + name + "'";

        ResultSet rs = statement.executeQuery(sql);

        if (rs.next()) {
            age_r = rs.getInt("age");
            password = rs.getString("password");
            return new User(name,age_r,password);
        } else return null;
    }

}
