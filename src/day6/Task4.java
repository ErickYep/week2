package day6;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        //finding the smallest natural divisor except 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number > 2 :");
        int number = scanner.nextInt();
        int i = 3;
        while(i <= number) {
            if (number % i == 0) {
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
