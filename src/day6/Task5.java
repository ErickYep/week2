package day6;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        //returning all powers of 2 in the area length
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of list :");
        int length = scanner.nextInt();
        int i = 1;
        while (i <= length) {
            System.out.println(i);
            i *=2;
        }
    }
}
