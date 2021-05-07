package day6;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int number;
        int max = 1;
        int beforeMax = 0;
        for (int i = 0; ; i++) {
            number = scanner.nextInt();
            if (number == 0)
                break;
            if (i == 0) {
                max = number;
            } else if (i == 1) {
                if (max > number) {
                    beforeMax = number;
                } else {
                    beforeMax = max;
                    max = number;
                }
            } else {
                if (number > beforeMax) {
                    if(number>max){
                        beforeMax = max;
                        max = number;
                    }else{
                        beforeMax = number;
                    }
                }

            }

        }
        System.out.println(beforeMax);

    }
}
