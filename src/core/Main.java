package core;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static String myWord;
    public static boolean isDead;
    public static char[] guess;
    public static char guessedChar;
    public static int wrongAnswers;
    public static int correctAnswers;
    public static WhatIsYourWordFrame start;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        start = new WhatIsYourWordFrame();
//        System.out.println("USER 1:\nWhat is your word?");
//        myWord = scanner.nextLine();
//        myWord = myWord.toUpperCase();
        isDead = false;
//        guess= new char[myWord.length()];
//        wrongAnswers = 0;
//        correctAnswers = 0;
//
//        for (int i = 0; i < myWord.length(); i++)
//            guess[i] = '_' ;

//        JFrame frame = new MyFrame();


//        while(!isDead){
//            System.out.println("USER 2\nGuess a character:");
//            guessedChar = scanner.next().charAt(0);
//            //if user's guess was true...
//            if(contains(myWord , guessedChar)){
//                boolean flag = false;
//                for(int i = 0; i < myWord.length(); i++) {
//                    if (myWord.charAt(i) == guessedChar) {
//                        guess[i] = guessedChar;
//                        correctAnswers++;
//                        if (correctAnswers >= myWord.length()) {
//                            System.out.println("congratulations!!");
//                            flag = true;
//                            break;
//                        }
//                    }
//                }
//                if (flag)
//                    break;
//            }
//            //if user's guess was false...
//            else{
//                wrongAnswers++;
//                if(wrongAnswers >= 6){
//                    System.out.println("YOU LOSE!");
//                    break;
//                }
//
//            }
//            printTheGuess();
//            System.out.println(toStringGuess());
//
//        }
    }





    public static void printTheGuess(){
        for (int i = 0; i < myWord.length(); i++)
            System.out.print(guess[i] + " ");
        System.out.println("");
        System.out.println("correct answers: " + correctAnswers + "/" + myWord.length());
        System.out.println("wrong answers: " + wrongAnswers + "/6");
    }

    public static String toStringGuess(){
        String guessResult = "";
        for (int i = 0; i < myWord.length(); i++)
            guessResult = guessResult + guess[i] + " ";
        return guessResult;
    }


    public static boolean contains(String str, char chr ) {
        for(int i = 0; i < str.length(); i++)
            if(str.charAt(i) == chr)
                return true;
        return false;
    }
}


