package day7;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Length of your sum :");
        int temp = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < temp; i++) {
            System.out.println("Enter number " + (i+1));
            sum += scanner.nextInt();
        }
        System.out.println(sum);
    }
}
