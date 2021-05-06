package day9;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many athletes we have :");
        int athletes = scanner.nextInt();
        System.out.println("How much attempt they have");
        int attempts = scanner.nextInt();
        int[][] matrix = new int[athletes][attempts];
        int sum1 = 0;
        int sum2 = 0;
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
                sum1 += matrix[i][j];
            }
            if(sum1>sum2){
                sum2 = sum1;
                index = i;
                sum1 = 0;
            }
        }
        System.out.println("line" + index);
        System.out.println("max is"+sum2);
    }
}
