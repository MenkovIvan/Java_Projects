package LabRab.Number5_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class Animation extends JFrame {
    private JLabel lbl = new JLabel();
    public Animation(){
        super("lab5" );
        this.setBounds(100,100,500,500);


        Container container = this.getContentPane();
        container.add(lbl);
            Timer timer = new Timer(6, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //System.out.println("hih");
                    lbl.setIcon(new ImageIcon("D:\\images\\number_1.jpg"));
                }
            });
        Timer timer2 = new Timer(8, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("aaa");
                lbl.setIcon(new ImageIcon("D:\\images\\number_2.jpg"));
            }
        });
        Timer timer3 = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("aaa");
                lbl.setIcon(new ImageIcon("D:\\images\\number_3.jpg"));
            }
        });
        Timer timer4 = new Timer(12, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("aaa");
                lbl.setIcon(new ImageIcon("D:\\images\\number_4.jpg"));
            }
        });
        Timer timer5 = new Timer(14, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("aaa");
                lbl.setIcon(new ImageIcon("D:\\images\\number_5.jpg"));
            }
        });//);
            /*lbl.setIcon(new ImageIcon("C:\\Program Files\\kartinki_ovca.jpg"));
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)*/
            timer.start();
            timer2.start();
            timer3.start();
            timer4.start();
            timer5.start();

        }
    }
