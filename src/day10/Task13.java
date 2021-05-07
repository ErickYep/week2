package day10;

import java.util.Random;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter matrix size :");
        int size = scanner.nextInt();
        int matrix[][] = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        int[][] rotateMatrix = new int[size][size];
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                rotateMatrix[size - i][size - j] = matrix[i-1][j-1];
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(rotateMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
