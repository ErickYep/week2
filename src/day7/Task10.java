package day7;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        //Convert a natural number from binary to decimal
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Binary code :");
        String binaryString = scanner.next();
        int decimal = Integer.parseInt(binaryString, 2);
        if(binaryString.length()>10)
            System.out.println("Wrong binary code");
        else
            System.out.println(decimal);
    }
}
