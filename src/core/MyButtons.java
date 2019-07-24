package core;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class MyButtons extends JButton {
    /**
     * @param character this String in going to be shown on our button:)
     */
    public MyButtons(String character){
        super(character);
        setPreferredSize(new Dimension(50, 50));
        setBorder(new EmptyBorder(10,10,10,10));
        setBorderPainted(false);
        setFocusable(false);
        setBackground(Color.WHITE);
    }



}
