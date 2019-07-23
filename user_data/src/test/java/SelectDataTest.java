import database.SelectData;
import model.User;
import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLException;

public class SelectDataTest extends Assert {

    @Test
    public void testSelectUserAgeUp() throws SQLException, ClassNotFoundException {

        User user = SelectData.selectUserAgeUp(19);

        assertEquals("dima",user.getName());
        assertEquals("abc",user.getPassword());
        assertEquals(20,user.getAge());
    }

    @Test
    public void testSelectUserAgeDown()throws SQLException, ClassNotFoundException {

        User user = SelectData.selectUserAgeDown(20);

        assertEquals("qwerty",user.getPassword());
        assertEquals(19,user.getAge());
    }

    @Test
    public void testSelectUserName()throws SQLException, ClassNotFoundException {

        User user = SelectData.selectUserName("ilya");

        assertEquals("ilya",user.getName());
        assertEquals("qwerty", user.getPassword());
        assertEquals(19, user.getAge());
    }
}
