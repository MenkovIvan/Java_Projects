
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Snake_Menu extends JFrame {

    private JButton btn1 = new JButton("Start Game");
    private JButton btn2 = new JButton("Rules");
    private JButton btn3 = new JButton("Control");
    private JButton btn4 = new JButton("Records");
    private JButton btn5 = new JButton("Exit");
    private JPanel cont = new JPanel();

    Snake_Menu(){
        super("Menu:");
        setSize(70,150);
        setLocation(450,250);
        //setDefaultCloseOperation(EXIT_ON_CLOSE);

        Font BigFont = new Font("TimesRoman", Font.BOLD, 30);
        GridLayout layout = new GridLayout(5, 1, 5, 12);
        cont.setLayout(layout);

        btn1.setFont(BigFont);
        btn2.setFont(BigFont);
        btn3.setFont(BigFont);
        btn4.setFont(BigFont);
        btn5.setFont(BigFont);

        btn1.addActionListener(new Button1Listener());
        btn2.addActionListener(new Button2Listener());
        btn3.addActionListener(new Button3Listener());
        btn4.addActionListener(new Button4Listener());
        btn5.addActionListener(new Button5Listener());

        cont.add(btn1);
        cont.add(btn2);
        cont.add(btn3);
        cont.add(btn4);
        cont.add(btn5);

        getContentPane().add(cont);
        pack();
        setVisible(true);
    }

    public class Button1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Snake_Window w = new Snake_Window();
        }
    }

    public class Button2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Snake_Rules r = new Snake_Rules();
        }
    }

    public class Button3Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Snake_Control c = new Snake_Control();
        }
    }

    public class Button4Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Snake_Records re = new Snake_Records();
        }
    }

    public class Button5Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            setVisible(false);
            System.exit(0);
        }
    }

}
