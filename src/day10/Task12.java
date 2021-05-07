package day10;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        //filling array from end of previous fill
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter matrix row :");
        int row = scanner.nextInt();
        System.out.println("Enter matrix column :");
        int col = scanner.nextInt();
        int[][] matrix = new int[row][col];
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            if(i % 2 != 0)
                for (int j = matrix[i].length-1; j >= 0 ; j--) {
                    matrix[i][j] = count;
                    count++;
                }
            else
                for (int j = 0; j <matrix[i].length ; j++) {
                    matrix[i][j] = count;
                    count++;
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
