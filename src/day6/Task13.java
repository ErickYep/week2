package day6;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        //running calculator
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much km athlete run :");
        int km =scanner.nextInt();
        System.out.println("How much he/she wants to run");
        int km1 = scanner.nextInt();
        int days;
        for (int i = 0;; i++) {
            km *=1.1;
            days = i;
            if(km == km1)
                break;
        }
        System.out.println(days);
    }
}
