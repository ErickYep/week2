package day7;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        //printing triangles
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size :");
        int number = scanner.nextInt();
        System.out.println("a)");
        for (int j = 0; j < number; j++) {
            for (int i = 0; i <= j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("b)");
        for (int j = number; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("c)");
        for (int i = number-1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = number -1; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("d)");
        for (int i = 0; i <= number-1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <number ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
