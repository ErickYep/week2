package day7;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        //scanning password for missing letters,characters or numbers
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter your new password (At least 1 number,1 character[@#$]," +
                    "1 Head letter,1 letter and min length 6,max length 16) :");
            String password = scanner.nextLine();
            int character = 0;
            int letter = 0;
            int headLetter = 0;
            int number = 0;
            int size = 0;
            for (int i = 0; i < password.length(); i++) {
                if (password.length() > 5 && password.length() < 17) {
                    if (password.charAt(i) == 64 || password.charAt(i) == 35 || password.charAt(i) == 36)
                        character++;
                    else if (password.charAt(i) > 96 && password.charAt(i) < 123)
                        letter++;
                    else if (password.charAt(i) > 64 && password.charAt(i) < 91)
                        headLetter++;
                    else if (password.charAt(i) > 47 && password.charAt(i) < 58)
                        number++;
                } else {
                    size++;
                    break;
                }
            }
            if (size > 0)
                System.out.println("Invalid size");
            else if (character == 0)
                System.out.println("Character missing");
            else if (letter == 0)
                System.out.println("Letter missing");
            else if (headLetter == 0)
                System.out.println("Head letter missing");
            else if (number == 0)
                System.out.println("Number missing");
            else
                System.out.println("Valid");
        }while(true);
    }
}
