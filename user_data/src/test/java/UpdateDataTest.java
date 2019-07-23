import database.DeleteData;
import database.InsertData;
import database.UpdateData;
import model.User;
import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLException;

public class UpdateDataTest extends Assert {

    @Test
    public void testUpdateName() throws SQLException, ClassNotFoundException {

        InsertData.insertUser(new User("kirill",33, "123456"));

        assertFalse(UpdateData.updateName(new User("kirill",33,"123456"),"ivan"));
        assertFalse(UpdateData.updateName(new User("fg",33,"123456"),"ivan"));

        assertTrue(UpdateData.updateName(new User("kirill",33,"123456"),"kirill123"));

        DeleteData.deleteUserName("kirill123");
    }

    @Test
    public void testUpdateAge() throws SQLException, ClassNotFoundException {

        InsertData.insertUser(new User("kirill",33, "123456"));

        assertFalse(UpdateData.updateAge(new User("fg",33,"123456"),23));

        assertTrue(UpdateData.updateAge(new User("kirill",33,"123456"),23));

        DeleteData.deleteUserName("kirill123");
    }

    @Test
    public void testUpdatePassword() throws SQLException, ClassNotFoundException {

        InsertData.insertUser(new User("kirill",33, "123456"));

        assertFalse(UpdateData.updatePassword(new User("fg",33,"123456"),"kirill"));

        assertTrue(UpdateData.updatePassword(new User("kirill",33,"123456"),"kirill"));

        DeleteData.deleteUserName("kirill123");
    }
}
