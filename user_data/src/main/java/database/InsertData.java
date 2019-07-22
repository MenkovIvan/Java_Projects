package database;

import model.User;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
    public static boolean insertUser(User user) throws SQLException, ClassNotFoundException {
        Connection connection = ConnectionMySQL.getMySQLConnection();

        Statement statement = connection.createStatement();

        if (SelectData.selectUserName(user.getName()) != null){
            return false;
        }

        String sql = "INSERT INTO users (name, age, password) VALUES('" + user.getName() + "', " + user.getAge() + " '" + user.getPassword() + "')";

        statement.executeUpdate(sql);

        return true;
    }
}
