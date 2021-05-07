package day10;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        //filling array from right to left in diagonal
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter matrix row :");
        int row = scanner.nextInt();
        System.out.println("Enter matrix column :");
        int col = scanner.nextInt();
        int[][] matrix = new int[row][col];
        int count = 0;
        for (int i = 0; i < matrix.length * matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                for (int k = 0; k <matrix[j].length; k++) {
                    if((j+k) == i){
                        matrix[j][k] = count;
                        count++;
                    }
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
