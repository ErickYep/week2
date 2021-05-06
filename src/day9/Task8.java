package day9;

import java.util.Random;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter matrix sizes :");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int matrix1[][] = new int[n][m];
        int matrix2[][] = new int[n][m];
        int matrixSum[][] = new int [n][m];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = random.nextInt(50);
                matrix2[i][j] = random.nextInt(50);
            }
        }
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrixSum[i][j] = matrix2[i][j] + matrix1[i][j];
                System.out.print(matrixSum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
