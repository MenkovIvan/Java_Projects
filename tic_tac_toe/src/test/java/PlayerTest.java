import org.junit.Test;

public class PlayerTest {

    @Test
    public void testMove(){
        Player pl = new Player("Ivan",strings.X);
        Field f = new Field();
        pl.move(f,1,1);
        pl.move(f,3,3);
        pl.move(f,3,0);
        pl.move(f,0,0);
        pl.move(f,0,3);
        f.printField();
    }
}
