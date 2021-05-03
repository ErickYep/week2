package Day6;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        // Compute the Sum of Digits
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number :");
        int number = scanner.nextInt();
        String data = String.valueOf(number);
        int digitSum = 0;
        for (int i = 0; i < data.length(); i++) {
            digitSum += number % 10;
            number /=10;
        }
        System.out.println(digitSum);
    }
}
