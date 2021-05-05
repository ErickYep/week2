package day8;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        // Print the value of the largest element in the array,
        // and then the index of that element in the array
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        int max = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter array numbers");
            array[i] = scanner.nextInt();
        }
        for (int i = 1; i < array.length; i += 2) {
            if (array[i - 1] > array[i] && array[i - 1] > max) {
                max = array[i - 1];
                index = i - 1;
            } else if (array[i - 1] < array[i] && array[i - 1] < max) {
                max = array[i];
                index = i;
            }
        }
        System.out.println("Largest number is : " + max);
        System.out.println("index is : " + index);
    }
}
