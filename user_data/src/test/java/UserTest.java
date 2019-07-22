import model.User;
import org.junit.Assert;
import org.junit.Test;

public class UserTest {
    @Test
    public void testGetName(){
        User user = new User("qwerty",12,"asd");
        String result = user.getName();
        if (!result.equals("qwerty")) Assert.fail();
    }

    @Test
    public void testGetAge(){
        User user = new User("qwerty",12,"asd");
        int result = user.getAge();
        if (result != 12) Assert.fail();
    }

    @Test
    public void testGetPassword(){
        User user = new User("qwerty",12,"asd");
        String result = user.getPassword();
        if (!result.equals("asd")) Assert.fail();
    }
}
