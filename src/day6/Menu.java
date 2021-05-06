package Day6;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        //infinite loop while number != 3
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of circle:");
        int radius = scanner.nextInt();
        int number;
        first:
        do {
            System.out.println("- - - MENU - - -");
            System.out.println("Press 1 for Perimeter");
            System.out.println("Press 2 for Area");
            System.out.println("Press 3 for EXIT");
            if (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("invalid Value");
                continue;
            } else
                number = scanner.nextInt();
            switch (number) {
                case 1:
                    System.out.println("Perimeter is - " + (2 * Math.PI * radius));
                    break;
                case 2:
                    System.out.println("Area is - " + (Math.pow(radius, 2) * Math.PI));
                    break;
                case 3:
                    break first;
                default:
                    System.out.println("Invalid Value");

            }
        } while (true);
    }
}
