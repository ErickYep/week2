package day10;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
//        Determine how many hours and minutes the digital clock will show at this moment
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter minutes :");
        int time = scanner.nextInt();
        int minutes = time % 60;
        int hours = time / 60;
        int days = hours / 24;
        if (days != 0)
            System.out.print(days + "Day || ");

        if (hours != 0)
            System.out.print((hours-days*24) + " Hour || ");

        if (minutes != 0)
            System.out.println(minutes + " Minutes");
    }
}
