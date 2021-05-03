package Day6;

import java.util.Scanner;

public class hasNextIntFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            String number = scanner.next();

            int time = 0;
            for (int i = 0; i < number.length(); i++) {
                if ((int) number.charAt(i) >= 48 && (int) number.charAt(i) <= 57)
                    time += 1;
            }
            if (time == number.length())
                System.out.println(Integer.parseInt(number));
            else
                System.out.println("This isn't number");
        }while(true);
    }
}
