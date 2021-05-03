package Day6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        //print all integers in descending order
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of list :");
        int i = scanner.nextInt();
        while (i > 0) {
            System.out.println(i);
            i--;
        }
    }
}
