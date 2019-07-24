import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static String myWord;
    public static boolean isDead;
    public static char[] guess;
    public static char guessedChar;

    public static void main(String[] args) {
//        JFrame frame = new MyFrame();
        Scanner scanner = new Scanner(System.in);
        System.out.println("USER 1:\nWhat is your word?");
        myWord = scanner.nextLine();
        isDead = false;
        guess= new char[myWord.length()];

        for (int i = 0; i < myWord.length(); i++)
            guess[i] = '_' ;

        while(!isDead){
            System.out.println("USER 2\nGuess a character:");
            guessedChar = scanner.next().charAt(0);
            System.out.println(contains(myWord , guessedChar));
        }
    }





    public static void printTheGuess(){
        for (int i = 0; i < myWord.length(); i++)
            System.out.print(guess[i] + " ");
    }


    public static boolean contains(String str, char chr ) {

        for(int i = 0; i < str.length(); i++)
            if(str.charAt(i) == chr)
                return true;
        return false;
    }
}


