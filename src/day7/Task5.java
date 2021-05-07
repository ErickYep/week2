package day7;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        //Print the number consisting of the digits of the given number in reverse order.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number :");
        String number = scanner.next();
        int temp = number.length() -1;
        for (int i = number.length()-1; 0 <= i; i--) {
            if(number.charAt(temp) !='0')
                System.out.print(number.charAt(i));
            else
                temp--;
        }
    }
}
