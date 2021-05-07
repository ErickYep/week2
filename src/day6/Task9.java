package day6;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        //For a given natural N print the smallest integer k that`
        // Math.pow(2,k)≥N
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number - ");
        int number = scanner.nextInt();
        int pow2 = 2;
        int count = 1;
        while (number > pow2) {
            pow2 = pow2 * 2;
            count++;
        }
        System.out.println(count);
    }
}
