import org.junit.Test;

public class FieldTest {

    @Test
    public void testPrint(){
        new Field().printField();
    }

    @Test
    public void testPlayerMove(){

        // TODO создаём поле уже заполненное
        // рисуем его
        // вызываем метод checkField
        // выводим результат работы
        //
        Field f = new Field();
        f.playerMove(strings.X,0,1);
        f.playerMove(strings.O,0,2);
        f.printField();
    }

}
