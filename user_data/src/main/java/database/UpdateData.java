package database;

import model.User;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateData {
    public static boolean updateName(User user, String name2) throws SQLException, ClassNotFoundException {

        Connection connection = ConnectionMySQL.getMySQLConnection();

        Statement statement = connection.createStatement();

        if (SelectData.selectUserName(name2) == null){
            return false;
        }

        if (SelectData.selectUserName(user.getName()) != null){
            return false;
        }

        String sql = "UPDATE users SET name='" + name2 + "' WHERE name='" + user.getName() + "'";

        statement.executeUpdate(sql);

        return true;
    }

    public static boolean updatePassword(User user, String password)throws SQLException, ClassNotFoundException {

        Connection connection = ConnectionMySQL.getMySQLConnection();

        Statement statement = connection.createStatement();

        if (SelectData.selectUserName(user.getName()) != null){
            return false;
        }

        String sql = "UPDATE users SET password='" + password + "' WHERE name='" + user.getName() + "'";

        statement.executeUpdate(sql);

        return true;
    }

    public static boolean updateAge(User user, int age)throws SQLException, ClassNotFoundException {

        Connection connection = ConnectionMySQL.getMySQLConnection();

        Statement statement = connection.createStatement();

        if (SelectData.selectUserName(user.getName()) != null){
            return false;
        }

        String sql = "UPDATE users SET age=" + age + " WHERE name='" + user.getName() + "'";

        statement.executeUpdate(sql);

        return true;
    }
}
