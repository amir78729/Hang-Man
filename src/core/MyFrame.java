package core;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    public JButton a;
    public JButton b;
    public JButton c;
    public JButton d;
    public JButton e;
    public JButton f;
    public JButton g;
    public JButton h;
    public JButton i;
    public JButton j;
    public JButton k;
    public JButton l;
    public JButton m;
    public JButton n;
    public JButton o;
    public JButton p;
    public JButton q;
    public JButton r;
    public JButton s;
    public JButton t;
    public JButton u;
    public JButton v;
    public JButton w;
    public JButton x;
    public JButton y;
    public JButton z;
    JLabel textLabel = new JLabel();

    public MyFrame(){
        super("HANGMAN x_x");
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
    public void press(JButton button,  boolean isTheAnswerCorrect){
        //if your answer was TRUE...
        if(isTheAnswerCorrect){
            button.setBackground(new Color(0,90,0));
            button.setForeground(Color.white);
        }
        //if your answer was FALSE...
        else{
            button.setBackground(new Color(90,0,0));
            button.setForeground(Color.white);
        }
        button.setEnabled(false);
//        textLabel.setVisible(false);
//        textLabel.setVisible(true);
        System.out.println("pressed");
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == a){
            press( a , Main.contains(Main.myWord , 'A'));
        }else if (event.getSource() == b){
            press( b , Main.contains(Main.myWord , 'B'));
        }else if (event.getSource() == c){
            press( c , Main.contains(Main.myWord , 'C'));
        }else if (event.getSource() == d){
            press( d , Main.contains(Main.myWord , 'D'));
        }else if (event.getSource() == e){
            press( e , Main.contains(Main.myWord , 'E'));
        }else if (event.getSource() == f){
            press( f , Main.contains(Main.myWord , 'F'));
        }else if (event.getSource() == g){
            press( g , Main.contains(Main.myWord , 'G'));
        }else if (event.getSource() == h){
            press( h , Main.contains(Main.myWord , 'H'));
        }else if (event.getSource() == i){
            press( i , Main.contains(Main.myWord , 'I'));
        }else if (event.getSource() == j){
            press( j , Main.contains(Main.myWord , 'J'));
        }else if (event.getSource() == k){
            press( k , Main.contains(Main.myWord , 'K'));
        }else if (event.getSource() == l){
            press( l , Main.contains(Main.myWord , 'L'));
        }else if (event.getSource() == m){
            press( m , Main.contains(Main.myWord , 'M'));
        }else if (event.getSource() == n){
            press( n , Main.contains(Main.myWord , 'N'));
        }else if (event.getSource() == o){
            press( o , Main.contains(Main.myWord , 'O'));
        }else if (event.getSource() == p){
            press( p , Main.contains(Main.myWord , 'P'));
        }else if (event.getSource() == q){
            press( q , Main.contains(Main.myWord , 'Q'));
        }else if (event.getSource() == r){
            press( r , Main.contains(Main.myWord , 'R'));
        }else if (event.getSource() == s){
            press( s , Main.contains(Main.myWord , 'S'));
        }else if (event.getSource() == t){
            press( t , Main.contains(Main.myWord , 'T'));
        }else if (event.getSource() == u){
            press( u , Main.contains(Main.myWord , 'U'));
        }else if (event.getSource() == v){
            press( v , Main.contains(Main.myWord , 'V'));
        }else if (event.getSource() == w){
            press( w , Main.contains(Main.myWord , 'W'));
        }else if (event.getSource() == x){
            press( x , Main.contains(Main.myWord , 'X'));
        }else if (event.getSource() == y){
            press( y , Main.contains(Main.myWord , 'Y'));
        }else if (event.getSource() == z){
            press( z , Main.contains(Main.myWord , 'Z'));
        }
    }
}
