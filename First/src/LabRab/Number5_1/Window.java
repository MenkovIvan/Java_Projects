package LabRab.Number5_1;

import javax.swing.*;


public class Window extends JFrame {
    private JLabel lbl = new JLabel();
  public  Window() {
      super("lab5" );
      this.setBounds(100,100,500,500);


      add(lbl);
      lbl.setIcon(new ImageIcon("C:\\Program Files\\kartinki_ovca.jpg") );
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }

}
