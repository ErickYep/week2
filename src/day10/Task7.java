package day10;

import java.util.Scanner;
import java.util.SortedMap;

public class Task7 {
    public static void main(String[] args) {
//        draw an NxN checkerboard where the top left is white. Designate white margins O, black margins X
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number :");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <number ; j++) {
                if((i+j) % 2 == 0)
                    System.out.print('O');
                else
                    System.out.print('X');
            }
            System.out.println();
        }
    }
}
