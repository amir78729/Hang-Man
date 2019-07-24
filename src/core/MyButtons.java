package core;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;

public class MyButtons extends JButton {
    /**
     * @param character this String in going to be shown on our button:)
     */
    private char aChar;
    public MyButtons(String character){
        super(character);
        aChar = character.charAt(0);
        setPreferredSize(new Dimension(50, 50));
        setBorder(new EmptyBorder(0,0,0,0));
        setBorderPainted(false);
        setFocusable(false);
        setBackground(Color.WHITE);
    }

    public char getChar(){
        return aChar;
    }


}
