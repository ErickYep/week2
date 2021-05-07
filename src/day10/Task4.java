package day10;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number :");
        int number = scanner.nextInt();
        int count = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0)
                count++;
        }
        if (count > 2)
            System.out.println("It isn't prime number");
        else
            System.out.println("it's Prime number");
    }
}
