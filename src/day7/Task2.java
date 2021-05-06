package Day7;

import java.util.Scanner;

public class Task2 {
        public static void main(String[] args) {
        //Print all numbers on the segment from a to b
        //that give the remainder of c when divided by d
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter start of your range :");
        int start = scanner.nextInt();
        System.out.println("Enter end of your range");
        int end = scanner.nextInt();
        System.out.println("Enter your remainder :");
        int remainder = scanner.nextInt();
        System.out.println("Enter your number to divide :");
        int divide = scanner.nextInt();
        for (; start <= end; ) {
            if (start % divide != remainder)
                start++;
            else {
                System.out.println(start);
                start += divide;
            }
        }
    }
}
