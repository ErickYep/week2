package day7;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        //GNCHE-1 emulator
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the count number");
        int num = scanner.nextInt();
        int temp = 1;
        int count = 0;
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println(temp);
                count++;
                if (count == num) {
                    break;
                }
            }
            if (count == num) {
                break;
            }
            temp++;
        }
    }
}
