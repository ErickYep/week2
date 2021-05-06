package Day6;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter the number which factorial you want to calculate:");
            if (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("invalid Value");
                continue;
            } else
              number = scanner.nextInt();
            int factorial = 1;
            if (number == 1)
                System.out.println("answer is 1");
            else {
                for (int i = 1; i <= number; i++) {
                    factorial *= i;
                }
                System.out.println("Answer is " + factorial);
            }
        }while(true);
    }
}
