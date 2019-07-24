import java.util.ArrayList;

public class Field {

    private final int N = 4;


    private ArrayList<Cell> field = new ArrayList<Cell>();

    // TODO сделать конструктор, чтобы можно было сразу создавать заполненное поле
    public Field(){
        for (int i = 0; i < 16; i ++)
            field.add(new Cell(strings._));
    }

    public void printField() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(field.get(i * N + j).getValue() + " ");
            System.out.println();
        }
        System.out.println();
    }

    public void playerMove(strings s, int str, int col) {
        if (field.get(str * N + col).isEmpty()){
            field.get(str * N + col).setValue(s);
        }
    }

    public void checkField(Player player, Player enemy) {
    // TODO метод должен возвращать
        // надо сднлать класс с состоянием поля FieldState
        // у класс должны быть поля
        // статус поля: выигрыш, ничья, игра не закончена iswin isdrow
        / 



        int res = checkStrCol(player.getPlString(),enemy.getPlString());
        int resDiag = checkDiagonal(player.getPlString(),enemy.getPlString());

        if (res == 0 && resDiag == 0)
            System.out.println("Not end of game");

        if (res == 2 || resDiag == 2)
            System.out.println("Player " + player.getName() + " - winner!");

        if (res == 3 || resDiag == 3)
            System.out.println("Player " + player.getName() + " - loser!");

        if (res == 1 && resDiag == 0)
            System.out.println("Draw");

        // 0 - not end game
        // 1 - draw
        // 2 - win
        // 3 - lose
    }


    private int checkStrCol(strings myStr, strings enemyStr) {  //check all strings and columns
        // [i][j] == [(i - 1) * N + j]
        for (int i = 0; i < N; i++) {
            boolean col = true;
            boolean str = true;
            for (int j = 0; j < N; j++) {

                if (field.get(i * N + j).getValue() != myStr)
                    str = false;

                if (field.get(j * N + i).getValue() != myStr)
                    col = false;

            }
            if (str){
                System.out.println("win in " + i + " string");
                return 2; // win
            }

            if (col){
                System.out.println("win in " + i + " column");
                return 2; // win
            }
        }
        for (int i = 0; i < N; i++) {
            boolean col = true;
            boolean str = true;
            for (int j = 0; j < N; j++) {

                if (field.get(i * N + j).getValue() != enemyStr)
                    str = false;

                if (field.get(j * N + i).getValue() != enemyStr)
                    col = false;

            }
            if (str){
                System.out.println("lose in " + i + " string");
                return 3; // lose
            }

            if (col){
                System.out.println("lose in " + i + " column");
                return 3; // lose
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                if (field.get(i * N + j).getValue() == strings._)
                    return 0; // may be not end game
            }
        }
        return 1; // may be draw*/
    }


    private int checkDiagonal(strings myStr, strings enemyStr){
        boolean first = true;
        boolean second = true;
        for (int i = 0; i < N; i++) {

            if (field.get(i* N + i).getValue() != myStr)
                first = false;

            if (field.get((N - i - 1) * N + i).getValue() != myStr)
                second = false;

        }
        if (first){
            System.out.println("win in left diagonal");
            return 2; // win
        }

        if (second){
            System.out.println("win in right diagonal");
            return 2; // win
        }

        boolean first2 = true;
        boolean second2 = true;
        for (int i = 0; i < N; i++) {

            if (field.get(i* N + i).getValue() != enemyStr)
                first2 = false;

            if (field.get((N - i - 1) * N + i).getValue() != enemyStr)
                second2 = false;

        }
        if (first2){
            System.out.println("lose in left diagonal");
            return 3; // lose
        }

        if (second2){
            System.out.println("lose in right diagonal");
            return 3; // lose
        }

        return 0; // draw or not end game
    }
}