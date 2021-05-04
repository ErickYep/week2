package Day7;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        //Write a program that prompts user for the size
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number :");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print("#");
            }
            if (i == 0)
                System.out.print("     " + number + "*" + number);
            System.out.println();
        }
    }
}
