package Day6;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        //Print all integer numbers from 1 to count, except that are multiple of 3
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int count = scanner.nextInt();
        for (int i = 1; i < count; i++) {
            if (i % 3 != 0)
                System.out.println(i);
        }
    }
}
