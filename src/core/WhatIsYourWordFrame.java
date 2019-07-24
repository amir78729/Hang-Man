package core;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static core.Main.*;

public class WhatIsYourWordFrame extends JFrame implements ActionListener {

    private JLabel question;
    private JTextField nameArea;
    private JButton play;

    public WhatIsYourWordFrame(){
        super("welcome to \"HANGMAN\"! (x_x)");
        setSize(400 , 200);
        setLayout(new GridLayout(3,0));
        setLayout(new BorderLayout());
        setForeground(Color.black);
        question = new JLabel("What is your word?!");
        question.setFont(new Font("Bradley Hand ITC" , Font.BOLD , 25));
        question.setVerticalAlignment(JLabel.CENTER);
        question.setHorizontalAlignment(JLabel.CENTER);
        question.setForeground(new Color(200, 150, 0));
        question.setBackground(Color.black);

        JPanel questionPanel = new JPanel();
        questionPanel.setBackground(Color.black);
        questionPanel.add(question);

        nameArea = new JTextField(16);
        nameArea.setBorder(new EmptyBorder(0,0,0,0));
        nameArea.setBackground(Color.black);
        nameArea.setForeground(Color.red);
        nameArea.setHorizontalAlignment(JLabel.CENTER);
        nameArea.setFont(new Font("Bradley Hand ITC" , Font.BOLD , 50));


        play = new JButton("PLAY!");
        play.setBorder(new EmptyBorder(10, 10, 10, 10));
        play.setFont(new Font("Bradley Hand ITC" , Font.BOLD , 25));
        play.setForeground(Color.white);
        play.setBackground(Color.black);
        play.setFocusable(false);
        play.setBorderPainted(false);
        play.addActionListener(this);

        JPanel nameAreaPanel = new JPanel(new BorderLayout());
        nameAreaPanel.add(nameArea, BorderLayout.CENTER);

        add(questionPanel , BorderLayout.NORTH);
        add(nameAreaPanel, BorderLayout.CENTER);
        add(play, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==play){
            myWord = nameArea.getText();
            myWord = myWord.toUpperCase();
            guess= new char[myWord.length()];
            wrongAnswers = 0;
            correctAnswers = 0;

            for (int i = 0; i < myWord.length(); i++)
                guess[i] = '_' ;

            JFrame frame = new MyFrame();
            this.dispose();
        }
    }
}
