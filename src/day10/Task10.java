package day10;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        //Create a two-dimensional array A [n] [m],
        // fill it with the multiplication table A [i] [j] = i * j
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number :");
        int num2 = scanner.nextInt();
        int[][] matrix = new int[num1][num2];
        int j = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            if (i+1==matrix[i].length){
                matrix[j][i] = j*i;
                i=0;
                j++;

                if(j==matrix.length)
                    break;
                matrix[j][i] = j*i;
            }else
                matrix[j][i] = j*i;
        }
        for (int i = 0; i < num1; i++) {
            for (int k = 0; k < num2; k++) {
                System.out.print(matrix[i][k] + " ");
            }
            System.out.println();
        }

    }
}
