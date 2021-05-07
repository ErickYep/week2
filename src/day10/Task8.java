package day10;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        //Print the n-th term of a geometric progression
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number of geometric progression :");
        double firstValue = scanner.nextInt();
        System.out.println("Enter the denominator of the geometric progression");
        int denominator = scanner.nextInt();
        System.out.println("Which term do you want :");
        int number = scanner.nextInt();
        for (int i = 0; i < number-1; i++) {
            firstValue *= denominator;
        }
        System.out.println(firstValue);
    }
}
