package day8;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        //Remove the element with index k from the list by moving
        // all elements to the right of the element with index k to the left.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length");
        int a = scanner.nextInt();
        int[] array = new int[a+1];
        for (int i = 1; i < array.length; i++) {
            System.out.println("Enter numbers");
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter index which you want to delete");
        int index = scanner.nextInt() + 1;
        array[0] = array[index];
        for (int i = index; i > 1; i--) {
            array[i] = array[i-1];
        }
        for (int i = 2; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
