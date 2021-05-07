package day7;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //Print all numbers on the segment from a to b that are exact squares
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter start of your range :");
        int start = scanner.nextInt();
        System.out.println("Enter end of your range");
        int end = scanner.nextInt();
        int number = 1;
        for (int i = start; i <= end; i++) {
            if (number * number > start && number * number < end)
                System.out.println(number*number);
            else if(number*number>end)
                break;
            number++;
        }
    }
}
