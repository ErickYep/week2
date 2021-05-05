package day8;

import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        //Rearrange the elements of this array in reverse order
        Scanner scanner = new Scanner(System.in);
        int [] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int temp = 0;
        int temp1 = array.length - 1;
        for (int i = 0; i < array.length/2; i++) {
           temp = array[i];
           array[i] = array[temp1];
           array[temp1] = temp;
           temp1--;
        }
        System.out.println(Arrays.toString(array));
    }
}
