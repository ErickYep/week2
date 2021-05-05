package day8;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        //Print the value of the smallest of all positive elements in the list
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter array numbers");
            array[i] = scanner.nextInt();
        }
        int min = array[0];
        for (int i = 0; i < array.length; i += 2) {
            if(array[i]>0){
                if(array[i]<min)
                    min = array[i];
            }
        }
        System.out.println(min);
    }
}
