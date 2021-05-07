package day10;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Calculate 2 to the power of N
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number from 1 to 15 :");
        int number = scanner.nextInt();
        System.out.println(Math.pow(2,number));
    }
}
