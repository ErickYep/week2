package day9;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many athletes we have :");
        int athletes = scanner.nextInt();
        System.out.println("How much attempt they have");
        int attempts = scanner.nextInt();
        int[][] matrix = new int[athletes][attempts];
        int max = 0;
        int column = 0;
        int index = 0;
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(i + " athlete");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Throw :" + j);
                matrix[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    index = i;
                    column = j;
                }
            }

        }
        System.out.println(max);
        System.out.println(index + " " + column);
    }
}
