package Day7;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        //Count how many zeros, positive numbers, negative numbers among the given N numbers.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number count :");
        int count = scanner.nextInt();
        int pos = 0;
        int neg = 0;
        int zero = 0;
        for (int i = 0; i < count; i++) {
            System.out.println("Enter the number");
            int N = scanner.nextInt();
            if (N > 0)
                pos++;
            else if (N < 0)
                neg++;
            else
                zero++;
        }
        System.out.println(zero);
        System.out.println(pos);
        System.out.println(neg);
    }
}
