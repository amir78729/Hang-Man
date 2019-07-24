package core;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static core.Main.*;

public class MyFrame extends JFrame implements ActionListener {

    public MyButtons a;
    public MyButtons b;
    public MyButtons c;
    public MyButtons d;
    public MyButtons e;
    public MyButtons f;
    public MyButtons g;
    public MyButtons h;
    public MyButtons i;
    public MyButtons j;
    public MyButtons k;
    public MyButtons l;
    public MyButtons m;
    public MyButtons n;
    public MyButtons o;
    public MyButtons p;
    public MyButtons q;
    public MyButtons r;
    public MyButtons s;
    public MyButtons t;
    public MyButtons u;
    public MyButtons v;
    public MyButtons w;
    public MyButtons x;
    public MyButtons y;
    public MyButtons z;
    JLabel textLabel = new JLabel();
    String guessInFrame;

    public MyFrame(){
        super("HANGMAN x_x");
        guessInFrame = "HANGMAN";
        setLayout(new BorderLayout());
        setSize(new Dimension(500, 500));
        JPanel buttonsPanel = new JPanel(new GridLayout(2, 13));


        a = new MyButtons ("A");
        b = new MyButtons ("B");
        c = new MyButtons ("C");
        d = new MyButtons ("D");
        e = new MyButtons ("E");
        f = new MyButtons ("F");
        g = new MyButtons ("G");
        h = new MyButtons ("H");
        i = new MyButtons ("I");
        j = new MyButtons ("J");
        k = new MyButtons ("K");
        l = new MyButtons ("L");
        m = new MyButtons ("M");
        n = new MyButtons ("N");
        o = new MyButtons ("O");
        p = new MyButtons ("P");
        q = new MyButtons ("Q");
        r = new MyButtons ("R");
        s = new MyButtons ("S");
        t = new MyButtons ("T");
        u = new MyButtons ("U");
        v = new MyButtons ("V");
        w = new MyButtons ("W");
        x = new MyButtons ("X");
        y = new MyButtons ("Y");
        z = new MyButtons ("Z");

        System.out.println(a.getChar());

        a.addActionListener(this);
        b.addActionListener(this);
        c.addActionListener(this);
        d.addActionListener(this);
        e.addActionListener(this);
        f.addActionListener(this);
        g.addActionListener(this);
        h.addActionListener(this);
        i.addActionListener(this);
        j.addActionListener(this);
        k.addActionListener(this);
        l.addActionListener(this);
        m.addActionListener(this);
        n.addActionListener(this);
        o.addActionListener(this);
        p.addActionListener(this);
        q.addActionListener(this);
        r.addActionListener(this);
        s.addActionListener(this);
        t.addActionListener(this);
        u.addActionListener(this);
        v.addActionListener(this);
        w.addActionListener(this);
        x.addActionListener(this);
        y.addActionListener(this);
        z.addActionListener(this);


        buttonsPanel.add(a);
        buttonsPanel.add(b);
        buttonsPanel.add(c);
        buttonsPanel.add(d);
        buttonsPanel.add(e);
        buttonsPanel.add(f);
        buttonsPanel.add(g);
        buttonsPanel.add(h);
        buttonsPanel.add(i);
        buttonsPanel.add(j);
        buttonsPanel.add(k);
        buttonsPanel.add(l);
        buttonsPanel.add(m);
        buttonsPanel.add(n);
        buttonsPanel.add(o);
        buttonsPanel.add(p);
        buttonsPanel.add(q);
        buttonsPanel.add(r);
        buttonsPanel.add(s);
        buttonsPanel.add(t);
        buttonsPanel.add(u);
        buttonsPanel.add(v);
        buttonsPanel.add(w);
        buttonsPanel.add(x);
        buttonsPanel.add(y);
        buttonsPanel.add(z);

        textLabel.setHorizontalAlignment(JLabel.CENTER);
        textLabel.setText(Main.toStringGuess());

        add(buttonsPanel , BorderLayout.SOUTH);
        add(textLabel , BorderLayout.NORTH);
        setVisible(true);
    }


