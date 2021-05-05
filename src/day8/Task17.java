package day8;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        //check if the given array sorted.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length");
        int a = scanner.nextInt();
        int[] array = new int[a];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter numbers");
            array[i] = scanner.nextInt();
        }
        int Pos = 0;
        int Neg = 0;
        for (int i = 1; i <array.length ; i++) {
            if(array[i] >= array[i-1])
                Pos++;
            if(array[i] <= array[i-1])
                Neg++;
        }
        if(Pos == array.length - 1 ||Neg == array.length -1)
            System.out.println("Sorted list");
        else
            System.out.println("Unsorted list");
    }
}
