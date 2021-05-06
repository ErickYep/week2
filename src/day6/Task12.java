package Day6;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        //define what is the Fibonacci number is A, i.e  print such
        // number n that  φn=A.If A is not a Fibonacci number print -1.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number :");
        int number = scanner.nextInt();
        int a = 1;
        int b = 1;
        int c = 0;
        for (int i = 0;; i++) {
            c = a+b;
            b = a;
            a = c;
            if(c == number) {
                System.out.println(i+3);
                break;
            }
            else if(c>number) {
                System.out.println(-1);
                break;
            }
        }
    }
}
