package database;

import java.sql.*;

public class CreateData {
    public static boolean createTable() throws SQLException, ClassNotFoundException {

        Connection connection = ConnectionMySQL.getMySQLConnection();

        Statement statement = connection.createStatement();

        DatabaseMetaData metadata = connection.getMetaData();
        ResultSet resultSet;
        resultSet = metadata.getTables(null, null, "users", null);
        if(resultSet.next()){
            return false;
        }

        String sql = "create table users (id int auto_increment, name VARCHAR(15) null, age int null, password VARCHAR(15) null, constraint users_pk  primary key (id))";

        statement.executeUpdate(sql);

        return true;

    }
}
