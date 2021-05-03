package Day6;

public class Task10 {
    public static void main(String[] args) {
        // print the table of characters that are equivalent to the
        // Ascii codes from 32 to 122
        int count = 1;
        for (int i = 32; i <= 122; i++) {
            if (count % 10 == 0)
                System.out.println((char) i + " ");
            else
                System.out.print((char) i + " ");
            count++;
        }
    }
}
