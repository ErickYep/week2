package Day7;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Print all even numbers from a given range
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter start of your range :");
        int start = scanner.nextInt();
        System.out.println("Enter end of your range");
        int end = scanner.nextInt();
        for (; start <= end; ) {
            if (start % 2 == 1)
                start++;
            else {
                System.out.println(start);
                start += 2;
            }
        }
    }
}
