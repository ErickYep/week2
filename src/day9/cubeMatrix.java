package day9;

import java.util.Random;

public class cubeMatrix {
    public static void main(String[] args) {
        Random random = new Random();
        int[][][] cube = new int[10][10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    cube[i][j][k] = random.nextInt(10);
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube.length; j++) {
                if (i <= j)
                    sum += cube[i][i][j];
            }
        }
        System.out.println(sum);
    }
}
