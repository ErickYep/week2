package day7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number :");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            if(number % i == 0) {
                System.out.print(i+" ");
            }
        }
    }
}
