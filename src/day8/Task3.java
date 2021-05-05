package day8;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = new int[5];
        for (int i = 0; i <array.length ; i++) {
            System.out.println("Enter array numbers");
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i] > 0)
            System.out.println(array[i]);
        }
    }
}
