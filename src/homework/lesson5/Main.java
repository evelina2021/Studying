package homework.lesson5;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        char[][] massiv = new char[10][10];

        for (int x = 0; x < 10; x++) {
            int randomRowX = ThreadLocalRandom.current().nextInt(0, massiv.length);
            int randomColumnX = ThreadLocalRandom.current().nextInt(0, massiv[0].length);
            massiv[randomRowX][randomColumnX] = 'x';

            for (int y = 0; y < 10; y++) {
                int randomRowY = ThreadLocalRandom.current().nextInt(0, massiv.length);
                int randomColumnY = ThreadLocalRandom.current().nextInt(0, massiv[0].length);
                massiv[randomRowY][randomColumnY] = 'y';

                if (y==x) {
                    massiv[randomRowY][randomColumnY] = 'z';
                    int z = y;
                }else{
                    System.out.print("  ");
                }
            }
        }

        for (int x = 0; x < massiv.length; x++) {
            for (int y = 0; y < massiv[x].length; y++) {
                System.out.print(massiv[x][y] + " ");
            }
            System.out.println();

        }
    }
}