    /**
     * this methid is going to call when the user choose a character in the frame
     * @param isTheAnswerCorrect
     */
    public void press(MyButtons button,  boolean isTheAnswerCorrect){
        System.out.println("button pressed");
        //if your answer was TRUE...
        if(isTheAnswerCorrect){
            button.setBackground(new Color(0,150,0));
            button.setForeground(Color.white);
            System.out.println("TRUE guess");
            //////////////////
            boolean flag = false;
            for(int i = 0; i < guessInFrame.length(); i++) {//check
                if (guessInFrame.charAt(i) == button.getChar()) {
                    guess[i] = button.getChar();
                    correctAnswers++;
                    if (correctAnswers >= guessInFrame.length()) {
                        textLabel.setText(Main.toStringGuess());
                        Main.printTheGuess();
                        System.out.println("congratulations!!");
                        disableAllButtons();
                        flag = true;
                        break;
                    }
                }
            }
            if (flag)
                return;
        //////////////////
        }
        //if your answer was FALSE...
        else{
            button.setBackground(new Color(150,0,0));
            button.setForeground(Color.white);
            System.out.println("FALSE guess");
        ///////////////////////
            wrongAnswers++;
            if(wrongAnswers >= 6){
                System.out.println("YOU LOSE!");
                disableAllButtons();
                return;
            }
        ///////////////////////
        }
        button.setEnabled(false);
        Main.printTheGuess();
        textLabel.setText(Main.toStringGuess());
//        textLabel.setVisible(false);
//        textLabel.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == a){
            press( a , Main.contains(myWord , 'A'));
        }else if (event.getSource() == b){
            press( b , Main.contains(myWord , 'B'));
        }else if (event.getSource() == c){
            press( c , Main.contains(myWord , 'C'));
        }else if (event.getSource() == d){
            press( d , Main.contains(myWord , 'D'));
        }else if (event.getSource() == e){
            press( e , Main.contains(myWord , 'E'));
        }else if (event.getSource() == f){
            press( f , Main.contains(myWord , 'F'));
        }else if (event.getSource() == g){
            press( g , Main.contains(myWord , 'G'));
        }else if (event.getSource() == h){
            press( h , Main.contains(myWord , 'H'));
        }else if (event.getSource() == i){
            press( i , Main.contains(myWord , 'I'));
        }else if (event.getSource() == j){
            press( j , Main.contains(myWord , 'J'));
        }else if (event.getSource() == k){
            press( k , Main.contains(myWord , 'K'));
        }else if (event.getSource() == l){
            press( l , Main.contains(myWord , 'L'));
        }else if (event.getSource() == m){
            press( m , Main.contains(myWord , 'M'));
        }else if (event.getSource() == n){
            press( n , Main.contains(myWord , 'N'));
        }else if (event.getSource() == o){
            press( o , Main.contains(myWord , 'O'));
        }else if (event.getSource() == p){
            press( p , Main.contains(myWord , 'P'));
        }else if (event.getSource() == q){
            press( q , Main.contains(myWord , 'Q'));
        }else if (event.getSource() == r){
            press( r , Main.contains(myWord , 'R'));
        }else if (event.getSource() == s){
            press( s , Main.contains(myWord , 'S'));
        }else if (event.getSource() == t){
            press( t , Main.contains(myWord , 'T'));
        }else if (event.getSource() == u){
            press( u , Main.contains(myWord , 'U'));
        }else if (event.getSource() == v){
            press( v , Main.contains(myWord , 'V'));
        }else if (event.getSource() == w){
            press( w , Main.contains(myWord , 'W'));
        }else if (event.getSource() == x){
            press( x , Main.contains(myWord , 'X'));
        }else if (event.getSource() == y){
            press( y , Main.contains(myWord , 'Y'));
        }else if (event.getSource() == z){
            press( z , Main.contains(myWord , 'Z'));
        }
    }

    public void disableAllButtons(){
        a.setEnabled(false);
        b.setEnabled(false);
        c.setEnabled(false);
        d.setEnabled(false);
        e.setEnabled(false);
        f.setEnabled(false);
        g.setEnabled(false);
        h.setEnabled(false);
        i.setEnabled(false);
        j.setEnabled(false);
        k.setEnabled(false);
        l.setEnabled(false);
        m.setEnabled(false);
        n.setEnabled(false);
        o.setEnabled(false);
        p.setEnabled(false);
        q.setEnabled(false);
        r.setEnabled(false);
        s.setEnabled(false);
        t.setEnabled(false);
        u.setEnabled(false);
        v.setEnabled(false);
        w.setEnabled(false);
        x.setEnabled(false);
        y.setEnabled(false);
        z.setEnabled(false);
    }
}
