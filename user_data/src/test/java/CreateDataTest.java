import database.CreateData;
import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLException;

public class CreateDataTest extends Assert {

    @Test
    public void testCreateTable() throws SQLException, ClassNotFoundException {
        CreateData cD = new CreateData();

        assertFalse(cD.createTable());  // return false if table with the same name exists in the database


        //assertTrue(cD.createTable()); // return true if table with the same name not exists in the database
    }
}
