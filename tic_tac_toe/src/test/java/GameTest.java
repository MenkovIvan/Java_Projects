import org.junit.Test;

public class GameTest {

    @Test
    public void testWinString(){
        Field f = new Field();
        Player pl1 = new Player("Ivan",strings.X);
        Player pl2 = new Player("Andrey",strings.O);

        pl1.move(f,1,0);
        f.printField();

        pl1.move(f,1,1);
        f.printField();

        pl1.move(f,1,2);
        f.printField();

        pl1.move(f,1,3);
        f.printField();

        f.checkField(pl1,pl2);
    }

    @Test
    public void testWinColumn(){
        Field f = new Field();
        Player pl1 = new Player("Ivan",strings.O);
        Player pl2 = new Player("Andrey",strings.X);

        pl1.move(f,0,0);
        f.printField();

        pl1.move(f,1,0);
        f.printField();

        pl1.move(f,2,0);
        f.printField();

        pl1.move(f,3,0);
        f.printField();

        f.checkField(pl1,pl2);
    }

    @Test
    public void testWinDiagonal(){
        Field f = new Field();
        Player pl1 = new Player("Ivan",strings.O);
        Player pl2 = new Player("Andrey",strings.X);

        pl1.move(f,3,0);
        f.printField();

        pl1.move(f,2,1);
        f.printField();

        pl1.move(f,1,2);
        f.printField();

        pl1.move(f,0,3);
        f.printField();

        f.checkField(pl1,pl2);
    }

    @Test
    public void testNotEndGame(){
        Field f = new Field();
        Player pl1 = new Player("Ivan",strings.O);
        Player pl2 = new Player("Andrey",strings.X);

        pl1.move(f,3,0);
        f.printField();

        pl1.move(f,2,1);
        f.printField();

        f.checkField(pl1,pl2);
    }

    @Test
    public void testDraw(){
        Field f = new Field();
        Player pl1 = new Player("Ivan",strings.O);
        Player pl2 = new Player("Andrey",strings.X);

        pl1.move(f,0,0);
        pl2.move(f,0,1);

        pl1.move(f,0,2);
        pl2.move(f,0,3);

        pl1.move(f,1,0);
        pl2.move(f,1,1);

        pl1.move(f,1,2);
        pl2.move(f,1,3);

        pl1.move(f,2,1);
        pl2.move(f,2,0);

        pl1.move(f,2,3);
        pl2.move(f,2,2);

        pl1.move(f,3,0);
        pl2.move(f,3,1);

        pl1.move(f,3,2);
        pl2.move(f,3,3);

        f.printField();

        f.checkField(pl1,pl2);
        f.checkField(pl2,pl2);
    }

    @Test
    public void testLoseString(){
        Field f = new Field();
        Player pl1 = new Player("Ivan",strings.X);
        Player pl2 = new Player("Andrey",strings.O);

        pl1.move(f,1,0);
        pl2.move(f,0,0);
        f.printField();

        pl1.move(f,1,1);
        pl2.move(f,3,0);
        f.printField();

        pl1.move(f,1,2);
        pl2.move(f,3,1);
        f.printField();

        pl1.move(f,1,3);
        f.printField();


        f.checkField(pl2,pl1);
        f.checkField(pl1,pl2);
    }

    @Test
    public void testLoseColumn(){
        Field f = new Field();
        Player pl1 = new Player("Ivan",strings.X);
        Player pl2 = new Player("Andrey",strings.O);

        pl1.move(f,1,0);
        pl2.move(f,0,3);
        f.printField();

        pl1.move(f,2,0);
        pl2.move(f,3,2);
        f.printField();

        pl1.move(f,3,0);
        pl2.move(f,3,1);
        f.printField();

        pl1.move(f,0,0);
        f.printField();


        f.checkField(pl2,pl1);
        f.checkField(pl1,pl2);
    }

    @Test
    public void testLoseDiagonal(){
        Field f = new Field();
        Player pl1 = new Player("Ivan",strings.X);
        Player pl2 = new Player("Andrey",strings.O);

        pl1.move(f,1,1);
        pl2.move(f,0,3);
        f.printField();

        pl1.move(f,0,0);
        pl2.move(f,3,2);
        f.printField();

        pl1.move(f,3,3);
        pl2.move(f,3,1);
        f.printField();

        pl1.move(f,2,2);
        f.printField();


        f.checkField(pl2,pl1);
        f.checkField(pl1,pl2);
    }
}
