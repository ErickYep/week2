package day8;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        //Print the elements of the given list in reverse
        // order without changing the list itself
        Scanner scanner = new Scanner(System.in);
        int [] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = array.length-1; i >=0 ; i--) {
            System.out.println(array[i]);
        }
    }
}
