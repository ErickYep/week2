package day8;

import java.util.Arrays;
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        //An array of integers is given. It is required to “compress” it
        // by moving all non-zero elements to the left side of the array
        //  without changing their order, and all zeros to the right side
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length");
        int a = scanner.nextInt();
        int[] array = new int[a];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter numbers");
            array[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 0){
                count++;
            }else if(count !=0){
                array[i-count] = array[i];
                array[i] = 0;
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(array));
    }
}
