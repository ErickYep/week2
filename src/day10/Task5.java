package day10;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        //Print all four-digit numbers on the segment from A to B, the record of which is a palindrome.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number A :");
        int a = scanner.nextInt();
        System.out.println("Enter number B :");
        int b = scanner.nextInt();
        int temp;
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        } else if (a == b)
            System.out.println("numbers are equal");
        else {
            for (int i = a; i <= b; i++) {
                if (i / 1000 == i % 10)
                    if ((i / 100) % 10 == (i / 10) % 10)
                        System.out.println(i);
            }
        }
    }
}
