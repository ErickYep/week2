package day8;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        //Print those elements of it that appear in the list only once
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length");
        int a = scanner.nextInt();
        int[] array = new int[a];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter numbers");
            array[i] = scanner.nextInt();
        }
        int temp = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && i != j)
                temp++;
            }
            if(temp == 0)
                System.out.println(array[i]);
            else
                temp = 0;
        }
    }
}
