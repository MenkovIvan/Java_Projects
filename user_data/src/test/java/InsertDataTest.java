import database.ConnectionMySQL;
import database.InsertData;
import model.User;
import org.junit.Assert;
import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDataTest extends Assert {

    @Test
    public void testInsertUser() throws SQLException, ClassNotFoundException {

        assertTrue(InsertData.insertUser(new User("ivan", 19, "qwerty"))); // return true if user with name ivan not exist

        assertFalse(InsertData.insertUser(new User("ivan", 19, "qwerty"))); // return false because user with name ivan exist

        Connection connection = ConnectionMySQL.getMySQLConnection();
        Statement statement = connection.createStatement();
        String sql = "SELECT age, password FROM users WHERE name='ivan'";
        ResultSet rs = statement.executeQuery(sql);

        assertTrue(rs.next());//user with name ivan exist

        assertEquals(19,rs.getInt("age"));//ivan - 19

        assertEquals("qwerty",rs.getString("password"));//ivan - password

        assertTrue(InsertData.insertUser(new User("ilya", 19, "qwerty"))); // return true if user with name ivan not exist
        assertTrue(InsertData.insertUser(new User("dima", 20, "abc"))); // return true if user with name ivan not exist

    }
}
