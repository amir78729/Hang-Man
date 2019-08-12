package core;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EndOfTheGameFrame extends JFrame implements ActionListener {

    private JLabel text;
    private JButton play;

    EndOfTheGameFrame(boolean isDead){
        super("Game Ended!");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400 , 200);
        setLayout(new GridLayout(3,0));
        setLayout(new BorderLayout());
        setForeground(Color.black);
        text = new JLabel();
        if(isDead)
            text.setText("You LOSE! x_x");
        else
            text.setText("You WON! ^_^");
        text.setFont(new Font("Bradley Hand ITC" , Font.BOLD , 40));
        text.setBorder(new EmptyBorder(10,0,0,0));
        text.setVerticalAlignment(JLabel.CENTER);
        text.setHorizontalAlignment(JLabel.CENTER);
        text.setForeground(new Color(200, 150, 0));
        text.setBackground(Color.black);

        JPanel textPanel = new JPanel(new BorderLayout());
        textPanel.setBackground(Color.black);
        textPanel.add(text , BorderLayout.CENTER);




        play = new JButton("Play Again!");
        play.setBorder(new EmptyBorder(10, 10, 10, 10));
        play.setFont(new Font("Bradley Hand ITC" , Font.BOLD , 25));
        play.setForeground(Color.red);
        play.setBackground(Color.black);
        play.setFocusable(false);
        play.setBorderPainted(false);
        play.addActionListener(this);



        add(textPanel , BorderLayout.CENTER);
        add(play, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==play){
            Main.start.closeGameFrame();
            Main.start = new WhatIsYourWordFrame();
            this.dispose();
        }
    }
}
