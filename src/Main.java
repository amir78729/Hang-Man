import javax.swing.*;

public class Main {
    public static String myWord;
    public static boolean isDead;
    public static char[] guess;
    public static void main(String[] args) {
        JFrame frame = new MyFrame();
        myWord = "hangman";
        isDead = false;
        guess= new char[myWord.length()];
        for (int i = 0; i < myWord.length(); i++)
            guess[i] = '_' ;

    }





    public static void printTheGuess(){
        for (int i = 0; i < myWord.length(); i++)
            System.out.print(guess[i] + " ");
    }
}
