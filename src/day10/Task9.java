package day10;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number :");
        int number = scanner.nextInt();
        int count;
        while (number > 1) {
            for (count = 2; count <= number; count++) {
                if (number % count == 0.0) {
                    break;
                }
            }
            number /= count;
            System.out.print(count);
            if (number > 1) System.out.print("*");
        }
    }
}
