package LabRab.Number6;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Guess_Game extends JFrame {
    Random random = new Random();
    int a = random.nextInt(20) + 1;
    int attemp = 0;
    JButton btn = new JButton("Guess");
    JTextField txt = new JTextField("", 2);
    JLabel lbl = new JLabel("We guess number 1-20. You have three attempts");

    public Guess_Game(){
      super("Lab6");
      setBounds(100,100,400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,1,0,40));
        container.add(lbl);
        container.add(txt);
        btn.addActionListener(new ButtonEventListener());
        container.add(btn);
    }

    public class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int b = Integer.parseInt(txt.getText());
            if ( a == b ) {
               lbl.setText("You right! Number is " + a );
                JOptionPane.showMessageDialog(null,"You right! Number is " + a,"Output",JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
            }
            else if( a > b ){
                lbl.setText("Number is greater. You have "+ (2-attemp) +" attemp(s)! (1-20)");
            }
            else{
                lbl.setText("Number is less"+ (2-attemp) +" attemp(s)! (1-20)");
            }
            attemp++;
            if (attemp == 3){
                JOptionPane.showMessageDialog(null,"Three attemps ended. You didn't guess.","Output",JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
            }
        }

    }
}
