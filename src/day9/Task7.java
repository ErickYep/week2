package day9;

import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first matrix sizes :");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println("Enter the second matrix sizes :");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int matrix1[][] = new int[n][m];
        int matrix2[][] = new int[a][b];
        int matrixMultiple[][] = new int [n][b];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < matrixMultiple.length; i++) {
            for (int j = 0; j < matrixMultiple[i].length; j++) {
                for (int k = 0; k < matrix1[j].length; k++) {
                    matrixMultiple[i][j] += matrix1[i][k]*matrix2[k][j];
                }
            }
        }
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < matrixMultiple.length; i++) {
            for (int j = 0; j < matrixMultiple[i].length; j++) {
                System.out.print(matrixMultiple[i][j]);
            }
            System.out.println();
        }
    }
}
