package day8;

public class dividor7 {
    public static void main(String[] args) {
        int [] data = new int[1000];
        for (int i = 0; i < data.length; i++) {
            data[i] = (i+1)*7;
        }
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i] + " ");
        }
    }
}
