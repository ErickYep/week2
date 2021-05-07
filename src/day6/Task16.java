package day6;

import java.util.Random;
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        // guess the number
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(99) + 1;
        System.out.println("Guess number from 1-100");
        int userNumber = 0;
        while (randomNumber != userNumber) {
            userNumber = scanner.nextInt();
            if(userNumber>randomNumber)
                System.out.println("Too high");
            else if(userNumber<randomNumber)
                System.out.println("Too low");
        }
        System.out.println("Yes, you guessed the number");
    }
}
