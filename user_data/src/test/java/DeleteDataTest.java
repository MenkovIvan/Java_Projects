import database.DeleteData;
import database.InsertData;
import model.User;
import org.junit.Test;

import java.sql.SQLException;

public class DeleteDataTest {

    @Test
    public void testDeleteUser() throws SQLException, ClassNotFoundException {

        InsertData.insertUser(new User("asd",66,"zxcvbnm"));

        DeleteData.deleteUser(new User("asd",66,"zxcvbnm"));
    }

    @Test
    public void testDeleteUserName() throws SQLException, ClassNotFoundException {

        InsertData.insertUser(new User("asd",66,"zxcvbnm"));

        DeleteData.deleteUserName("asd");
    }
}
