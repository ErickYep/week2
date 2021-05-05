package day8;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        //Determine how many different elements are in it.
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter array numbers");
            array[i] = scanner.nextInt();
        }
        int count = 1;
        int number = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] != number){
                number = array[i];
                count++;
            }

        }
        System.out.println(count);
    }
}
