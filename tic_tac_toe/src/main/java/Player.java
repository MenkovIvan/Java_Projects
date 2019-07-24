public class Player{
    private strings plString;
    private String name;

    // TODO вообще убрать этот класс
    public Player(String name, strings plString){
        this.name = name;
        this.plString = plString;
    }

    public void move(Field field, int str, int col) {
        field.playerMove(plString,str,col);
    }

    public strings getPlString() {
        return plString;
    }

    public String getName() {
        return name;
    }
}