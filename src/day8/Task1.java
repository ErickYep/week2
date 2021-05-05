package day8;

public class Task1 {
    public static void main(String[] args) {
        int [] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
        }
        for (int i = 0; i < array.length; i += 2) {
            System.out.println(array[i]);
        }

    }
}
