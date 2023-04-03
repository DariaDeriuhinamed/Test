package week2;

import java.io.IOException;
public class Guess2 {
    //example with if and else
    public static void main(String[] args) throws IOException {
        char ch, answer = 'K';
        System.out.println("Think about letter from A-Z.");
        System.out.println("Try to guess: ");
        ch = (char) System.in.read(); //чтение символа с клавиатуры
        if (ch == answer) System.out.println("*** Correct! ***");
        else System.out.println("...Sorry, you missed.");
    }
}
