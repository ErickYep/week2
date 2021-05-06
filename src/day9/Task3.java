package day9;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int factorial = 0;
        for (int i = 1; i < matrix.length; i++) {
            factorial+=i;
        }
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(i != j) {
                    if (matrix[i][j] == matrix[j][i])
                        count++;
                }
            }
        }
        if(factorial == count/2)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
