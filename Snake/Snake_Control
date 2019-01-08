import javax.swing.*;
import java.awt.*;

public class Snake_Control extends JFrame {

    private JLabel lbl1 = new JLabel("Use these keys to control the Snake: ");
    private JLabel lbll = new JLabel("Turn Left");
    private JLabel lblr = new JLabel("Turn Right");
    private JLabel lblu = new JLabel("Turn Up");
    private JLabel lbld = new JLabel("Turn Down");
    private JPanel cont = new JPanel();

    Snake_Control(){
        super("Control:");
        setSize(70,150);
        setLocation(250,0);

        Font BigFont = new Font("TimesRoman", Font.BOLD, 30);
        Font BigFont1 = new Font("Arial", Font.BOLD, 50);
        lbl1.setFont(BigFont1);
        lbll.setFont(BigFont);
        lblr.setFont(BigFont);
        lblu.setFont(BigFont);
        lbld.setFont(BigFont);

        lbll.setIcon(new ImageIcon("C:\\Users\\Ivan\\IdeaProjects\\Test_GUI\\src\\Snake\\left.png"));
        lblr.setIcon(new ImageIcon("C:\\Users\\Ivan\\IdeaProjects\\Test_GUI\\src\\Snake\\right.png"));
        lblu.setIcon(new ImageIcon("C:\\Users\\Ivan\\IdeaProjects\\Test_GUI\\src\\Snake\\up.png"));
        lbld.setIcon(new ImageIcon("C:\\Users\\Ivan\\IdeaProjects\\Test_GUI\\src\\Snake\\down.png"));


        GridLayout layout = new GridLayout(5, 1, 5, 12);
        cont.setLayout(layout);

        cont.add(lbl1);
        cont.add(lbll);
        cont.add(lblr);
        cont.add(lblu);
        cont.add(lbld);

        getContentPane().add(cont);
        pack();
        setVisible(true);
    }
}
