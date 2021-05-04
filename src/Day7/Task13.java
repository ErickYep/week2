package Day7;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        //.Input N natural number, print picture in size N*N
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number :");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
