package day10;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number :");
        int num2 = scanner.nextInt();
        int [][] matrix = new int[num1][num2];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = i*j;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
