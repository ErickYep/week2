package day8;

import java.util.Arrays;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        //Cycle the elements of the array to the right
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length");
        int a = scanner.nextInt();
        int[] array = new int[a];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter numbers");
            array[i] = scanner.nextInt();
        }
        int temp = array[0];
        array[0] = array[array.length -1];
        int temp1;
        for (int i = 1; i < array.length; i++) {
          temp1 = array[i];
          array[i] = temp;
          temp = temp1;
        }
        System.out.println(Arrays.toString(array));
    }
}
