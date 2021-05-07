package day7;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        //multiplication table
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number :");
        int number = scanner.nextInt();
        System.out.print("*|");
        for (int i = 1; i <= number; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
        System.out.println("--------------------------------------------");
        for (int i = 1; i <= number; i++) {
            System.out.print(i + "|");
            for (int j = 1; j <= number; j++) {
                System.out.print(" " + j * i);
            }
            System.out.println();
        }
    }
}
