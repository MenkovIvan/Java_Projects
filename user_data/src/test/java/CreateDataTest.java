import database.CreateData;
import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLException;

public class CreateDataTest extends Assert {

    @Test
    public void testCreateTable() throws SQLException, ClassNotFoundException {

        assertTrue(CreateData.createTable());  // return true if table with the same name is not exist in the database

        assertFalse(CreateData.createTable()); // return false because table with the same name is exist in the database
    }
}
