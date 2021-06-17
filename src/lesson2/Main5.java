package lesson2;


import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {

        int a = 4;
        // формула создания ссылочного типа
        // 1 - тип переменной
        // 2 - название переменной
        // 3 - = new
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую сторону треугольника: ");
        int inputA = scanner.nextInt();

        System.out.println("Введите вторую сторону треугольника: ");
        int inputB = scanner.nextInt();

        System.out.println("Введите третью сторону треугольника: ");
        int inputС = scanner.nextInt();

        System.out.println("Периметр треугольника: " + (inputA + inputB + inputС));

        double p = (inputA + inputB + inputС) / 2;
        double s = Math.sqrt(p*(p - inputA) * (p - inputB) * (p - inputС));
        System.out.println("Площадь треугольника: " + s);

    }
}
