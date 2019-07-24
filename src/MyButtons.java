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

    /**
     * this methid is going to call when the user choose a character in the frame
     * @param isTheAnswerCorrect
     */
    public void changeColour(boolean isTheAnswerCorrect){
        //if your answer was TRUE...
        if(isTheAnswerCorrect){
            setBackground(new Color(0,90,0));
            setForeground(Color.white);
        }
        //if your answer was FALSE...
        else{
            setBackground(new Color(90,0,0));
            setForeground(Color.white);
        }
    }
}
