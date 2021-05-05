package day8;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        //in sorted array find number which is repeated n/2 times n is array length
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length");
        int a = scanner.nextInt();
        int[] array = new int[a];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter numbers");
            array[i] = scanner.nextInt();
        }
        System.out.println(array[array.length/2]);
    }
}
