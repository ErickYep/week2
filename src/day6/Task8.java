package day6;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {
        //finding power of 2
        //first version
        /*boolean bool = false;
        int count = 0;
        int number = 0;
        while(!bool) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your number :");
            number = scanner.nextInt();
            bool = powerOf2(number);
            count++;
        }
        System.out.println(number);
        System.out.println(count);*/


        //second version
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        first:while (true) {
            System.out.println("Enter your number :");
             int number = scanner.nextInt();
            int temp = number;
            while (temp > 1){
                if (temp % 2 == 0) {
                    if (temp / 2 == 1) {
                        count++;
                        System.out.println(number);
                        System.out.println(count);
                        break first;
                    } else
                        temp /= 2;
                }else {
                    count++;
                    System.out.println("Wrong Number");
                    break;
                }
            }
        }
    }


    /*public static boolean powerOf2(int a) {
        int pow = 1;
        for (int i = 0; i < a; i++) {
            pow = pow * 2;
            if (pow == a) {
                System.out.println("Power of 2");
                return true;
            }
        }
        return false;
    }*/

}

