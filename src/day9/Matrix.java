package day9;

import java.util.Random;

public class Matrix {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matrix = new int[10][15];
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(55) + 50;
                sum += matrix[i][j];
            }
        }
        System.out.println(sum);
        int diagonalSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i <= j)
                    diagonalSum += matrix[i][j];
            }
        }
    }
}
