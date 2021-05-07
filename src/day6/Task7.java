package day6;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        //print all integers that are multiple of 2 in descending order
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of list :");
        int i = scanner.nextInt();
        while (i >= 0) {
            if (i % 2 == 0)
                System.out.println(i);
            i--;
        }
    }
}
