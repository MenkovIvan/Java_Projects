package database;

import model.User;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteData {
    public static void deleteUser(User user) throws SQLException, ClassNotFoundException {

        Connection connection = ConnectionMySQL.getMySQLConnection();

        Statement statement = connection.createStatement();

        String sql = "DELETE FROM users WHERE name='" + user.getName() + "', age=" + user.getAge() + ", password='" + user.getPassword() + "'";

        statement.executeUpdate(sql);
    }

    public static void deleteUserName(String name) throws SQLException, ClassNotFoundException {

        Connection connection = ConnectionMySQL.getMySQLConnection();

        Statement statement = connection.createStatement();

        String sql = "DELETE FROM users WHERE name='" + name + "'";

        statement.executeUpdate(sql);
    }
}
