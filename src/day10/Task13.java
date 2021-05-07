package day10;

import java.util.Random;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        //Write a java program to rotate 2D matrix in 180 degrees
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter matrix size :");
        int size = scanner.nextInt();
        System.out.println("Press 1 if you want to rotate 90 degrees");
        System.out.println("Press 2 if you want to rotate 180 degrees");
        int choice = scanner.nextInt();
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

        switch(choice) {
            case 2:
            for (int i = 1; i <= size; i++) {
                for (int j = 1; j <= size; j++) {
                    rotateMatrix[size - i][size - j] = matrix[i - 1][j - 1];
                }
            }
            break;
            case 1:
                for (int i = 1; i <= size; i++) {
                    for (int j = 1; j <= size; j++) {
                        rotateMatrix[j-1][size-i] = matrix[i-1][j-1];
                    }
                }
                break;
            default:
                System.out.println("Illegal choice");
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(rotateMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}

