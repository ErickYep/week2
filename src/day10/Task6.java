package day10;

import java.util.Locale;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your word :");
        String word = scanner.nextLine();
        word = word.toUpperCase();
//      word = Character.toString((char)(word.charAt(0)-32));
        String word1 =Character.toString(word.charAt(0));
        word = word.toLowerCase();
        for (int i = 1; i <word.length() ; i++) {
            word1 += Character.toString(word.charAt(i));
        }
        System.out.println(word1);
    }
}
