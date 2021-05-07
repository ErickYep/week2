package day6;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //Print all exact squares of natural numbers
        // that are not exceeding a given positive integer length
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of number list :");
        int length  = scanner.nextInt();
        int num = 0;
        int sum;
        do {
            num++;
            sum = num * num;
            System.out.println(sum);
        } while (sum < length);
    }
}

