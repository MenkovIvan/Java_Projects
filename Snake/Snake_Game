mport javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Random;

public class Snake_Game extends JPanel implements ActionListener {
    private final int SIZE = 320;
    private final int DOTS = 400; //20x20
    private final int DOT_SIZE = 16; // razmer kletki
    private Image dot;
    private Image apple;
    private int appleX;
    private int appleY;
    private int dots;
    private int score = 0;
    private Timer timer;
    private int[] x = new int[DOTS];
    private int[] y = new int[DOTS];
    private boolean right = true;
    private boolean left = false;
    private boolean up = false;
    private boolean down = false;
    private boolean inGame = true;

    Snake_Game(){ // konstruktor klassa
        setBackground(Color.BLACK);
        loadImages();
        initGame();
        addKeyListener(new GameKeyListener()); // dobavlyem obrabotchik sobytiy
        setFocusable(true); // chtoby nagatie na clavishi bylo connected s igroy
    }

    public void loadImages(){ // zagrugaet kartinku
        ImageIcon imic1 = new ImageIcon("dot.png");
        dot = imic1.getImage();
        ImageIcon imic2 = new ImageIcon("apple.png");
        apple = imic2.getImage();
    }

    @Override
    protected void paintComponent(Graphics g) { //pererisovka okna
        super.paintComponent(g);
        if (inGame) {
            g.drawImage(apple, appleX, appleY, this);
            for (int i = 0; i < dots; i++) {
                g.drawImage(dot, x[i], y[i], this);
            }
        } else{
            String str = " Game Over ";
            g.setColor(Color.WHITE);
            g.drawString(str,125,SIZE/2);
            //saveInFile();
        }
    }

    public void saveInFile()  {
        try{
        FileWriter fwrite = new FileWriter("Records.txt", true);}
        catch (IOException ex){

        }
    }

    public void initGame(){ //iniciliziruet nachalo igry
        dots = 2;
        for (int i = 0; i < dots ; i++) {
            x[i]= 48 - i*DOT_SIZE;
            y[i]= 48;
        }
        timer = new Timer(250,this);
        timer.start();
        CreateApple();
    }

    public void CreateApple(){ //sozdaem yabloko
        appleX = new Random().nextInt(18)*DOT_SIZE; // ot 0 do 18 * na razmer kletki
        appleY = new Random().nextInt(18)*DOT_SIZE;
    }

    public void checkApple(){ //proveryem ne sograli li my apple
       if ( x[0] == appleX && y[0] == appleY){
           dots++;
           score++;
           CreateApple();
       }
    }

    public void checkCollisions(){ //proveryem ne stolknulis' li my so stenkami ili s soboi
        for (int i = dots; i > 0 ; i--) {
            if ( i > 5 && x[0] == x[i] && y[0] == y[i] ){
                inGame = false;
            }
        }
        if ( x[0] > SIZE-32 ){
            inGame = false;
        }
        if ( x[0] < 0 ){
            inGame = false;
        }
        if ( y[0] > SIZE-44 ){
            inGame = false;
        }
        if ( y[0] < 0 ){
            inGame = false;
        }
        //if ( inGame==false ){
        //    saveInFile();
        //}
    }

    public void move(){ //dvigenie zmeiki
        for (int i = dots; i > 0 ; i--) {
            x[i] = x[i-1];
            y[i] = y[i-1];
        }
        if ( left ){
            x[0] -= DOT_SIZE;
        }
        if ( right ){
            x[0] += DOT_SIZE;
        }
        if ( up ){
            y[0] -= DOT_SIZE;
        }
        if ( down ){
            y[0] += DOT_SIZE;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e){ // ???
        if (inGame){
            checkApple();
            checkCollisions();
            move();
        }
        repaint(); // vyzyvaet metod pererisovki paintComponent(Graphics g) "Mouse Right Click -> Generate -> Override Methods -> paintComponent"
    }

    class GameKeyListener extends KeyAdapter{ // reagiruet na nagatie

        @Override
        public void keyPressed(KeyEvent e) { // reagiruet na nagatie // ""Mouse Right Click -> Generate -> Override Methods -> keyPressed"
            super.keyPressed(e);
            int key = e.getKeyCode(); // key = cod clavish kotorye nagati
            if ( key == KeyEvent.VK_LEFT && !right ) { // esli nagata clavisha vlevo i pri etom mi ne dvigaemsy vpravp
                left = true;
                up = false;
                down = false;
            }
            if ( key == KeyEvent.VK_RIGHT&& !left ) {
                right = true;
                up = false;
                down = false;
            }
            if ( key == KeyEvent.VK_UP && !down ) {
                up = true;
                right = false;
                left = false;
            }
            if ( key == KeyEvent.VK_DOWN && !up ) {
                down = true;
                right = false;
                left = false;
            }
        }
    }
}
