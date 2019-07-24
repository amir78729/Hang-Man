import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    private JButton a = new MyButtons ("A");
    private JButton b = new MyButtons ("B");
    private JButton c = new MyButtons ("C");
    private JButton d = new MyButtons ("D");
    private JButton e = new MyButtons ("E");
    private JButton f = new MyButtons ("F");
    private JButton g = new MyButtons ("G");
    private JButton h = new MyButtons ("H");
    private JButton i = new MyButtons ("I");
    private JButton j = new MyButtons ("J");
    private JButton k = new MyButtons ("K");
    private JButton l = new MyButtons ("L");
    private JButton m = new MyButtons ("M");
    private JButton n = new MyButtons ("N");
    private JButton o = new MyButtons ("O");
    private JButton p = new MyButtons ("P");
    private JButton q = new MyButtons ("Q");
    private JButton r = new MyButtons ("R");
    private JButton s = new MyButtons ("S");
    private JButton t = new MyButtons ("T");
    private JButton u = new MyButtons ("U");
    private JButton v = new MyButtons ("V");
    private JButton w = new MyButtons ("W");
    private JButton x = new MyButtons ("X");
    private JButton y = new MyButtons ("Y");
    private JButton z = new MyButtons ("Z");

    public MyFrame(){
        super("HANGMAN x_x");
        setLayout(new BorderLayout());
        setSize(new Dimension(500, 500));
        JPanel buttonsPanel = new JPanel(new GridLayout(2, 13));
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

        add(buttonsPanel , BorderLayout.SOUTH);
        setVisible(true);
    }
}
