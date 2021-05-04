package Day7;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number from 2 to 30000 :");
        int number = scanner.nextInt();
        for (int i = 2; i <= number; i++) {
            if(number % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
