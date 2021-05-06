package Day6;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        //bank calculator
        Scanner scanner = new Scanner(System.in);
        int year = 0;
        System.out.println("Enter your deposit :");
        int deposit = scanner.nextInt();
        System.out.println("Enter the fractional discard percent :");
        int percent = scanner.nextInt();
        System.out.println("How much you want :");
        int wantDeposit = scanner.nextInt();
        do {
            deposit = deposit * (100 + percent) / 100;
            year++;
        }while(wantDeposit>deposit);

        System.out.println(year);
    }
}
