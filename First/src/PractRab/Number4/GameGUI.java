package PractRab.Number4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class GameGUI extends JFrame {
    private int a = 0;
    private int b = 0;
    private JButton btnMilan = new JButton("AC Milan");
    private JButton btnReal = new JButton("Real Madrid");
    private JLabel lblres = new JLabel("Result: " + a + " x " + b);
    private JLabel lblscor = new JLabel("Last Scorer: N/A");
    private JLabel lblwin = new JLabel("Winner: DRAW");
    public GameGUI() {
        super("Game_Football");
        this.setBounds(200, 300, 400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
        container.add(lblres);
        container.add(lblscor);
        container.add(lblwin);
        btnMilan.addActionListener(new ButtonMilanListener());
        container.add(btnMilan);
        btnReal.addActionListener(new ButtonRealListener());
        container.add(btnReal);
    }

        public class ButtonMilanListener implements ActionListener{
            public void actionPerformed(ActionEvent e){
                a++;
                lblres.setText("Result: " + a + " x " + b);
                lblscor.setText("Last Score: AC Milan");
                if ( a > b ) {
                    lblwin.setText("Winner: AC Milan");
                }
                else if ( a == b ){
                    lblwin.setText("Winner: DRAW");
                }
                else {
                    lblwin.setText("Winner: Real Madrid");
                }
            }
        }

        public class ButtonRealListener implements ActionListener{
            public void actionPerformed(ActionEvent e){
                b++;
                lblres.setText("Result: " + a + " x " + b);
                lblscor.setText("Last Score: Real Madrid");
                if ( a > b ) {
                    lblwin.setText("Winner: AC Milan");
                }
                else if ( a == b ){
                    lblwin.setText("Winner: DRAW");
                }
                else {
                    lblwin.setText("Winner: Real Madrid");
                }
            }
        }

}
