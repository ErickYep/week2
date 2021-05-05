package day8;

import java.util.Arrays;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        //Rearrange the adjacent elements of the array
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length");
        int a = scanner.nextInt();
        int[] array = new int[a];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int temp = 0;
        if (array.length % 2 == 0) {
            for (int i = 0; i < array.length; i += 2) {
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        } else {
            for (int i = 0; i < array.length-1; i += 2) {
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
