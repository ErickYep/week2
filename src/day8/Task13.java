package day8;

import java.util.Arrays;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        //Swap the minimum and maximum elements of this list.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length");
        int a = scanner.nextInt();
        int[] array = new int[a];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter numbers");
            array[i] = scanner.nextInt();
        }
        int min = array[0];
        int maxIndex = 0;
        int max = 0;
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                maxIndex = i;
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        max = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = max;
        System.out.println(Arrays.toString(array));
    }
}
