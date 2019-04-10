package LabRab.Number5exmp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EasyLVL extends JFrame {
    private JButton button = new JButton("Press");
    private JTextField input = new JTextField("", 6);
    private JLabel label = new JLabel("Input:");
    public EasyLVL()
    {
        super("Example");
        this.setBounds(100,100,250,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,2,2,2));
        container.add(label);
        container.add(input);
        /*ActionListener actlist = new ButtonEventListener();
        button.addActionListener(actlist);*/
        button.addActionListener(new ButtonEventListener());
        container.add(button);
    }
    public class ButtonEventListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String message = "";
            message += "Button was pressed";
            message += "Text is " + input.getText() + "\n";
            JOptionPane.showMessageDialog(null,message,"Output",JOptionPane.PLAIN_MESSAGE);
        }
    }
}
