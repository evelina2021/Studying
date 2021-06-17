package homework.lesson2;

import java.util.Scanner;

public class MySecondHomework {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваш возраст: ");
        int input = scanner.nextInt();


        if (input <= 10) {
            System.out.println("Вы ребёнок ");
        }else

        if (input <= 16) {
            System.out.println("Вы подросток ");
        }else

        if (input <= 20) {
            System.out.println("Вы тинейджер ");
        }else

        if (input <= 35) {
            System.out.println("Вы молодой ");
        }else

        if (input <= 55) {
            System.out.println("Вы среднего возраста ");
        }else

        if (input <= 75) {
            System.out.println("Вы пожилой ");
        }else

        if (input <= 90) {
            System.out.println("Вы старик ");
        }else

        if (input > 90) {
            System.out.println("Вы долгожитель ");
        }

    }

}
