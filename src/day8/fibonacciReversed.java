package day8;

public class fibonacciReversed {
    public static void main(String[] args) {
        int [] fibonacci = new int[10];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
        for (int i = fibonacci.length-1; i >=0 ; i--) {
            System.out.println(fibonacci[i]);
        }
    }
}
